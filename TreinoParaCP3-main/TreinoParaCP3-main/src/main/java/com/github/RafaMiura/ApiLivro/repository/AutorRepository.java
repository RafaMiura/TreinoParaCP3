package com.github.RafaMiura.ApiLivro.repository;

import com.github.RafaMiura.ApiLivro.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
