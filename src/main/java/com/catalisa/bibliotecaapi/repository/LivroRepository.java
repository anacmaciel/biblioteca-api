package com.catalisa.bibliotecaapi.repository;

import com.catalisa.bibliotecaapi.model.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroModel, Long> {
}
