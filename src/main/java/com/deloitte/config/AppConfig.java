package com.deloitte.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.deloitte.aspect.LoggingAspect;
import com.deloitte.beans.Book;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
	@Bean
	public Book book() {
		return new Book();
	}
	
	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}
}
