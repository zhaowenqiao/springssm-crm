package com.itheima.crm.mapper;

import com.itheima.crm.pojo.Person;

public interface MyTestMapper {
	public String selectName(String  id);

	public void insertPerson(Person person);
}
