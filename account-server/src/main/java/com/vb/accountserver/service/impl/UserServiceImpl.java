package com.vb.accountserver.service.impl;


import com.vb.accountserver.entity.shiro.User;
import com.vb.accountserver.service.UserService;

import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public boolean modifyPassword(String email, String password) {
        return false;
    }

//    @Override
//    public List<UserMessage> getUserMsgs(int userId) {
//        return null;
//    }


//    @Autowired
//    private ShiroDao mShiroDao;
//
//    @Autowired
//    private UserMessageMapper mUserMessageMapper;
//
//    @Override
//    public User findByEmail(String email) {
//        return mShiroDao.findByEmail(email);
//    }
//
//    @Override
//    public boolean modifyPassword(String email, String password) {
//        return mShiroDao.modifyPw(email,password);
//    }
//
//    @Override
//    public List<UserMessage> getUserMsgs(int userId) {
//        UserMessageExample example = new UserMessageExample();
//        example.createCriteria().andUseridEqualTo(userId);
//        return mUserMessageMapper.selectByExample(example);
//    }




}
