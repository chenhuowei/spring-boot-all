package com.fireway.service;

import com.fireway.common.ResponseModel;
import com.fireway.entity.BookEntity;

import java.util.List;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/2 11:42
 * @Description:
 */
public interface BookService {

    public BookEntity getBookById(String id);

    public List<BookEntity> findByKeyword(String keyword);

    public List<BookEntity> findByKeywordPage(Integer page,Integer size,String keyword);

    public ResponseModel insert(BookEntity bookEntity);

    public ResponseModel update(BookEntity bookEntity);

    public ResponseModel deleteById(String id);

    public ResponseModel saveBatch(List<BookEntity> entities);




}
