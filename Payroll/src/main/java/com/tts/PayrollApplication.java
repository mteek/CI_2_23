package com.tts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class PayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollApplication.class, args);
	}

}
//////notes from springboot
///Don’t remove old fields. Instead, support them.

///Use rel-based links so clients don’t have to hard code URIs.

///Retain old links as long as possible. Even if you have to change the URI,
///keep the rels so older clients have a path onto the newer features.

////Use links, not payload data, to instruct clients when various state-driving operations are available.