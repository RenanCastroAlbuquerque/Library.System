package lib.book.api.controller;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lib.book.api.autor.Autor;
import lib.book.api.autor.AutorRepository;
import lib.book.api.autor.CadastroAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Autor")
public class AutorController {

    @Autowired
    private AutorRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid CadastroAutor dados){
        repository.save(new Autor(dados));
    }
}
