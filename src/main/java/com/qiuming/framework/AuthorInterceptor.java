package com.qiuming.framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AuthorInterceptor implements HandlerInterceptor {

	private static String STATIC_RESOURCE_PATH = "/static/";
	private static String STATIC_RESOURCE_SUFFIX = "-img;-jpeg;-png;-gif;-js;-html;";

	/**
	 * 请求页面渲染之后
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * controller中return 到渲染页面之间
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * 进入controller之前
	 * 
	 * @return false 请求结束
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println(request.getRequestURI());
		String uri = request.getRequestURI();
		String suffix = uri.substring(uri.lastIndexOf('.') > 0 ? uri.lastIndexOf('.') + 1 : uri.length());
		if (uri.indexOf(STATIC_RESOURCE_PATH) > 0) {
			return true;
		}
		if (STATIC_RESOURCE_SUFFIX.indexOf("-" + suffix + ";") > 0) {
			return true;
		}
		
		// TODO 登录验证
		
		
		return true;
	}

}
