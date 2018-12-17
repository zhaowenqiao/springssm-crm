package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.pojo.BaseDict;

public interface BaseDictMapper {
	//根据类型编码（type_code）查询字典列表（客户来源列表 客户级别列表 客户所属的行业的列表）
	public List<BaseDict> getBaseDictList(String typeCode);
}
