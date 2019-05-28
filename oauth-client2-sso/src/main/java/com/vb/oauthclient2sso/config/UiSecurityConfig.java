package com.vb.oauthclient2sso.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableOAuth2Sso
public class UiSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        //所有需要验证，只有这些允许通过
        http.antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/actuator/**", "/login/**").permitAll()
                .anyRequest()
                .authenticated();
    }

}
