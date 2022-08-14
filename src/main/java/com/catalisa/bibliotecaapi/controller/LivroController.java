package com.catalisa.bibliotecaapi.controller;

import com.catalisa.bibliotecaapi.model.LivroModel;
import com.catalisa.bibliotecaapi.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LivroController {
    @Autowired
    private LivroService livroService;

@GetMapping(path = "/biblioteca")
public List<LivroModel> buscarLivros() {
return livroService.buscarTodos();
    }

@GetMapping(path = "/biblioteca/{codigoLivro}")
public Optional<LivroModel> buscarLivroPorCodigo(@PathVariable Long codigoLivro) {
        return livroService.buscarLivroPorId(codigoLivro);
}

@PostMapping(path = "/biblioteca")
@ResponseStatus(HttpStatus.CREATED)
    public LivroModel cadastrarLivro(@RequestBody LivroModel livroModel) {
        return livroService.cadastrar(livroModel);
}

@PutMapping(path = "/biblioteca/{codigoLivro}")
    public LivroModel auterarLivro(@RequestBody LivroModel livroModel) {
        return livroService.alterar(livroModel);
}

@DeleteMapping(path = "/biblioteca/{codigoLivro}")
    public void deletarLivro (@PathVariable Long codigoLivro) {
        livroService.deletar(codigoLivro);
}
}

