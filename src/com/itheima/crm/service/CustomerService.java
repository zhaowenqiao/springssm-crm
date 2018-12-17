package com.itheima.crm.service;

import java.util.List;

import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.Page;
import com.itheima.crm.pojo.QueryVo;

public interface CustomerService {
	public Page<Customer> getCustomerList(QueryVo vo);

	public Customer getCustomerById(Integer id);

	public void updateCustomer(Customer customer);
}
