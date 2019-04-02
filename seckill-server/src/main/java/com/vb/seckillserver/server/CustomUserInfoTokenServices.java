package com.vb.seckillserver.server;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;


public class CustomUserInfoTokenServices implements ResourceServerTokenServices {


    private final String userInfoEndpointUrl;
    private final String clientId;



    public CustomUserInfoTokenServices(String userInfoEndpointUrl, String clientId) {
        this.userInfoEndpointUrl = userInfoEndpointUrl;
        this.clientId = clientId;
    }




    //-------------------------------------------------------------------------
    //Method



    /**
     *  读取从client 那里传过来的 密码，账号信息
     *  这里需要发送给远程认证服务器该，等待认证，要是认证认证通过就可以获得 access_token
     * @param s
     * @return
     * @throws AuthenticationException
     * @throws InvalidTokenException
     */
    @Override
    public OAuth2Authentication loadAuthentication(String s) throws AuthenticationException, InvalidTokenException {
        return null;
    }



    @Override
    public OAuth2AccessToken readAccessToken(String s) {
        throw new UnsupportedOperationException("Not supported: read access token");
    }
}
