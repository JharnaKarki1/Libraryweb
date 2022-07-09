package edu.mum.cs.cs425.elibrary.service.impl;

import edu.mum.cs.cs425.elibrary.model.Book;
import edu.mum.cs.cs425.elibrary.repository.BookRepository;
import edu.mum.cs.cs425.elibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addNewBook(Book book) {
        return bookRepository.save(book);
    }
}
