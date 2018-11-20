package com.springExmpl.beans;

import com.springExmpl.Ibeans.IArticleMetier;

import org.apache.log4j.Logger;

import com.springExmpl.Ibeans.IArticleData;

public class ArticleMetierBean implements IArticleMetier{
	
	Logger  logger = Logger.getLogger("com.foo");
	
	private IArticleData articleData;
	
	private int id;
	private String name;
	private long price;
	
	
	
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
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	public double computePrice() {
		logger.info("computePrice");
		double price = this.articleData.initPrice();
		return price + (price * 0.2);
		
	}
	
	public void setArticleData(IArticleData articleData) {
		this.articleData = articleData;
	}

}
