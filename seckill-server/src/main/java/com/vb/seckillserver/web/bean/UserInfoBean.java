package com.vb.seckillserver.web.bean;

import java.util.List;

public class UserInfoBean {
    private List<UserMessage> messages;
    private  String userPic;
    private String name;

    public List<UserMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<UserMessage> messages) {
        this.messages = messages;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

