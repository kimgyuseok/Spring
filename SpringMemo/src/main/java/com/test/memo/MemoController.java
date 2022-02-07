package com.test.memo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemoController {
	
	@Autowired //의존 객체 변수에다 선언
	private IMemoService service; //Spring DI 발생
	
	
	@RequestMapping(value="/list.do", method={RequestMethod.GET})
	public String list(HttpServletRequest req) {
		
		//IMemoService service = new MemoService();
		
		List<MemoDTO> list = service.list();
				
		req.setAttribute("list", list);
		
		return "list";
	}
	
	@RequestMapping(value="/add.do", method={RequestMethod.GET})
	public String add() {
		
		return "add";
	}
	
	@RequestMapping(value="/addok.do", method={RequestMethod.POST})
	public void addok(HttpServletResponse resp, MemoDTO dto) { //1.
		
		//1. 데이터 가져오기
		//2. DB 작업 > insert > DAO(X), Service(O)
		
		//IMemoService service = new MemoService();
		
		int result = service.add(dto);
		
		try {
			if (result == 1) {
				resp.sendRedirect("/memo/list.do");
			} else {
				resp.sendRedirect("/memo/add.do");
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping(value="/edit.do", method={RequestMethod.GET})
	public String edit() {
		
		return "edit";
	}
	
	@RequestMapping(value="/editok.do", method={RequestMethod.POST})
	public void editok() {
		
		
	}
	
	@RequestMapping(value="/delok.do", method={RequestMethod.POST})
	public void delook() {
		
		
	}
	
}












