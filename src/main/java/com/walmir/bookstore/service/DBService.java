package com.walmir.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmir.bookstore.domain.Categoria;
import com.walmir.bookstore.domain.Livro;
import com.walmir.bookstore.repositories.CategoriaRepository;
import com.walmir.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository catRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");

		Livro l1 = new Livro(null, "Clean Code", "Alguem", "Lorem ipsun", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));

		this.catRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));
	}

}
