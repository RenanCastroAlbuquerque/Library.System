package lib.book.api.autor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record CadastroAutor(
        @NotBlank
        String nome,
        @NotNull
        LocalDate dateOfBirth,

        LocalDate dateOfDeath
) {
    
}
