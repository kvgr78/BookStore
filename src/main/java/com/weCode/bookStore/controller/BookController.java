package com.weCode.bookStore.controller;

import com.weCode.bookStore.controller.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/V1")
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<List<BookDto>> Getbooks()
    {
        BookDto book= BookDto.builder().title("my first book").build();

        List<BookDto> books=new ArrayList<>();
        books.add(book);
       return  ResponseEntity.ok(books);

    }

}
