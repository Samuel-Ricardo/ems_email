package com.ms.email.application.policy.email;

import com.ms.email.domain.entity.Email;
import com.ms.email.domain.policy.email.UpdateEmailStatusOnSendPolicy;
import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;

@Component
public class UpdateEmailStatusOnSendPolicyImpl implements UpdateEmailStatusOnSendPolicy {

    @Override
    public Email execute(Callable<Email> send) {
        return null;
    }
}
