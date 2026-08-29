package lib.book.api.livros;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastrarLivro(

        @NotBlank
        String titulo,

        @NotBlank
        String autor,

        @NotBlank
        String idioma,

        @NotNull
        Genero genero

) {
}
