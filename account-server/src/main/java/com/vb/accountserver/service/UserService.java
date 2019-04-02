package com.vb.accountserver.service;


import com.vb.accountserver.entity.shiro.User;

public interface UserService {
    User findByEmail(String email);
    boolean modifyPassword(String email, String password);
//    List<UserMessage> getUserMsgs(int userId);
    //todo  boolean insertPermissionForRole(int roleId, Permission permission);
}
