package com.github.RafaMiura.ApiLivro.entity;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "tb_pagamento")
public class Autor {

    private Long id;


    private String nome;
    private String email;




    
}
