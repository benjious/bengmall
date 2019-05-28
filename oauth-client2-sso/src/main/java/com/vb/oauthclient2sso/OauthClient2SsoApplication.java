package com.vb.oauthclient2sso;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class OauthClient2SsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthClient2SsoApplication.class, args);
    }



}
