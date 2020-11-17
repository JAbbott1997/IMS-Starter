package com.qa.ims.persistence.domain;

public class Order {
	
	private Long id;
	private String name;
	private int itemCount;
	
	public Order(String name, int itemCount) {
		this.name = name;
		this.itemCount = itemCount;
	}
	
	public Order(Long id, String name, int itemCount) {
		this.id = id;
		this.name = name;
		this.itemCount = itemCount;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	@Override
	public String toString() {
		return "id:" + id + " Order Name:" + name + " ItemCount:" + itemCount;
	}
}