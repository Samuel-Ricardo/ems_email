package com.ms.email.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record EmailDTO(
        @NotNull
        UUID userId,
        @NotBlank
        @Email
        String emailTo,
        @NotBlank
        String subject,
        @NotBlank
        String text
) { }
