package com.practise.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@GetMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		String t1 = request.getParameter("t1");
		String t2 = request.getParameter("t2");
		ModelAndView mv = new ModelAndView();

		if(t1.equals("giriraj1995") && t2.equals("Goal1234#")) {
			mv.setViewName("result.jsp");
			mv.addObject("userName", t1);
			return mv;
		}
			
		mv.setViewName("index.jsp");
		return mv;
	}
}
