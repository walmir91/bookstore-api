package com.walmir.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmir.bookstore.domain.Livro;
import com.walmir.bookstore.exceptions.ObjectNotFoundException;
import com.walmir.bookstore.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;

	public Livro findById(Integer id) {
		Optional<Livro> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Livro.class.getName()));
	}
	
	public List<Livro> findAll(){
		return repository.findAll();
	}
	
	public Livro create(Livro obj) {
		obj.setId(null);
		return repository.save(obj);
	}
}
