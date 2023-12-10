package com.ms.email.application.usecase.email;

import com.ms.email.domain.entity.Email;
import com.ms.email.domain.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveEmailUseCase {

    @Autowired
    private EmailRepository repository;

    public Email execute(Email email) {
        return repository.save(email);
    }

}
