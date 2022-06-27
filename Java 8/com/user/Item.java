package com.user;

public class Item {

	private int id;
	private String name;
	private int price;
	private String category;
	private String dom;
	private String doe;
	
	
	public Item(int id, String name, int price, String category, String dom, String doe) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.dom = dom;
		this.doe = doe;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getDom() {
		return dom;
	}


	public void setDom(String dom) {
		this.dom = dom;
	}


	public String getDoe() {
		return doe;
	}


	public void setDoe(String doe) {
		this.doe = doe;
	}


	@Override
	public String toString() {
		return "\nItem [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", dom=" + dom
				+ ", doe=" + doe + "]";
	}
	
	
	
	
	
}
