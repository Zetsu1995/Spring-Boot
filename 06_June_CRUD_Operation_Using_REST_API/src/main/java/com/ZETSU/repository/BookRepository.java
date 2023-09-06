package com.ZETSU.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ZETSU.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>
{
	
}
