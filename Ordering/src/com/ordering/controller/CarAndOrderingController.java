package com.ordering.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ordering.po.Car;
import com.ordering.po.CarVo;
import com.ordering.po.Menu;
import com.ordering.po.Orderdetail;
import com.ordering.po.Orders;
import com.ordering.po.OrdersVo;
import com.ordering.po.Shore;
import com.ordering.po.ShoreCustom;
import com.ordering.po.Shoretype;
import com.ordering.po.Type;
import com.ordering.service.MenuTypeService;
import com.ordering.service.OrderingService;
import com.ordering.service.ShoreService;

@Controller
@RequestMapping("/carAndOrder")
public class CarAndOrderingController {
	
	@Autowired
	private ShoreService shoreService;
	@Autowired
	private MenuTypeService menuTypeService;
	@Autowired
	private  OrderingService orderingService;
	
	
	//购买商品，下订单，一件商品直接下订单；
	@RequestMapping("/buyMenu")
	public String buyMenu(HttpServletRequest request,int menuid){
		//根据menuid查询菜式的价钱
		Menu menu=shoreService.selectByPrimaryKey(menuid);
		//将数据放到request域对象中去：
		request.setAttribute("menu",menu);
		
		//到填写订单信息页面;
		return "/WriteMessage";
	}
	
	//单件商品确认提交；
	@RequestMapping("/sure")
	public String sure(HttpServletRequest request,Orders orders,Orderdetail orderdetail){
		
		//设置订单提交的时间：
		Date date = new Date();
        java.sql.Date createtime =new java.sql.Date(date.getTime());
        orders.setCreatetime(createtime);

        //添加订单到数据库：
        orderingService.sure(orders);
        //添加订单详细到数据库：
        orderdetail.setOrderId(orders.getOrderid());
        orderdetail.setMenuNum(orders.getNumber());
        orderingService.confirm(orderdetail);
        
        request.setAttribute("orderid", orders.getOrderid());
        request.setAttribute("shoreid", orders.getShoreId());
		//到下订单成功的页面;
		return "/OrderSuccess";
	}
	
	//查看单件商品购买成功的详细信息：
	@RequestMapping("/seeOrder/{orderid}")
	public String seeOrder(HttpServletRequest request,@PathVariable("orderid")int orderid){
		
		//根据订单id进行多表查询，创建一个queryVo对象
		OrdersVo orders = orderingService.findOrderById(orderid);

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(orders.getCreatetime());
		
		request.setAttribute("dateString", dateString);
		request.setAttribute("orders", orders);
		
		//到订单详情页面;
		return "/ordertailView";
	}
	
	//添加到购物车：
	@RequestMapping("/addcar")
	public String addcar(HttpServletRequest request,int shoreid,int userid,int[] menuIdList){
		
		//取到checkbox的menuid,添加到购物车中
		for(int menuid:menuIdList){
			Car car=new Car();
			car.setUserId(userid);
			System.out.println(menuid);
			car.setMenuId(menuid);
			//插入数据
			orderingService.addcar(car);
		}
		
		//回到原本的商店页面：继续选择
		return toShore(shoreid, request);
	}
	
	//进入商家，观看该商家所有的菜式：
	@RequestMapping("/toShore/{shoreid}")
	public String toShore(@PathVariable("shoreid")int shoreid,HttpServletRequest request){
		//查询该商店：
		ShoreCustom shoreCustom=shoreService.selectShoreByPrimaryKey(shoreid);
		//查询所有的菜式类别：
		List<Type> typeList= menuTypeService.findAllType(shoreid);
		//查询商家所有的菜式：
		List<Menu> menuList=shoreService.selectAllMenu(shoreid);
		
		request.getSession().setAttribute("shore", shoreCustom);
		request.setAttribute("typeList", typeList);
		request.setAttribute("menuList", menuList);
		return "/buyMenu";
	}
	
	//查看我的购物车
	@RequestMapping("/mycar")
	public String mycar(int userid,HttpServletRequest request){
		
		//根据用户id查看购物车，以及购物车商品的信息
		List<CarVo> carList=orderingService.selectCarByUserid(userid);
		request.setAttribute("carList", carList);
		
		//到购物车页面
		return "/CarView";
	}
	
	//在购物车下单：
	@RequestMapping("/book")
	public String book(HttpServletRequest request,int[] caridLisr){
		//存放order的Id的集合
		List<Integer> oidList=new ArrayList<Integer>();
		//计算总价：
		int sum=0;
		//计算商品的数目
		int count=caridLisr.length;
		
		for(int carid:caridLisr){
			//根据carid 查找menuid
			CarVo carVo=orderingService.selectCarByCarid(carid);
			//根据car的menuid查找 menu
			//将menu的shore_id放 orders的shore_id 中
			
			//初始化order的信息；
			Orders order=new Orders();
			order.setShoreId(carVo.getMenu().getShoreId());
			order.setUserId(carVo.getUserId());
			order.setNumber(1);
			order.setPay(0);
			order.setStatu(0);
			order.setPhone("");
			order.setAddress("");
			order.setTotal(carVo.getMenu().getMenuprice());
			order.setUname("");
			Date date = new Date();
	        java.sql.Date createtime =new java.sql.Date(date.getTime());
	        order.setCreatetime(createtime);
			
			//总价
			sum=sum+carVo.getMenu().getMenuprice();
			//提交订单：
			orderingService.sure(order);
			//将订单id加入集合中
			oidList.add(order.getOrderid());
			
			//提交订单详细信息；
			Orderdetail orderdetail=new Orderdetail();
			orderdetail.setMenuId(carVo.getMenuId());
			orderdetail.setOrderId(order.getOrderid());
			orderdetail.setMenuNum(1);
			orderingService.confirm(orderdetail);
		}
		request.setAttribute("oidList", oidList);
		request.setAttribute("sum", sum);
		request.setAttribute("count", count);
		
		//到填写信息页面；
		return "/WriteMessage2";
	}
	
	//多件商品填写详细信息提交：
	@RequestMapping("/sure2")
	public String sure2(HttpServletRequest request,Orders orders,int[] oidList){
		
		//设置订单提交的时间：
		Date date = new Date();
        java.sql.Date createtime =new java.sql.Date(date.getTime());
        
        for(int orderid:oidList)
        {
        	orders.setOrderid(orderid);
        	orders.setCreatetime(createtime);
        	//更新订单：
        	orderingService.updateByPrimaryKeySelective(orders);
        }
        
		//到下订单成功的页面;
		return "/OrderSuccess2";
	}
	
	//到我的订单页面：
	@RequestMapping("/toMyOrder")
	public String toMyOrder(HttpServletRequest request,int userid){
		//通过用户id查询所有的订单消费记录
		List<OrdersVo> orderList=orderingService.findOrderByuserId(userid);

		request.setAttribute("orderList", orderList);
		//到我的订单界面;
		return "/MyOrdering";
	}
	
	
	//完成订单：
	@RequestMapping("/finishOrder")
	public String finishOrder(HttpServletRequest request,int orderid,int userid){
		
		//根据订单id,查询订单，修改订单已经完成
		Orders order=orderingService.selectByPrimaryKey(orderid);
		order.setStatu(1);
		orderingService.updateByPrimaryKeySelective(order);
		
		//通过用户id查询所有的订单消费记录
		List<OrdersVo> orderList=orderingService.findOrderByuserId(userid);

		request.setAttribute("orderList", orderList);
		//到我的订单界面;
		return "/MyOrdering";
	}
	
	//查看已经完成的订单：
	@RequestMapping("/findMyOrderByStatu1")
	public String findMyOrderByStatu1(HttpServletRequest request,int userid){
		//通过用户id查询所有的订单消费记录
		List<OrdersVo> orderList=orderingService.findMyOrderByStatu1(userid);
		
		request.setAttribute("orderList", orderList);
		//到我的订单界面;
		return "/MyOrdering";
	}
	
	//查看正在消费的订单：
	@RequestMapping("/findMyOrderByStatu2")
	public String findMyOrderByStatu2(HttpServletRequest request,int userid){
		//通过用户id查询所有的订单消费记录
		List<OrdersVo> orderList=orderingService.findMyOrderByStatu2(userid);
		
		request.setAttribute("orderList", orderList);
		//到我的订单界面;
		return "/MyOrdering";
	}
	
	//评价订单：
	@RequestMapping("/discussOrder")
	public String discussOrder(HttpServletRequest request,int orderid){
		//根据订单Id查询订单
		OrdersVo order=orderingService.findOrderById(orderid);
		//将订单放到域对象中
		request.setAttribute("order", order);
		//到评价订单界面;
		return "/discussView";
	}
	
	//评价订单提交：
	@RequestMapping("/discussSuccess")
	public String discussSuccess(HttpServletRequest request,Orders order){
		//根据订单Id查询订单
		orderingService.updateByPrimaryKeySelective(order);
		
		//到评价订单成功界面;
		return "/discussSuccess";
	}
}
