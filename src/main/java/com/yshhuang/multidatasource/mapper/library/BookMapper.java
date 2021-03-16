/**
* @author yshhuang@foxmail.com
* @date 3/16/2021
*/
package com.yshhuang.multidatasource.mapper.library;

import com.yshhuang.multidatasource.entity.Book;

import org.apache.ibatis.annotations.Insert;

public interface BookMapper {

    @Insert("insert into book(title) values(#{title})")
    Integer addBook(Book book);
}
