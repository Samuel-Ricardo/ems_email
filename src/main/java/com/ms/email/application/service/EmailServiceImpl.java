package com.ms.email.application.service;

import com.ms.email.application.usecase.email.SaveEmailUseCase;
import com.ms.email.application.usecase.email.SendEmailUseCase;
import com.ms.email.application.usecase.email.SetupEmailUseCase;
import com.ms.email.domain.entity.Email;
import static com.ms.email.domain.entity.EmailStatus.*;

import com.ms.email.domain.policy.email.UpdateEmailStatusOnSendPolicy;
import com.ms.email.domain.service.EmailService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired private SetupEmailUseCase setup;
    @Autowired private SendEmailUseCase send;
    @Autowired private SaveEmailUseCase save;

    @Autowired private UpdateEmailStatusOnSendPolicy updateEmailStatusOnSendPolicy;


    @Override @Transactional
    public Optional<Email> sendEmail(Email email) {

        email.setStatus(ERROR);
        return updateEmailStatusOnSendPolicy
                .execute(() -> send.execute(setup.execute(email)))
                .map(save::execute);
    }
}
