package com.vb.seckillserver.service;

public interface MailService {
    void sendMail(String to, String subject, String content);
     void sendHtmlMail(String to, String subject, String content);
}
