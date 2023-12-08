package com.ms.email.application.controller.consumer.rabbitmq;

import com.ms.email.domain.consumer.EmailConsumer;
import com.ms.email.domain.dto.EmailDTO;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQEmailConsumer implements EmailConsumer {

    @Override
    public void consumeFromEmailQueue(EmailDTO DTO) {
        
    }
}
