package com.sonu.springboot.Controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TaskController {
	
	@GetMapping("/add")
    public String addition() {
        System.out.println("Going home...");
        return "addition";
    }
	@GetMapping("/myapp/addition")
	public String home(HttpServletRequest req,HttpServletResponse httpResponse) {
		HttpSession session = req.getSession();
		String number1=req.getParameter("number1");
		String number2=req.getParameter("number2");
		int number3 = Integer.parseInt(number1)+Integer.parseInt(number2);
		session.setAttribute("Result1", "Addition");
		session.setAttribute("Result2", number3);
		return "/final";
		
		
		
	}
	@GetMapping("/subtract")
    public String subtract() {
        System.out.println("Going home...");
        return "subtract";
    }
	@GetMapping("/myapp/subtraction")
	public String subtraction(HttpServletRequest req,HttpServletResponse httpResponse) {
		HttpSession session = req.getSession();
		String number1=req.getParameter("number1");
		String number2=req.getParameter("number2");
		int number3 = Integer.parseInt(number1)-Integer.parseInt(number2);
		session.setAttribute("Result1", "Subtraction");
		session.setAttribute("Result2", number3);
		return "/final";
		
		
		
	}
	@GetMapping("/division")
    public String division() {
        System.out.println("Going home...");
        return "division";
    }
	@GetMapping("/myapp/div")
	public String division(HttpServletRequest req,HttpServletResponse httpResponse) {
		HttpSession session = req.getSession();
		String number1=req.getParameter("number1");
		String number2=req.getParameter("number2");
		int number3 = Integer.parseInt(number1)/Integer.parseInt(number2);
		session.setAttribute("Result1", "Division");
		session.setAttribute("Result2", number3);
		return "/final";
		
		
		
	}
	@GetMapping("/random")
    public String random() {
        System.out.println("Going home...");
        return "random";
    }
	@GetMapping("/myapp/ran")
	public String random(HttpServletRequest req,HttpServletResponse httpResponse) {
		HttpSession session = req.getSession();
		int range=0;
		if(req.getParameter("count").equals("")) {
			 range=10;
		}
		else {
			String count=req.getParameter("count");
			int count2=Integer.parseInt(count);
			range=count2;
		}
		
		session.setAttribute("Result1", "Random Numbers");
		
		ArrayList<Integer> list= new ArrayList<>();
		
		
		for(int i=0 ;i<=range-1;i++) {
			Double num=Math.random();
			num=num*100;
			Integer r = num.intValue();
			list.add(r);
			
			
		}
		session.setAttribute("Result2", list);
		return "/final";
		
		
		
	}
}
