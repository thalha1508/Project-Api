package dev.app.Application.models;


import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.processing.Pattern;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue
    Long id;

    @NotNull
    @NotBlank
    String title;
    @NotNull
    @NotBlank
    String description;

    Boolean isCompleted;
    @Email
    String email;
}
