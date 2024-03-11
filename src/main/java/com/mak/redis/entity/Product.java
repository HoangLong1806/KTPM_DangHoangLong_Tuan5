package com.mak.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Product")
public class Product implements Serializable {

    @Id
    private int id;
    private String name;
    private int pty;
    private long price;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPty() {
		return pty;
	}
	public long getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPty(int pty) {
		this.pty = pty;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Product(int id, String name, int pty, long price) {
		super();
		this.id = id;
		this.name = name;
		this.pty = pty;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}
