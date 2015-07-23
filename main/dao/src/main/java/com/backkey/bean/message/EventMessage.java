package com.backkey.bean.message;

import com.backkey.bean.MessageBean;

public class EventMessage extends Message {

    public EventMessage(MessageBean message) {
        super(message);
    }

    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
