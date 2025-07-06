package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository br;
    
    public BookService(BookRepository br){
        this.br=br;
        System.out.println("Using constructor");
    }

    public void setBr(BookRepository br){
        this.br=br;
        System.out.println("Using methods");
    }

    public void addBook(String bname){
        br.storeBook(bname);
    }
}
