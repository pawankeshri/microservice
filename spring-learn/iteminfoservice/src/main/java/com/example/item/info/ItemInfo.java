package com.example.item.info;

public class ItemInfo {

	private int id;
	private String name;
	private String category;
	// features and details
	private String description;
	private String image;
	private double price;

	public ItemInfo() {
		super();
	}

	public ItemInfo(int id, String name, String category, String description, String image, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
		this.image = image;
		this.price = price;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemInfo [id=" + id + ", name=" + name + ", category=" + category + ", description=" + description
				+ ", image=" + image + ", price=" + price + "]";
	}

}
