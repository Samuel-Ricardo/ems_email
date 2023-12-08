package com.ms.email.domain.service;

import jakarta.transaction.Transactional;

public interface Email {
    Email sendEmail(Email email);
}
