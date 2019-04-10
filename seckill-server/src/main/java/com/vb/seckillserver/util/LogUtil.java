package com.vb.seckillserver.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {
    public static Logger getLogger(Class class1){
        Logger logger = LoggerFactory.getLogger(class1);
        return logger;
    }

}
