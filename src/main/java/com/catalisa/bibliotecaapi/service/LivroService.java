package com.catalisa.bibliotecaapi.service;


import com.catalisa.bibliotecaapi.model.LivroModel;
import com.catalisa.bibliotecaapi.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

@Autowired
private LivroRepository livroRepository;

public List<LivroModel> buscarTodos() {
    return livroRepository.findAll();
}

public Optional<LivroModel> buscarLivroPorId(Long codigoLivro) {

    return livroRepository.findById(codigoLivro);
}

public LivroModel cadastrar(LivroModel livroModel) {
    livroModel.getCodigoLivro();
    livroModel.getNomeDoLivro();
    livroModel.getAutor();
    livroModel.getDataDeLancamento();
return livroRepository.save(livroModel);
}

public LivroModel alterar(LivroModel livroModel) {
    livroModel.getCodigoLivro();
    livroModel.getNomeDoLivro();
    livroModel.getAutor();
    livroModel.getDataDeLancamento();
    return livroRepository.save(livroModel);
}

public void deletar(Long codigoLivro) {
    livroRepository.deleteById(codigoLivro);
}
}

