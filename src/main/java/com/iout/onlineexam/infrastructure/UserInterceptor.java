package com.iout.onlineexam.infrastructure;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class UserInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object object) throws Exception {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String url = request.getRequestURI();
//		if (!(url.indexOf("css") != -1 || url.indexOf("js") != -1
//				|| url.indexOf("images") != -1 || url.indexOf("login") != -1)) {
//			Object userObj = request.getSession().getAttribute(
//					UserConstant.LOGIN_USER);
//			if (null == userObj) {
//				// 未登录
//				PrintWriter out = response.getWriter();
//				StringBuilder builder = new StringBuilder();
//				builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");
//				builder.append("alert(\"页面过期，请重新登录\");");
//				builder.append("window.top.location.href=\"/cdsxfsys/login/show\";</script>");
//				out.print(builder.toString());
//				out.close();
//				return false;
//			}
//		}
		return true;
	}

}
