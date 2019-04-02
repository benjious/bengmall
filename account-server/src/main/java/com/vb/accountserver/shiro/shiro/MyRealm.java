package com.vb.accountserver.shiro.shiro;


import com.vb.accountserver.entity.shiro.Permission;
import com.vb.accountserver.entity.shiro.SysRole;
import com.vb.accountserver.entity.shiro.User;
import com.vb.accountserver.service.UserService;
import com.vb.accountserver.util.LogUtil;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;




public class MyRealm extends AuthorizingRealm {


    private String tag = "MyRealm  xyz ";
    @Autowired
    private UserService mShiroService;

    //可以有哪些权限
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //先获取 user
        Subject subject = SecurityUtils.getSubject();
        String userEmail = (String) subject.getPrincipal();
        LogUtil.getLogger(MyRealm.class).debug("xyz  验证权限，获取到的邮箱是： "+userEmail);
        User user = mShiroService.findByEmail(userEmail);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        for (SysRole role :
                user.getRoles()) {
            info.addRole(String.valueOf(role.getRole()));
        }

        for (SysRole role : user.getRoles()) {
            for (Permission permission : role.getPermissions()) {
                info.addStringPermission(String.valueOf(permission.getPermissionId()));
            }
        }
        return info;
    }

    //认证当前用户的账号密码是否正确
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken token1 = (UsernamePasswordToken) token;
        token1.setRememberMe(false);
        LogUtil.getLogger(MyRealm.class).debug(tag + "用户输入邮箱：" + token1.getPrincipal());
        LogUtil.getLogger(MyRealm.class).debug(tag + "用户输入密码：" + token1.getCredentials());
        if (token1.getPrincipal() == null || token1.getPassword() == null) {
            return null;
        }
        User user = mShiroService.findByEmail((String)token.getPrincipal());
        LogUtil.getLogger(MyRealm.class).debug(tag+"数据库查询的用户信息："+user);
        if (user == null) {
            return null;
        }
        LogUtil.getLogger(MyRealm.class).debug(tag +"roles: "+user.getRoles());
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(
                user.getEmail(),
                user.getPassword(),
                getName()
        );
        return  info;
    }


}
