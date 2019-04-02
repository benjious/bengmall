package com.vb.accountserver.shiro.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.filter.authz.RolesAuthorizationFilter;

import java.util.Set;


import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 这个过滤器是为了过滤角色
 * 和 RolesAuthorizationFilter 不同的是
 * 这个类返回json , 用于提示用户： 缺少权限
 */
public class ShopperRoleFilter extends RolesAuthorizationFilter {

    @Override
    public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        Subject subject = SecurityUtils.getSubject();
        String[] rolesArray = (String[]) mappedValue;

        if (rolesArray == null || rolesArray.length == 0) {
            //no roles specified, so nothing to check - allow access.
            return true;
        }

        Set<String> roles = CollectionUtils.asSet(rolesArray);
        boolean hasRole = subject.hasAllRoles(roles);
//        if (!hasRole) {
//            //当前角色符合
//            ResultUtil<ResultCommBean> result = new ResultUtil<>();
//            result.setErrMsg(200, "当前没有权限");
//            FilterUtil.out(response, result);
//        }
        return hasRole;
    }


}
