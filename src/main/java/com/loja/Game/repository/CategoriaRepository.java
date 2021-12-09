package com.loja.Game.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.loja.Game.model.CategoriaGame;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaGame,Long> {

	Object findAll = null;

	
	public List<CategoriaGame> findAllByPagamento(String Pagamento);

	public List<CategoriaGame> findAll();

	

}