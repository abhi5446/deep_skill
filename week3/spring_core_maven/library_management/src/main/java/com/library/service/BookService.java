package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository br;
    
    public void setBr(BookRepository br){
        this.br=br;
    }

    public void addBook(String bname){
        br.storeBook(bname);
    }
}
