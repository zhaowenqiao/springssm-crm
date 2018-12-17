package com.itheima.crm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.crm.mapper.MyTestMapper;
import com.itheima.crm.pojo.Person;
import com.itheima.crm.service.MyTestService;

@Service
public class MyTestServiceImpl implements MyTestService{
	
	@Autowired
	private MyTestMapper mapper;

	@Override
//	@Transactional
	public int insertPerson(Person person) {
		mapper.insertPerson(person);
		
		int i = 1/0;
//		person.setId("123334");
		mapper.insertPerson(person);
		return 0;
	}
	
	
}
