package com.ZETSU.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ZETSU.entity.Book;
import com.ZETSU.repository.BookRepository;

@Service
public class BookServiceImp implements BookService
{
	@Autowired
	private BookRepository bookRepo;

	@Override
	public Book insertD(Book book) {
		
		return bookRepo.save(book);
	}

	@Override
	public Optional<Book> retrieveD(Integer bcode) {
		
		return bookRepo.findById(bcode);
	}

	@Override
	public List<Book> retrieveAll() {
		
		return bookRepo.findAll();
	}

	@Override
	public Book updateD(Book book) {
		
		return bookRepo.save(book);
	}

	@Override
	public String deleteD(Integer bcode) {
		
		String temp="";
		if(bookRepo.findById(bcode).isPresent())
		{
			bookRepo.deleteById(bcode);
			temp="bcode="+bcode+", deleted Successfully.....";
			
		}
		else
		{
			temp="bcode="+bcode+", is not available.....";
		}
		
		return temp;
	}
	
	
}
