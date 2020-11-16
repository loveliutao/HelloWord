package com.hik;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajax")
public class MainContorl {

	@RequestMapping("/say")
	public String sayHello()
	{
		return "hello,Mr liutao!!";
	}
}
