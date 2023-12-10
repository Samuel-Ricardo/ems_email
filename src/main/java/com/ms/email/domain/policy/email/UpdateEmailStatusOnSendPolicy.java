package com.ms.email.domain.policy.email;

import com.ms.email.domain.entity.Email;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.concurrent.Callable;

public interface UpdateEmailStatusOnSendPolicy {
    Optional<Email> execute(Callable<Email> send);
}
