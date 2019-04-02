package com.vb.oauthclient2sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
public class OauthClient2SsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthClient2SsoApplication.class, args);
    }

}
