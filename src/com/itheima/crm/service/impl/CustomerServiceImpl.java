package com.itheima.crm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import com.itheima.crm.mapper.CustomerMapper;
import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.Page;
import com.itheima.crm.pojo.QueryVo;
import com.itheima.crm.service.CustomerService;
import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing.Validation;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerMapper custommapper;
	@Override
	public Page<Customer> getCustomerList(QueryVo vo) {
		
		//首先接收controller传递的vo的数据 判断是否为空
		if(vo.getPage()==null)vo.setPage(1);//设置默认值
		if(vo.getRows()==null)vo.setRows(10);//设置默认值
		
		//计算
		vo.setStart((vo.getPage()-1)*vo.getRows());//设置开始的位置
		List<Customer> list = custommapper.getCustomerList(vo);
		
		//封装到分页的对象中
		Page<Customer> pageinfo = new Page<>();
		
		pageinfo.setPage(vo.getPage());
		pageinfo.setRows(list);
		pageinfo.setSize(vo.getRows());//每页显示的行数
		pageinfo.setTotal(custommapper.selectCount(vo));//总记录数
		return pageinfo;
	}
	@Override
	public Customer getCustomerById(Integer id) {
		Map<String, Object> map = new HashMap<>();
		map.put("cust_id", 42);
		map.put("cust_name", "云");
		List<Customer> list = custommapper.selectByMap(map );
		System.out.println(">>>>"+list);
		
		List<Integer> ids = new ArrayList<>();
		ids.add(24);
		ids.add(25);
		ids.add(26);
		ids.add(27);
		List<Customer> list2 = custommapper.selectList(ids );
		System.out.println(list2);
		
		
		return custommapper.getCustomerById(id);
	}
	@Override
	public void updateCustomer(Customer customer) {
		custommapper.updateCustomer(customer);
		
	}

}
