package com.ms.email.application.controller.consumer.rabbitmq;

import com.ms.email.domain.consumer.EmailConsumer;
import com.ms.email.domain.dto.EmailDTO;
import lombok.Data;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.function.Consumer;

@Data @Component
public class RabbitMQEmailConsumer implements EmailConsumer {

    private Optional<Consumer<EmailDTO>> consumer;

    @Override
    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(EmailDTO DTO) {
        this.consumer.ifPresent(it -> it.accept(DTO));
    }
}
