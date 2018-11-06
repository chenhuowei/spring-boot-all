package com.fireway.dao;

import com.fireway.entity.BookEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/2 11:37
 * @Description:
 */
public interface BookDao extends ElasticsearchRepository<BookEntity,String> {
}
