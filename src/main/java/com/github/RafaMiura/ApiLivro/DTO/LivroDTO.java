package com.github.RafaMiura.ApiLivro.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LivroDTO {

    private Long id;


    @NotNull(message = "O livro precisa de um título")
    @Size(max = 150, message = "O nome deve ter até 150 ")
    private String titulo;

    @Future
    @
    private Integer anoPublicacao;
}

}
