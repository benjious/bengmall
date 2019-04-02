package com.vb.accountserver.dao.shiro;


import com.vb.accountserver.entity.shiro.SysRole;
import com.vb.accountserver.entity.shiro.User;


import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShiroDao {
    List<SysRole> findRolesByUserId(@Param("userId") int userId);
    User findByEmail(@Param("email") String email);
    boolean modifyPw(@Param("email") String email, @Param("password") String pw);
    //todo    boolean insertPermissionForRole();
}
