package com.ms.email.domain.service;

import com.ms.email.domain.entity.Email;

import java.util.Optional;

public interface EmailService {
    Optional<Email> sendEmail(Email email);
}
