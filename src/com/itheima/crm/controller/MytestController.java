package com.itheima.crm.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.crm.mapper.MyTestMapper;
import com.itheima.crm.pojo.Person;
import com.itheima.crm.service.MyTestService;

@Controller
public class MytestController {
	@Autowired
	private MyTestService service;
	@Autowired
	private MyTestMapper mapper;
//	@ResponseBody
	@RequestMapping("hello")
	public String hello(){
		System.out.println("进入方法");
//		return "Hello World123";
		
		return "index";
	}
	@ResponseBody
	@RequestMapping("insert")
	public String hello2(){
		Person person = new Person();
//		INSERT INTO `person` VALUES ('qwer', 'zhangsan', 14, '2018-09-21 00:00:00', 'zhangsan');
		person.setId("333");
		person.setAge(15);
		person.setCreateTime(new Date());
		person.setName("lisi");
		person.setCreateBy("adfa");
		int i = service.insertPerson(person);
		return null;
	}
	
}
