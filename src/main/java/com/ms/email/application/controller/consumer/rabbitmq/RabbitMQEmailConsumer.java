package com.ms.email.application.controller.consumer.rabbitmq;

import com.ms.email.domain.consumer.EmailConsumer;
import com.ms.email.domain.dto.EmailDTO;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class RabbitMQEmailConsumer implements EmailConsumer {

    @Override
    public void listenEmailQueue(EmailDTO DTO) {
        
    }

    @Override
    public void consumeFromEmailQueue(Consumer<EmailDTO> consumer) {

    }
}
