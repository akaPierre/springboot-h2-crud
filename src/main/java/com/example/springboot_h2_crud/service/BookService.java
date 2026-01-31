package com.example.springboot_h2_crud.service;

import java.util.List;

import com.example.springboot_h2_crud.dto.BookRequest;
import com.example.springboot_h2_crud.model.Book;

public interface BookService {

    List<Book> findAll();

    Book findById(Long id);

    Book create(BookRequest request);

    Book update(Long id, BookRequest request);

    void delete(Long id);    
}