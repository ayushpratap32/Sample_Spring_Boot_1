package com.ayush.springboottest;

import com.ayush.springboottest.streamtest.StreamTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringboottestApplication {

	@Autowired
	public StreamTest streamTest;

	public static void main(String[] args) {
		SpringApplication.run(SpringboottestApplication.class, args);
		dummy();
	}

	private static void dummy() {

	}
}
