package com.github.RafaMiura.ApiLivro.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.apache.logging.log4j.message.Message;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of="id")

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String titulo;

    private Integer anoPublicacao;


    //relacionamento
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "tb_livro_autores",
            joinColumns = @JoinColumn(name = "autor_id"),
            inverseJoinColumns = @JoinColumn(name = "livro_id")
    )
    private Set<Autor> autores = new HashSet<>();
}
