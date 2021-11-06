package com.loja.Game.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.loja.Game.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {

	
	public List<Produto> findAllByValor(double valor);
	
	@Override
	default List<Produto> findAll() {
	// TODO Auto-generated method stub
	return null;
}
	
}
