package com.fireway.controller;

import com.fireway.common.ResponseModel;
import com.fireway.entity.BookEntity;
import com.fireway.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/2 11:38
 * @Description:
 */

@RestController
@RequestMapping("product/book")
@Api("product-book controller")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("{id}")
    public ResponseModel getBookById(@ApiParam(name = "id",value = "主鍵",defaultValue = "1") @PathVariable  String id){

        return  ResponseModel.success("",this.bookService.getBookById(id));
    }

    @GetMapping("findAll")
    public ResponseModel findAll( String keyword){

        return ResponseModel.success("",this.bookService.findByKeyword(keyword));
    }

    @PutMapping
    public ResponseModel saveOrUpdate(@RequestBody BookEntity bookEntity){
        return  this.bookService.update(bookEntity);
    }

    @DeleteMapping("{id}")
    public ResponseModel deleteById(@PathVariable String id){
        return  this.bookService.deleteById(id);
    }

    @PutMapping("saveBatch")
    public ResponseModel saveBatch(@RequestBody List<BookEntity> entities){

        return  this.bookService.saveBatch(entities);
    }


}
