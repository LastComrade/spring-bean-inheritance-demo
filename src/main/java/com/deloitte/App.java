package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.deloitte.beans.Book;
import com.deloitte.config.AppConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Book bookBean = context.getBean(Book.class);
		System.out.println(bookBean);

		((AbstractApplicationContext) context).close();
	}
}
