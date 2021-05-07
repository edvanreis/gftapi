package com.gftapi.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.gftapi.dto.EstoqueDTO;
import com.gftapi.model.Estoque;

/**
 * Data de Criação:05/05/2021
 * 
 * @author endr
 * @version 1.0
 */
public interface EstoqueService {

	public void save(EstoqueDTO dto);
	
	public void upadte(EstoqueDTO dto);
	
	public void remove(Long id);
	
	public Estoque dtoToModel(EstoqueDTO dto);
	
	public Estoque dtoToModelForUpdate(EstoqueDTO dto,Estoque estoque);
	
	public EstoqueDTO modelToDto(Estoque estoque);
	
	public void validateAndSave(EstoqueDTO dto, String file);
	
	public List<Estoque> findByProduct(String product);
	
	public Optional<Estoque> findByProductAndPriceAndQuantity(String product, BigDecimal price, Long quantity);

}
