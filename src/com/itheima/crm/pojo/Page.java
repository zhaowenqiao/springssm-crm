package com.itheima.crm.pojo;

import java.util.List;

public class Page<T> {
    
	private int total;//总记录数
	private int page;//当前的页码
	private int size;//每页显示的行数
    private List<T> rows;//数据的列表
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
    
	
    
}
