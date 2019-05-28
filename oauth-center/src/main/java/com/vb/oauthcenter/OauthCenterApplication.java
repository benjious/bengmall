package com.vb.oauthcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * oauth-server 是个认证和授权的服务器
 * 认证 ： 在 SecurityConfig
 * 授权 ： 在 AuthorizationServerConfig
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OauthCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthCenterApplication.class, args);
    }

}
