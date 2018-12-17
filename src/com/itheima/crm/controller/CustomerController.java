package com.itheima.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.crm.pojo.BaseDict;
import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.Page;
import com.itheima.crm.pojo.QueryVo;
import com.itheima.crm.service.BaseDictService;
import com.itheima.crm.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private BaseDictService baseDictService;
	
	@Autowired
	private CustomerService customerserivce;
	
	@RequestMapping("/customer/list")
	public String showCoustomer(Model model,QueryVo vo){
//		if(StringUtils.isNotBlank(vo.getCustName())){
//			try {
//				vo.setCustName(new String(vo.getCustName().getBytes("iso-8859-1"),"utf-8"));
//			} catch (UnsupportedEncodingException e) {
//				e.printStackTrace();
//			}
//		}
		//根据类型编码查询客户来源 客户级别 客户所属的行业
		//来源
		List<BaseDict> sourceList = baseDictService.getBaseDictList("002");
		//行业
		List<BaseDict> industryList = baseDictService.getBaseDictList("001");
		//级别
		List<BaseDict> levelList = baseDictService.getBaseDictList("006");
		//将数据传递给页面
		model.addAttribute("fromType", sourceList);
		model.addAttribute("industryType", industryList);
		model.addAttribute("levelType", levelList);
		
		//根据页面的查询的条件queryvo查询
		 Page<Customer> page = customerserivce.getCustomerList(vo);
		//传递到页面中
		 model.addAttribute("page", page);
		 
		 //数据回显
		 
		 model.addAttribute("custName", vo.getCustName());
		 model.addAttribute("custSource", vo.getCustSource());
		 model.addAttribute("custIndustry", vo.getCustIndustry());
		 model.addAttribute("custLevel", vo.getCustLevel());
		 
		return "customer";
	}
	
	//根据客户的ID 查询客户的信息
	
	@RequestMapping("/customer/edit")
	@ResponseBody//将对象转成JSON
	public Customer getCustomerById(Integer id){
		Customer customer = customerserivce.getCustomerById(id);
		return customer;
	}
	
	//更新
	//要求是一定是一个JSON格式的字符串
	@RequestMapping(value="/customer/update",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	//如果@responsebody 返回的是string 类型默认的contentType=是text/plain;
	//如果是对象，返回的contentType:就是application/json;utf-8
	public String updateCustomer(Customer customer){
		customerserivce.updateCustomer(customer);
		return "{\"name\":\"测试id\"}";
	}
}
