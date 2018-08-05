package com.ordering.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//拦截器
public class LoginInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {	
		//获取请求的url
		String url=request.getRequestURI();
		
		if(url.indexOf("carAndOrder")!=-1){
			//如果进行购买或者购物车，拦截
			//判断session
			HttpSession session=request.getSession();
			//从session中取出用户身份信息：
			String username=(String) session.getAttribute("username");
			if(username!=null)
			{	//身份存在，放行
				return true;
			}else{
				//执行到这里，表示用户身份需要认证，跳转到登陆界面
				request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);	
				return false;
			}
		}
		return true;		
	}
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3) throws Exception {
	}
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
	}
}
