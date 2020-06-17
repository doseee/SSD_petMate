package com.ssd.petMate.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.petMate.service.UserImpl;

@Controller
@RequestMapping("/signIn")
public class LoginController {

	@Value("user/signIn")
	private String formViewName;
	@Value("index")
	private String successViewName;
		
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserImpl userService;
	
//	같은 url로 GET/POST 방식으로 나눠 handler method를 실행함
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView form(ModelAndView mv) {
		mv.addObject("loginCommand", new LoginCommand());
		mv.setViewName(formViewName);
		return mv;
	}
	
//	loginCommand 객체도 validation이 필요하기 때문에 @Valid가 필요
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@Valid LoginCommand loginCommand, BindingResult result, HttpServletRequest request) {
//		에러가 나면 폼으로 다시 이동
		if (result.hasErrors()) {
			return formViewName;
		}

//		try {
			UserDetails user = userService.loadUserByUsername(loginCommand.getUserID());
//			System.out.println(user.getAuthorities());
			if(!passwordEncoder.matches(loginCommand.getPwd(), user.getPassword())) {
				result.rejectValue("userID", "invalidIdOrPassword", "암호가 일치하지 않습니다.");
				return formViewName;
			}
//		}
//		catch (Exception e) {
//			result.reject("invalidIdOrPassword", new Object[] { loginCommand.getUserID() }, null);
//			System.out.println("Error!");
//			return formViewName;
//		}
		
//		로그인이 정상적으로 이루어졌으므로 session에 id 저장
		request.getSession().setAttribute("userID", loginCommand.getUserID());
		return "redirect:" + successViewName;
	}
}