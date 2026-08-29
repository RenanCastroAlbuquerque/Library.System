package lib.book.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lib.book.api.livros.DadosCadastrarLivro;
import lib.book.api.livros.LivroRepository;
import lib.book.api.livros.Livros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Livros")

public class LivroController {

    @Autowired
    private LivroRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastrarLivro dados) {
        repository.save(new Livros(dados));
    }
}
