package com.example.demo.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Catalog {

	private String catId;
	private String catInfo;
	private List<Item> items;
	
	public Catalog() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Catalog [catId=" + catId + ", catInfo=" + catInfo + ", items=" + items + "]";
	}


	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getCatInfo() {
		return catInfo;
	}

	public void setCatInfo(String catInfo) {
		this.catInfo = catInfo;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	
}
