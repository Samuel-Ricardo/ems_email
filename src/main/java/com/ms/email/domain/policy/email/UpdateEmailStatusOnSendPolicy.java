package com.ms.email.domain.policy.email;

import com.ms.email.domain.entity.Email;

import java.util.concurrent.Callable;

public interface UpdateEmailStatusOnSendPolicy {
    Email execute(Callable<Email> send);
}
