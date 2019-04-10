package com.vb.seckillserver.util.testUtil;

import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

//@Component
public class ScheduleTask1 {
    private static final SimpleDateFormat FORMAT = new SimpleDateFormat();


    @Scheduled(fixedDelay = 2000,initialDelay = 1000)
    public void PrintTime(){
        System.out.println("xyz 现在的时间是: "+FORMAT.format(new Date()));
    }

}
