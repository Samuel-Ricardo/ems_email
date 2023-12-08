package com.ms.email.application.consumer.rabbitmq;

import com.ms.email.domain.consumer.EmailConsumer;
import com.ms.email.domain.dto.EmailDTO;
import com.ms.email.domain.entity.Email;
import com.ms.email.domain.service.EmailService;
import lombok.Data;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.function.Consumer;

@Data @Component
public class RabbitMQEmailConsumer implements EmailConsumer {

    //private Optional<Consumer<EmailDTO>> consumer;

    @Autowired
    private EmailService service;

    @Override
    @RabbitListener(queues = "${broker.queue.email.name}")
    public void sendEmailFromQueue(@Payload EmailDTO DTO) {
        //this.consumer.ifPresent(it -> it.accept(DTO));

        service.sendEmail(Email.from(DTO));
    }
}
