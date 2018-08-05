package com.ordering.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import com.ordering.mapper.MenuMapper;
import com.ordering.po.Menu;
import com.ordering.po.OrdersVo;
import com.ordering.po.Shore;
import com.ordering.po.ShoreCustom;
import com.ordering.po.Shoretype;
import com.ordering.po.Type;
import com.ordering.po.User;
import com.ordering.service.MenuTypeService;
import com.ordering.service.OrderingService;
import com.ordering.service.ShoreService;
import com.ordering.util.UploadUtil;

@Controller
@RequestMapping("/shore")
public class ShoreController {
	//商家Controller
	
	@Autowired
	private ShoreService shoreService;
	@Autowired
	private MenuTypeService menuTypeService;
	@Autowired
	private  OrderingService orderingService;

	
	//到商家注册页面：
	@RequestMapping("/toshoreRegister")
	public String toshoreRegister(HttpServletRequest request){
		List<Shoretype> shoreTypeList=shoreService.selectAllType();
		
		request.setAttribute("shoreTypeList", shoreTypeList);
		return "/shoreRegisterView";
	}
	
	//商家注册提交：
	@RequestMapping("/shoreRegister")
	public String shoreRegister(HttpServletRequest request,Shore shore,String password1){
		//检查注册信息是否完整
		String error="";
		if("".equals(shore.getAddress()) || "".equals(shore.getPassword()) || "".equals(shore.getShorename()) || "".equals(shore.getUsername()))
		{	
			error="请完善商家信息";
			request.setAttribute("error", error);
			return this.toshoreRegister(request);
		}else{
			if(password1.equals(shore.getPassword()))
			{	//密码一致
				if(shoreService.check(shore.getUsername()))
				{
					//检查用户名是否存在：
					error="该登陆账号已存在，请重新注册";
					request.setAttribute("error", error);
					return this.toshoreRegister(request);
				}else{
					shoreService.insert(shore);
					return "/ShoreLogin";
				}
			}else{
				//密码不一致：
				error="密码不一致，请重新填写";
				request.setAttribute("error", error);
				return this.toshoreRegister(request);
			}
		}
	}
	
	//到商家登陆页面：
	@RequestMapping("/toShoreLogin")
	public String toShoreLogin(){
		return "/ShoreLogin";
	}
	
	//商家登陆提交：
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Shore shore){
		//查询用户：
		ShoreCustom loginShore=shoreService.selectShore(shore);
		if(loginShore!=null){
			request.getSession().setAttribute("MyShore",loginShore);
			//登陆成功：到商家个人页面：
			return "/ShoreMainView";
		}else{
			String error="账号密码错误";
			request.setAttribute("error",error);
			return "/ShoreLogin";
		}
	}
	
	//返回商家主页面：
	@RequestMapping("/backMain")
	public String backMain(){
		return "/ShoreMainView";
	}
	
	//到修改商家界面：
	@RequestMapping("/toUpdateShore")
	public String toUpdateShore(HttpServletRequest request){
		List<Shoretype> shoreTypeList=shoreService.selectAllType();
		
		request.setAttribute("shoreTypeList", shoreTypeList);
		return "/UpdateShore";
	}
	
	//修改提交：
	@RequestMapping("/UpdateShore")
	public String UpdateShore(HttpServletRequest request,Shore shore){
		//修改
		shoreService.updateShore(shore);
		//重新将用户放入session域
		ShoreCustom loginShore=shoreService.selectShoreById(shore);
		request.getSession().setAttribute("MyShore",loginShore);
		//返回商家主页：
		return "/ShoreMainView";
	}
	
	//到修改头像页面：
	@RequestMapping("/updShoreHead")
	public String updShoreHead(HttpServletRequest request){
		return "/updHeadView";
	}
	
	//修改头像提交：
	@RequestMapping("/updShoreImg")
	public String updShoreImg(HttpServletRequest request,Shore shore,MultipartFile ShoreImg) throws IllegalStateException, IOException{
		//原始名称
		String originalFilename=ShoreImg.getOriginalFilename();
		if(ShoreImg!=null && originalFilename!=null && originalFilename.length()>0)
		{
			//存储图片的物理路径
			String img_path="D:\\Ordering\\"+shore.getShoreid()+"\\headImg\\";
			String newFileName=UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			//新图片：
			File newFile=new File(img_path+newFileName);
			File file=new File(img_path);
			//目录存在，清空目录的图片
			if(file.exists())
			{	
				UploadUtil uploadUtil=new UploadUtil();
				uploadUtil.delDir(file);
			}
			//如果目录不存在，则创建目录
			if(!newFile.exists())
			{
				newFile.mkdirs();
			}
			
			//将内存中的数据写入磁盘
			ShoreImg.transferTo(newFile);
			
			//将新图片名称写到shore中
			String url=shore.getShoreid()+"\\headImg\\"+newFileName;
			shore.setShorepic(url);
			
			shoreService.updateShoreImg(shore);
			//重新将用户放入session域
			ShoreCustom loginShore=shoreService.selectShoreById(shore);
			request.getSession().setAttribute("MyShore",loginShore);
		}
		return "/updHeadView";
	}
	
	//到菜式分类页面：
	@RequestMapping("/toMeunType/{shoreid}")
	public ModelAndView toMeunType(@PathVariable("shoreid")int shoreid){
		
		//查询出该商家所有菜式的分类
		List<Type> typeList= menuTypeService.findAllType(shoreid);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("typeList", typeList);
		modelAndView.setViewName("/MenuType");;
		return modelAndView;
	}
	
	//添加类别提交：
	@RequestMapping("/addType")
	public ModelAndView addType(Type type){
		menuTypeService.addType(type);
		
		List<Type> typeList= menuTypeService.findAllType(type.getShoreId());
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("typeList", typeList);
		modelAndView.setViewName("/MenuType");;
		return modelAndView;
	}
	
	//删除类别：
	@RequestMapping("/delType")
	public ModelAndView delType(int typeid,int shoreid){
		
		menuTypeService.deleteByPrimaryKey(typeid);
		
		List<Type> typeList= menuTypeService.findAllType(shoreid);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("typeList", typeList);
		modelAndView.setViewName("/MenuType");;
		return modelAndView;
	}
	
	//修改类别提交：
	@RequestMapping("/updMenuType")
	public ModelAndView updMenuType(Type type){
		menuTypeService.updateByPrimaryKeySelective(type);
		
		List<Type> typeList= menuTypeService.findAllType(type.getShoreId());
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("typeList", typeList);
		modelAndView.setViewName("/MenuType");;
		return modelAndView;
	}
	
	//到添加菜单页面：
	@RequestMapping("/toAddMenu/{shoreid}")
	public ModelAndView toAddMenu(@PathVariable("shoreid")int shoreid){
		//查询所有的菜式类别：
		List<Type> typeList= menuTypeService.findAllType(shoreid);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("typeList", typeList);
		modelAndView.setViewName("/addMenu");;
		return modelAndView;
	}
	
	//添加菜单提交：
	@RequestMapping("/addMenu")
	public String addMenu(Menu menu,MultipartFile menuImg,HttpServletRequest request) throws IllegalStateException, IOException{
		shoreService.insertSelective(menu);
		
		//处理菜单图片：
		//原始名称
		String originalFilename=menuImg.getOriginalFilename();
		if(menuImg!=null && originalFilename!=null && originalFilename.length()>0)
		{
			//存储图片的物理路径
			String img_path="D:\\Ordering\\"+menu.getShoreId()+"\\menuImg\\"+menu.getMenuid()+"\\";
			String newFileName=UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			//新图片：
			File newFile=new File(img_path+newFileName);
			//如果目录不存在，则创建目录
			if(!newFile.exists())
			{
				newFile.mkdirs();
			}
			
			//将内存中的数据写入磁盘
			menuImg.transferTo(newFile);
			
			//将新图片名称写到shore中
			String url=menu.getShoreId()+"\\menuImg\\"+menu.getMenuid()+"\\"+newFileName;
			
			menu.setMenupic(url);
			//更新图片：
			shoreService.updateByPrimaryKeySelective(menu);
		}
		
		//查询用户所有的菜式：
		List<Menu> menuList=shoreService.selectByExample(menu);
		//查询所有的菜式类别：
		List<Type> typeList= menuTypeService.findAllType(menu.getShoreId());
		request.setAttribute("menuList", menuList);
		request.setAttribute("typeList", typeList);
		//回到主界面
		return "/MainMenu";
	}
	
	//到菜单主页面：
	@RequestMapping("/toMainMenu/{shoreid}")
	public ModelAndView toMainMenu(@PathVariable("shoreid")int shoreid){
		//查询所有的菜式类别：
		List<Type> typeList= menuTypeService.findAllType(shoreid);
		//查询商家所有的菜式：
		List<Menu> menuList=shoreService.selectAllMenu(shoreid);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("typeList", typeList);
		modelAndView.addObject("menuList", menuList);
		modelAndView.setViewName("/MainMenu");;
		return modelAndView;
	}
	
	//到根据类别查询菜式：
	@RequestMapping("/findMenuByType")
	public ModelAndView findMenuByType(int typeid,int shoreid){
		//查询所有的菜式类别：
		List<Type> typeList= menuTypeService.findAllType(shoreid);
		//根据类别查询所有的菜式：
		List<Menu> menuList=shoreService.findMenuByType(typeid);
		Type type=menuTypeService.selectByPrimaryKey(typeid);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("typeList", typeList);
		modelAndView.addObject("menuList", menuList);
		modelAndView.addObject("type", type);
		modelAndView.setViewName("/MainMenu");;
		return modelAndView;
	}
	
	//到更新菜式页面：
	@RequestMapping("/toUpdMenu/{menuid}")
	public ModelAndView toUpdMenu(@PathVariable("menuid")int menuid){
		
		//根据Id查询菜式
		Menu menu=shoreService.selectByPrimaryKey(menuid);
		//查询所有的菜式类别：
		List<Type> typeList= menuTypeService.findAllType(menu.getShoreId());

		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("menu", menu);
		modelAndView.addObject("typeList", typeList);
		modelAndView.setViewName("/UpdMenu");
		return modelAndView;
	}
	
	//修改菜单提交：
	@RequestMapping("/UpdMenu")
	public String UpdMenu(Menu menu,MultipartFile menuImg,HttpServletRequest request) throws IllegalStateException, IOException{
		//跟新菜单：
		shoreService.updateByPrimaryKeySelective(menu);
		
		//处理菜单图片：
		//原始名称
		String originalFilename=menuImg.getOriginalFilename();
		if(menuImg!=null && originalFilename!=null && originalFilename.length()>0)
		{
			//存储图片的物理路径
			String img_path="D:\\Ordering\\"+menu.getShoreId()+"\\menuImg\\"+menu.getMenuid()+"\\";
			String newFileName=UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			//新图片：
			File newFile=new File(img_path+newFileName);
			File file=new File(img_path);
			//目录存在，清空目录的图片
			if(file.exists())
			{	
				UploadUtil uploadUtil=new UploadUtil();
				uploadUtil.delDir(file);
			}
			//如果目录不存在，则创建目录
			if(!newFile.exists())
			{
				newFile.mkdirs();
			}
			
			//将内存中的数据写入磁盘
			menuImg.transferTo(newFile);
			
			//将新图片名称写到shore中
			String url=menu.getShoreId()+"\\menuImg\\"+menu.getMenuid()+"\\"+newFileName;
			
			menu.setMenupic(url);
			//更新图片：
			shoreService.updateByPrimaryKeySelective(menu);
		}
		
		//查询所有的菜式类别：
		List<Type> typeList= menuTypeService.findAllType(menu.getShoreId());
		//查询商家所有的菜式：
		List<Menu> menuList=shoreService.selectAllMenu(menu.getShoreId());
		
		request.setAttribute("menuList", menuList);
		request.setAttribute("typeList", typeList);
		//回到主界面
		return "/MainMenu";
	}
	
	//删除菜式：
	@RequestMapping("/delMenu")
	public ModelAndView delMenu(Menu menu){
		//删除该菜式
		shoreService.deleteByPrimaryKey(menu.getMenuid());
		
		List<Type> typeList= menuTypeService.findAllType(menu.getShoreId());
		List<Menu> menuList=shoreService.selectAllMenu(menu.getShoreId());
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("typeList", typeList);
		modelAndView.addObject("menuList", menuList);
		modelAndView.setViewName("/MainMenu");;
		return modelAndView;
	}
	
	//退出登陆
	@RequestMapping("/logout")
	public String logout(HttpSession sesison) throws Exception{
		sesison.invalidate();
		return "forward:/index.jsp";	
	}
	
	
	//商家查看评论
	@RequestMapping("/findDiscuss/{shoreid}")
	public ModelAndView findDiscuss(@PathVariable("shoreid")int shoreid){
		
		System.out.println("你好");
		//根据商店Id查看评论
		List<OrdersVo> orderList= orderingService.findOrderByShoreId(shoreid);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("orderList", orderList);
		
		//到观看评论页面
		modelAndView.setViewName("/shoreDiscussView");
		return modelAndView;
	}
	
	//用户查看评论
	@RequestMapping("/findDiscuss2/{shoreid}")
	public ModelAndView findDiscuss2(@PathVariable("shoreid")int shoreid){
		
		//根据商店Id查看评论
		List<OrdersVo> orderList= orderingService.findOrderByShoreId(shoreid);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("orderList", orderList);
		
		//到用户观看评论页面
		modelAndView.setViewName("/shoreDiscussView2");
		return modelAndView;
	}
	
	
	//商家查看订单：
	@RequestMapping("/showOrders/{shoreid}")
	public String showOrders(@PathVariable("shoreid")int shoreid,HttpServletRequest request){
		
		List<OrdersVo> orderList= orderingService.findOrderByShoreId(shoreid);
		
		request.setAttribute("orderList", orderList);
		
		return "/shoreOrdersView";
	}
	
	//商家查看订单详情：
	@RequestMapping("/showOrderdetail/{orderId}")
	public String showOrderdetail(@PathVariable("orderId")int orderId,HttpServletRequest request){
		
		OrdersVo orders=orderingService.findOrdertailByOrderid(orderId);
		
		request.setAttribute("orders", orders);
		
		return "showOrderdetailView";
		
	}
	//商家查看订单详情：
	@RequestMapping("/showMyOrderdetail/{orderId}")
	public String showMyOrderdetail(@PathVariable("orderId")int orderId,HttpServletRequest request){
		
		OrdersVo orders=orderingService.findOrdertailByOrderid(orderId);
		
		request.setAttribute("orders", orders);
		
		return "MyOrderdetailView";
		
	}
	
	
}
