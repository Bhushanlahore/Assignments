package com.listdemo;

import java.util.List;

public class Items {

	List<String> list;

	public Items() {
		
	}
	
	public Items(List<String> list) {
		super();
		this.list = list;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "[" + list + "]";
	}
	
	
}
