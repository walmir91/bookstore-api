package com.walmir.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmir.bookstore.domain.Categoria;
import com.walmir.bookstore.exceptions.ObjectNotFoundException;
import com.walmir.bookstore.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository catRepository;

	public Categoria findById(Integer id) {
		Optional<Categoria> obj = catRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	public List<Categoria> findAll(){
		return catRepository.findAll();
	}
	public Categoria create(Categoria obj) {
		obj.setId(null);
		return catRepository.save(obj);
	}
}
