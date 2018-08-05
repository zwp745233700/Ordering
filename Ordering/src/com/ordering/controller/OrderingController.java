package com.ordering.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ordering.po.Menu;
import com.ordering.po.MenuCustom;
import com.ordering.po.Shore;
import com.ordering.po.ShoreCustom;
import com.ordering.po.Shoretype;
import com.ordering.po.Type;
import com.ordering.service.MenuTypeService;
import com.ordering.service.OrderingService;
import com.ordering.service.ShoreService;

@Controller
@RequestMapping("/order")
public class OrderingController {
	
	@Autowired
	private ShoreService shoreService;
	@Autowired
	private MenuTypeService menuTypeService;

	
	//查看所有的商店
	@RequestMapping("/toOrderingView")
	public String toOrderingView(HttpServletRequest request){
		//查询所有的商家类别：
		List<Shoretype> shoreTypeList=shoreService.selectAllType();
		//查询所有的商家：
		List<Shore> shoreList=shoreService.selectAllShore();
		request.setAttribute("shoreTypeList", shoreTypeList);
		request.setAttribute("shoreList", shoreList);
		
		//到订餐主页面
		return "forward:/index.jsp";
	}
	
	//根据类别id查看所有的商店
	@RequestMapping(value="/findShoreByType/{shoretypeid}",method=RequestMethod.GET)
	public String findShoreByType(HttpServletRequest request,@PathVariable("shoretypeid")int shoretypeid){
		//查询所有的商家类别：
		List<Shoretype> shoreTypeList=shoreService.selectAllType();
		//根据类别id查询商家：
		List<Shore> shoreList=shoreService.findShoreByType(shoretypeid);
		
		request.setAttribute("shoreTypeList", shoreTypeList);
		request.setAttribute("shoreList", shoreList);
		
		//到订餐主页面
		return "forward:/index.jsp";
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
		modelAndView.setViewName("/buyMenu");
		return modelAndView;
	}
	
	
	//到菜式详情页面：
	@RequestMapping("/toSeeMenu/{menuid}")
	public ModelAndView toSeeMenu(@PathVariable("menuid")int menuid){
		
		//根据Id查询菜式,多表查询
		MenuCustom menu=shoreService.selectMenuById(menuid);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("menu", menu);
		modelAndView.setViewName("/SeeMenu");
		return modelAndView;
	}
	
}
