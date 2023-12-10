package com.ms.email.application.policy.email;

import com.ms.email.domain.entity.Email;
import com.ms.email.domain.entity.EmailStatus;
import com.ms.email.domain.policy.email.UpdateEmailStatusOnSendPolicy;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.concurrent.Callable;

@Component
public class UpdateEmailStatusOnSendPolicyImpl implements UpdateEmailStatusOnSendPolicy {

    @Override
    public Optional<Email> execute(Callable<Email> send) {

        Optional<Email> email = Optional.empty();

        try {
            email = Optional.of(send.call());
            email.ifPresent(it -> it.setStatus(EmailStatus.SENT));
        }

        catch (Exception e) { e.printStackTrace();}

        return email;
    }
}
