package ru.manager.mvc.interceptors;

import ru.manager.mvc.HitCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GlobalInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	private HitCounter counter;
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
	
		counter.setHits(counter.getHits() + 1);
		System.out.println("Кол-во посещений: " + counter.getHits());
		return super.preHandle(request, response, handler);
	}

	
}
