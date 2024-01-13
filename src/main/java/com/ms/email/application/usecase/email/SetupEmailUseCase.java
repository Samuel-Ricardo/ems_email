package com.ms.email.application.usecase.email;

import com.ms.email.domain.entity.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SetupEmailUseCase {

    @Value("${spring.mail.username}")
    private String officialAccount="a@mail.com";

    public Email execute(Email email) {
        email.setSendDateEmail(LocalDateTime.now());
        email.setEmailFrom(officialAccount);
        return email;
    }
}
