package com.sanan.example.springgraphql.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanan.example.springgraphql.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	
}
