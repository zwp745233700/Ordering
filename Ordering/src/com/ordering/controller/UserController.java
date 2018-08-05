package com.ordering.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ordering.po.Shore;
import com.ordering.po.Shoretype;
import com.ordering.po.User;
import com.ordering.service.ShoreService;
import com.ordering.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private ShoreService shoreService;
	
	//到注册页面
	@RequestMapping("/toregister")
	public String toregister(){
		return "/register";
	}
	
	//提交注册
	@RequestMapping("/register")
	public String register(HttpServletRequest request,User user,String password1){
		//检查注册信息是否完整
		String error="";
		if("".equals(user.getAddress()) || "".equals(user.getMobile()) || "".equals(user.getPassword()) || "".equals(user.getRealname()) || "".equals(user.getUsername()))
		{	
			error="请完善个人信息";
			request.setAttribute("error", error);
			return "/register";
		}
		else{
			
			if(password1.equals(user.getPassword())){
				//检查用户名是否存在：
				if(userService.check(user.getUsername()))
				{
					error="用户名已存在，请重新注册";
					request.setAttribute("error", error);
					return "/register";
				}else{
					userService.insert(user);
					return "/login";
					
				}
			}else{
				//密码不一致：
				error="两次密码不一致,请重新注册";
				request.setAttribute("error", error);
				return "/register";
			}

		}
	}
	
	
	//用户登陆：
	@RequestMapping("/tologin")
	public String tologin(){
		return "/login";
	}
	
	//登陆提交：
	@RequestMapping("/login")
	public String login(HttpServletRequest request,User user){
		User loginUser=userService.selectByExample(user);
		if(loginUser!=null){
			String username=loginUser.getUsername();
			request.getSession().setAttribute("user",loginUser);
			request.getSession().setAttribute("USER",loginUser);
			request.getSession().setAttribute("username",username);

			
			//查询所有的商家类别：
			List<Shoretype> shoreTypeList=shoreService.selectAllType();
			//查询所有的商家：
			List<Shore> shoreList=shoreService.selectAllShore();
			request.setAttribute("shoreTypeList", shoreTypeList);
			request.setAttribute("shoreList", shoreList);
			
			//返回逻辑视图名：
			return "forward:/index.jsp"; 
		}else{
			String error="账号密码错误";
			request.setAttribute("error",error);
			return "/login";
		}
	}
	
	//退出登陆
	@RequestMapping("/logout")
	public String logout(HttpSession sesison) throws Exception{
		sesison.invalidate();
		return "forward:/index.jsp";	
		
	}
	
	//到订餐主页面
	@RequestMapping("/toOrderingView")
	public String toOrderingView(){
		//查询所有的商家类别：
		
		//产讯所有的商家：
		
		
		//到订餐主页面
		return "/register";
	}
}
