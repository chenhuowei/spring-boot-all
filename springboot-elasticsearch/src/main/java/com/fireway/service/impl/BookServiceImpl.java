package com.fireway.service.impl;
import com.fireway.common.ResponseModel;
import com.fireway.dao.BookDao;
import com.fireway.entity.BookEntity;
import com.fireway.service.BookService;
import org.apache.commons.lang.StringUtils;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/2 11:42
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {

    private Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private BookDao bookDao;

    @Override
    public BookEntity getBookById(String id) {
        Optional<BookEntity> optional = bookDao.findById(id);

        return  optional.orElse(new BookEntity());
    }

    @Override
    public List<BookEntity> findByKeyword(String keyword) {
        Iterable<BookEntity> iterable = null;
        if (StringUtils.isNotBlank(keyword)){
            QueryStringQueryBuilder builder = new QueryStringQueryBuilder(keyword);
            logger.info(builder.toString());
             iterable = bookDao.search(builder);
        }else {
             iterable = this.bookDao.findAll();
        }
        List<BookEntity> list = new ArrayList<>();
        while(iterable.iterator().hasNext()){
            list.add(iterable.iterator().next());
        }
        return list;

    }

    @Override
    public List<BookEntity> findByKeywordPage(Integer page, Integer size, String keyword) {
        Pageable pageable = PageRequest.of(page-1,size);


        return null;
    }

    @Override
    public ResponseModel insert(BookEntity bookEntity) {
       this.bookDao.save(bookEntity);
        return ResponseModel.success("save ok");
    }

    @Override
    public ResponseModel update(BookEntity bookEntity) {
        this.bookDao.save(bookEntity);
        return ResponseModel.success("update ok");
    }

    @Override
    public ResponseModel deleteById(String id) {
        this.bookDao.delete(this.bookDao.findById(id).get());
        return ResponseModel.success("del ok");
    }

    @Override
    public ResponseModel saveBatch(List<BookEntity> entities) {
        this.bookDao.saveAll(entities);
        return ResponseModel.success("save batch ok");
    }
}
