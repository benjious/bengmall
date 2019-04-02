package com.vb.oauthcenter.service.impl;



import com.vb.oauthcenter.dao.UserDao;
import com.vb.oauthcenter.domain.SysUser;
import com.vb.oauthcenter.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public SysUser getUserByName(String username) {
        return userDao.selectByName(username);
    }
}
