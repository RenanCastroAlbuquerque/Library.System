package lib.book.api.livros;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "livro")
@Table(name="livro")
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")

public class Livros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private String idioma;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    public Livros(DadosCadastrarLivro dados){
        this.titulo = dados.titulo();
        this.autor = dados.autor();
        this.idioma = dados.idioma();
        this.genero = dados.genero();
    }

}
