package org.serratec.backend.individaualAPI.repository;

import org.serratec.backend.individaualAPI.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
