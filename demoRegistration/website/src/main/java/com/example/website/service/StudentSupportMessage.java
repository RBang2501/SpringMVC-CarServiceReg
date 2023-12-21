package com.example.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.website.domain.Message;
import com.example.website.domain.StudentMessage;

@Service
public class StudentSupportMessage implements SupportMessage{
    
    @Autowired
    Message message;

    @Override
    public String createMessage(int id) {
        this.message.setUserId(id);
        StudentMessage studentMessage = (StudentMessage) this.message;
        return studentMessage.getMessage();
    }

    
}
