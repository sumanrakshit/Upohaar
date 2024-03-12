package com.upohaar.ecommerace.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Product {
	@Id
	
	private String uuid;
	@Column(unique = true, nullable = false)
	private String name;
	@Column(nullable = false)
	private String type;
	@Column(nullable = false)
	private List<String> size;
	@Column(nullable = false)
	private List<byte[]> images;
	@Column(nullable = false)
	private String color;
	@Column(nullable = false)
	private String descrip;
	@Column(nullable = false)
	private double price;
	@Column(nullable = false)
	private double rating;
	@Column(nullable = false)
	private long created_date;
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getSize() {
		return size;
	}
	public void setSize(List<String> size) {
		this.size = size;
	}
	public List<byte[]> getImages() {
		return images;
	}
	public void setImages(List<byte[]> images) {
		this.images = images;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public long getCreated_date() {
		return created_date;
	}
	public void setCreated_date(long created_date) {
		this.created_date = created_date;
	}
	public Product(String uuid, String name, String type, List<String> size, List<byte[]> images, String color,
			String descrip, double price, double rating, long created_date) {
		super();
		this.uuid = uuid;
		this.name = name;
		this.type = type;
		this.size = size;
		this.images = images;
		this.color = color;
		this.descrip = descrip;
		this.price = price;
		this.rating = rating;
		this.created_date = created_date;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [uuid=" + uuid + ", name=" + name + ", type=" + type + ", size=" + size + ", images=" + images
				+ ", color=" + color + ", descrip=" + descrip + ", price=" + price + ", rating=" + rating
				+ ", created_date=" + created_date + "]";
	}
	
	
	

}
