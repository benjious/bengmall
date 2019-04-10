package com.vb.seckillserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
@MapperScan("com.vb.seckillserver.dao")
public class SeckillServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeckillServerApplication.class, args);
	}

}
