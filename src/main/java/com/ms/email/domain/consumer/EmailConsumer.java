package com.ms.email.domain.consumer;

import com.ms.email.domain.dto.EmailDTO;

public interface EmailConsumer {
    void consumeFromEmailQueue(EmailDTO DTO);
}
