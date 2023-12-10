package com.ms.email.domain.service;

import com.ms.email.domain.entity.Email;

public interface EmailService {
    Email sendEmail(Email email);
}
