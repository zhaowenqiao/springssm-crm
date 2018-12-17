package com.itheima.crm.pojo;

import java.util.Date;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Person {
	/*`id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
	  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
	  `age` int(11) NULL DEFAULT NULL,
	  `create_time` datetime NULL DEFAULT NULL,
	  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL*/
	 private String id;
	 private String name;
	 private int age;
	 private Date createTime;
	 private String createBy;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", createTime=" + createTime + ", createBy="
				+ createBy + "]";
	}
	 
	 
	
}
