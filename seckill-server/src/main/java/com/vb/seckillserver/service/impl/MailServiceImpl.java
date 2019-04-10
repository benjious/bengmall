package com.vb.seckillserver.service.impl;


import com.vb.seckillserver.service.MailService;
import com.vb.seckillserver.util.LogUtil;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;


@Service
public class MailServiceImpl{}
//public class MailServiceImpl implements MailService {
//    @Autowired
//    private JavaMailSender sender;
//
//
//    @Value("${mail.fromMail.addr}")
//    private String from;
//
//    @Override
//    public void sendMail(String to, String subject, String content) {
//        SimpleMailMessage mailMessage = new SimpleMailMessage();
//        mailMessage.setFrom(from);
//        mailMessage.setTo(to);
//        mailMessage.setSubject(subject);
//        mailMessage.setText(content);
//
//        try {
//            sender.send(mailMessage);
//            LogUtil.getLogger(MailServiceImpl.class).debug("xyz 邮件已经发送！");
//        } catch (Exception e) {
//            LogUtil.getLogger(MailServiceImpl.class).error("xyz 发送邮件出现错误： "+e.toString());
//        }
//
//    }
//
//    @Override
//    public void sendHtmlMail(String to, String subject, String content) {
//        MimeMessage message = sender.createMimeMessage();
//
//        try {
//            //true表示需要创建一个multipart message
//            MimeMessageHelper helper = new MimeMessageHelper(message, true);
//            helper.setFrom(from);
//            helper.setTo(to);
//            helper.setSubject(subject);
//            helper.setText(content, true);
//
//            sender.send(message);
//        } catch (MessagingException e) {
//            LogUtil.getLogger(MailServiceImpl.class).error("xyz 发送html邮件时发生异常 "+e.toString());
//        }
//    }
//}
