package com.lojaAjax.lojaajax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lojaAjax.lojaajax.domain.SocialMetaTag;
import com.lojaAjax.lojaajax.service.SocialMetaTagService;

@SpringBootApplication
public class LojaAjaxApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LojaAjaxApplication.class, args);
	}
	
	@Autowired
	SocialMetaTagService service;

	@Override
	public void run(String... args) throws Exception {
		SocialMetaTag tag = service.getSocialMetaTagByUrl("https://www.udemy.com/course/laravel-beginner-fundamentals/");
		System.out.println(tag.toString());
		
	}

}
