package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.beans.Book;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// byName can only be only used, because, byType will create issues as there are
		// two beans of same type i.e book

		// If abstract="true"
		// Error creating bean with name 'BaseBook': Bean definition is abstract
		// Book bookBaseBean = (Book) context.getBean("BaseBook");
		// System.out.println(bookBaseBean);

		Book bookDerivedBean = (Book) context.getBean("BookBean");
		System.out.println(bookDerivedBean);

		((AbstractApplicationContext) context).close();
	}
}
