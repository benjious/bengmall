package com.vb.accountserver.shiro.shiro;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class FilterUtil {
    private static final Logger log= LoggerFactory.getLogger(FilterUtil.class);

    /**
     * 是否是Ajax请求
     * @param request
     * @return
     */
    public static boolean isAjax(ServletRequest request){
        String header = ((HttpServletRequest) request).getHeader("X-Requested-With");
        return "XMLHttpRequest".equalsIgnoreCase(header);
    }

    /**
     *  使用response输出JSON
     * @param response
     * @param
     */
//    public static void out(ServletResponse response, ResultUtil<ResultCommBean> result){
//        PrintWriter out = null;
//        try {
//            response.setCharacterEncoding("UTF-8");
//            response.setContentType("application/json");
//            out = response.getWriter();
////            out.println(new Gson().toJson(result));
//        } catch (Exception e) {
//            log.error(e + "输出JSON出错");
//        }finally{
//            if(out!=null){
//                out.flush();
//                out.close();
//            }
//        }
//    }
}
