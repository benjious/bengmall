package com.vb.accountserver.shiro.shiro;

import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.Filter;

@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager manager) {
        ShiroFilterFactoryBean filterFactoryBean = new ShiroFilterFactoryBean();
        filterFactoryBean.setSecurityManager(manager);
        Map<String,Filter>  filterMap = new LinkedHashMap<>();
        ShopperRoleFilter shopperRoleFilter = new ShopperRoleFilter();
        filterMap.put("shopperRole",new ShopperRoleFilter());
        filterFactoryBean.setFilters(filterMap);



        Map<String, String> filterChain = new LinkedHashMap<>();
        filterChain.put("/static/img", "anon");
        filterChain.put("/bengmall/index","authc");
        filterChain.put("/bengmall/good/product/goodcreate","authc");
        filterChain.put("/bengmall/good/product/create","authc");
        //自定义的过滤器，为了传入参数（参数的作用例如传入某个权限，某个角色）,对于自定义的过滤器，

        filterChain.put("/bengmall/good/product/create","shopperRole,shopperRole[guest]");
        filterChain.put("/bengmall/admin", "authc,roles[admin]");
        filterChain.put("/bengmall/guest", "authc,roles[guest]");
        filterChain.put("/bengmall/passwordModify","authc,roles[admin]");
        filterChain.put("/logout","logout");
        filterFactoryBean.setLoginUrl("/bengmall/login");
        filterFactoryBean.setSuccessUrl("/bengmall/index");
        filterFactoryBean.setUnauthorizedUrl("/bengmall/403");
        filterFactoryBean.setFilterChainDefinitionMap(filterChain);
        return filterFactoryBean;


    }




    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public MyRealm getRealm() {
        MyRealm myRealm = new MyRealm();
        myRealm.setCredentialsMatcher(new SimpleCredentialsMatcher());
        return myRealm;
    }


    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(getRealm());
        return securityManager;
    }



    /**
     * 开启shiro aop注解支持.
     * 使用代理方式;所以需要开启代码支持;
     *
     * @param securityManager
     * @return
     */
    @Bean
    public static AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }
}
