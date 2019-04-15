package com.sanan.example.springgraphql.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	private int id;
	private String name;
	private String pageCount;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPageCount() {
		return pageCount;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPageCount(String pageCount) {
		this.pageCount = pageCount;
	}
}
