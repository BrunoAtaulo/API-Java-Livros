package com.gft.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gft.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{
	
}
