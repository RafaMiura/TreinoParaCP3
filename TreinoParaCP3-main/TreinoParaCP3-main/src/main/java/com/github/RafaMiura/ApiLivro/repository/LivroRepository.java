package com.github.RafaMiura.ApiLivro.repository;

import com.github.RafaMiura.ApiLivro.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
