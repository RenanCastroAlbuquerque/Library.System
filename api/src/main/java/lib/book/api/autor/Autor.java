package lib.book.api.autor;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Entity(name = "author")
@Table(name = "autor")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")


public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private LocalDate dateOfBirth;
    private LocalDate dateOfDeath;


    public Autor(CadastroAutor dados){
        this.nome = dados.nome();
        this.dateOfBirth = dados.dateOfBirth();
        this.dateOfDeath = dados.dateOfDeath();
    }
}
