package com.ms.email.application.usecase.email;

import com.ms.email.domain.entity.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendEmailUseCase {

    @Autowired private JavaMailSender mailSender;

    public Email execute(Email email) {
        var message = new SimpleMailMessage();

        message.setTo(email.getEmailTo());
        message.setSubject(email.getSubject());
        message.setText(email.getTextBody());

        mailSender.send(message);
        return email;
    }
}
