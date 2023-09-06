package com.ZETSU.service;

import java.util.List;
import java.util.Optional;

import com.ZETSU.entity.Book;

public interface BookService 
{

	Book insertD(Book book);

	Optional<Book> retrieveD(Integer bcode);

	List<Book> retrieveAll();

	Book updateD(Book book);

	String deleteD(Integer bcode);
	
}
