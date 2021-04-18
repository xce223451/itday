package com.itday.springitday.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("loginmain")
	public String loginmain() {
		return "loginmain";
	}
	@GetMapping("loginsucc")
	public String loginsucc() {
		return "to see this text you need to logged in!";
	}
}
