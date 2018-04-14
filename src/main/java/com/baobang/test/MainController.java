package com.baobang.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @author BaoBang
  * @Created Apr 14, 2018
  * 
  */
@RestController
public class MainController {
	
	@RequestMapping(value="/hello")
	public String hello() {
		return "hello Heroku";
	}

}
