package com.itheima.crm.mapper;

import java.util.List;
import java.util.Map;

import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

public interface CustomerMapper {
	public List<Customer> getCustomerList(QueryVo vo);
	
	public Integer selectCount(QueryVo vo);
	
	public Customer getCustomerById(Integer id);
	
	public void updateCustomer(Customer customer);//根据ID 更新 里面必须有ID的值
	
	public List<Customer> selectByMap(Map<String, Object> map);
	
	public List<Customer> selectList(List<Integer> ids);
}
