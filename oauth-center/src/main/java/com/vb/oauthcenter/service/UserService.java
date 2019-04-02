package com.vb.oauthcenter.service;


import com.vb.oauthcenter.domain.SysUser;

public interface UserService {

    /**
     * 根据用户名获取系统用户
     */
    SysUser getUserByName(String username);

}
