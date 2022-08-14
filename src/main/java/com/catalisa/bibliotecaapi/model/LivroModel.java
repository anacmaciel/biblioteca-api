package com.catalisa.bibliotecaapi.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "biblioteca")
public class LivroModel {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long codigoLivro;
@Column(length = 60, nullable = false)
private String nomeDoLivro;
@Column(length = 50, nullable = false)
private String autor;
@Column(length = 10, nullable = false)
private String dataDeLancamento;
}

