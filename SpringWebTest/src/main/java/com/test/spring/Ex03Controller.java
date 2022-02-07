package com.test.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//JSP Model2의 서블릿(컨트롤러) 역할
@Controller
public class Ex03Controller {
	
	@RequestMapping(value="/ex03.do")
	public String call() {
	
		return "ex03";	
	}
	
	@RequestMapping(value="/ex03ok.do",method= {RequestMethod.GET})
	public String callok(
						HttpServletRequest req,
						//String name,
						//String age,
						//String address
						DTO dto,
						String color
						) {
		
//		DTO dto = new DTO();
//		dto.setName(name);
//		dto.setAge(age);
//		dto.setAddress(address);
		
		System.out.println(dto);
		System.out.println(color);
		
		return "ex03ok";
	}
	
}










