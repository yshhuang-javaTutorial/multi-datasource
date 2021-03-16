/**
* @author yshhuang@foxmail.com
* @date 3/16/2021
*/
package com.yshhuang.multidatasource.controller;

import com.yshhuang.multidatasource.entity.Book;
import com.yshhuang.multidatasource.mapper.library.BookMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("library")
public class LibraryController {
    @Autowired
    private BookMapper bookMapper;
    @PutMapping("book")
    public Integer addBook(@RequestParam String title){
        Book book=new Book();
        book.setTitle(title);
        return bookMapper.addBook(book);
    }
}
