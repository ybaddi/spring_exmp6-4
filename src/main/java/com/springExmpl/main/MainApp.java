package com.springExmpl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springExmpl.Ibeans.IArticleData;
import com.springExmpl.Ibeans.IArticleMetier;
import com.springExmpl.beans.ArticleDataBean;
import com.springExmpl.beans.ArticleMetierBean;

public class MainApp {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
//		IArticleData objData = (IArticleData) context.getBean("articleDataBean");
//	    ArticleMetierBean objMetier = (ArticleMetierBean) context.getBean("articleMetierBean");	    
//
//	    objMetier.setArticleData(objData);
//	    
//	    System.out.println(objMetier.computePrice());

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		ArticleMetierBean articleMetier = (ArticleMetierBean) context.getBean("articleMetierBean");
		
		ArticleDataBean iArticleDataA = (ArticleDataBean) context.getBean("articleDataBean");
		iArticleDataA.setName("Iam Article A");
		System.out.println(iArticleDataA.getName());
		System.out.println(iArticleDataA.getCreationDate());
		
		
		articleMetier.setArticleData(iArticleDataA);
		
		System.out.println(articleMetier.computePrice());
		
		context.registerShutdownHook();
		
		

	}

}
