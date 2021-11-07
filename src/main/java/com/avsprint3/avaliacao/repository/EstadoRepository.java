package com.avsprint3.avaliacao.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.avsprint3.avaliacao.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

	Optional<Estado> findById(Long id);
	List<Estado> findAll();

}
