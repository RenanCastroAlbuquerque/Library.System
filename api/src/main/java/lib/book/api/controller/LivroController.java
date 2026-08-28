package lib.book.api.controller;

import lib.book.api.livros.DadosCadastrarLivro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Livros")

public class LivroController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastrarLivro dados) {
    }
}
