package com.vb.commonutil;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {
    public static Logger getLogger(Class class1){
        Logger logger = LoggerFactory.getLogger(class1);
        return logger;
    }

    public void debug(String msg,Class class1){
        Logger logger = getLogger(class1);
        logger.debug("xyz  : "+msg);
    }

}
