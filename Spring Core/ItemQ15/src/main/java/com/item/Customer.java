package com.item;

public class Customer {
	
	private int custid;
	private String name;
	private Item item;
	
		
	public int getCustid() {
		return custid;
	}



	public void setCustid(int custid) {
		this.custid = custid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Item getItem() {
		return item;
	}



	public void setItem(Item item) {
		this.item = item;
	}


	public void name() {
		System.out.println("Customer Name: "+name);
	}
	
	public void show() {
		
		System.out.println("Item No: "+item.getItemid());
		System.out.println("Item Name: "+item.getItemname());
		System.out.println("Item Price: "+item.getPrice());
		System.out.println("Item Quantity: "+item.getQty());
		System.out.println("Item Category: "+item.getCategory().getCatname());
		System.out.println("===================================");
	}
	
}
