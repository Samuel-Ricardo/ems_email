package com.ms.email.domain.entity;

import com.ms.email.domain.dto.EmailDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import static jakarta.persistence.GenerationType.UUID;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity @Data @Builder
@Table(name = "TB_EMAILS")
@AllArgsConstructor @NoArgsConstructor
public class Email implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = UUID)
    private UUID emailId;
    private UUID userId;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String textBody;
    private LocalDateTime sendDateEmail;
    private EmailStatus status;

    public static Email from(EmailDTO dto) {
        return Email.builder().
                userId(dto.userId()).
                emailTo(dto.emailTo()).
                subject(dto.subject()).
                textBody(dto.text())
                .build();
    }
}
