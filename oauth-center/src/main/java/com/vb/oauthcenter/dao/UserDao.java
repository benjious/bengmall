package com.vb.oauthcenter.dao;



import com.vb.oauthcenter.domain.SysPermission;
import com.vb.oauthcenter.domain.SysRole;
import com.vb.oauthcenter.domain.SysUser;

import org.springframework.stereotype.Repository;

import java.util.Arrays;


@Repository
public class UserDao {

    private SysRole admin = new SysRole("ROLE_ADMIN", "管理员");
    private SysRole developer = new SysRole("ROLE_DEVELOPER", "开发者");

    {
        SysPermission p1 = new SysPermission();
        p1.setCode("memberExport");
        p1.setName("会员列表导出");
        p1.setUrl("/member/export");

        SysPermission p2 = new SysPermission();
        p2.setCode("BookList");
        p2.setName("图书列表");
        p2.setUrl("/book/list");


        admin.setPermissionList(Arrays.asList(p1, p2));
        developer.setPermissionList(Arrays.asList(p1));

    }

    public SysUser selectByName(String username) {
        if ("zhangsan".equals(username)) {
            SysUser sysUser = new SysUser("zhangsan", "$2a$10$aZDOWYEvK06TrxN6g0Mta.X3gtnj1sHPReRic5YRcOiXl4yMctwS6");
            sysUser.setRoleList(Arrays.asList(admin, developer));
            return sysUser;
        }else if ("lisi".equals(username)) {
            SysUser sysUser = new SysUser("lisi", "$2a$10$aZDOWYEvK06TrxN6g0Mta.X3gtnj1sHPReRic5YRcOiXl4yMctwS6");
            sysUser.setRoleList(Arrays.asList(developer));
            return sysUser;
        }
        return null;
    }

}
