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
		Categoria cat2 = new Categoria(null, "Ficção científica", "Livros de Ficção");
		Categoria cat3 = new Categoria(null, "Autoajuda", "Livros de Autoajuda");

		Livro l1 = new Livro(null, "Clean Code", "Alguem", "Lorem ipsun", cat1);
		Livro l2 = new Livro(null, "Star Wars", "Alguem1", "Lorem ipsun", cat2);
		Livro l3 = new Livro(null, "Você importa", "Alguem", "Lorem ipsun", cat3);
		Livro l4 = new Livro(null, "O mochileiro das galáxias", "Alguem", "Lorem ipsun", cat2);

		cat1.getLivros().addAll(Arrays.asList(l1));
		cat2.getLivros().addAll(Arrays.asList(l2,l4));
		cat3.getLivros().addAll(Arrays.asList(l3));

		this.catRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		this.livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4));
	}

}
