package com.ZETSU.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ZETSU.entity.Book;
import com.ZETSU.service.BookService;

@RestController
public class BookController 
{
	@Autowired
	private BookService bookser;
	
	
	
	//insert data in DB
	@PostMapping("/save")
	public Book insertData(@RequestBody Book book)
	{
		return bookser.insertD(book);
	}
	
	//retrieve single row from DB
	@GetMapping("/retrieve")
	public Optional<Book> retrieveData(@RequestParam Integer bcode)
	{
		return bookser.retrieveD(bcode);
		
	}
	//retrieve all data from DB
	@GetMapping("/retrieve_all")
	public List<Book> retrieveAllData()
	{
		return bookser.retrieveAll();
	}
	
	//update data from DB
	@PutMapping("/update")
	public Book updateData(@RequestBody Book book)
	{
		return bookser.updateD(book);
	}
	
	//delete data from DB
	@DeleteMapping("/delete")
	public String deleteData(@RequestParam Integer bcode)
	{
		return bookser.deleteD(bcode);
		
	}
	
	
}
