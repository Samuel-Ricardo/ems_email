package com.ms.email.domain.consummer;

import com.ms.email.domain.dto.EmailDTO;

public interface EmailConsummer {
    void consumeFromEmailQueue(EmailDTO DTO);
}
