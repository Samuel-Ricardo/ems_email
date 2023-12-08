package com.ms.email.domain.consumer;

import com.ms.email.domain.dto.EmailDTO;

import java.util.function.Consumer;

public interface EmailConsumer {

    void listenEmailQueue(EmailDTO DTO);

    void consumeFromEmailQueue(Consumer<EmailDTO> consumer);
}
