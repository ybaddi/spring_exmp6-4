package com.springExmpl.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.springExmpl.Ibeans.IArticleData;

import java.util.Date;

import javax.annotation.PostConstruct; 
import javax.annotation.PreDestroy;

public class ArticleDataBean implements IArticleData{
	private int id;
	private String name;
	private double price;
	private Date creationDate;
	
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public double initPrice() {
		System.out.println("init price");
		this.setPrice(6.0);
		return this.getPrice();
	}


	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		
	}
	public ArticleDataBean(int id, String name, double price, Date creationDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.creationDate = creationDate;
	}
}
