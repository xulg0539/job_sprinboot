package com.xulg.service;

import com.xulg.dao.ArticleRepository;
import com.xulg.pojo.Article;
import javafx.scene.control.TableColumn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import static org.springframework.data.domain.Sort.Direction.DESC;

/**
 * @author xulin
 * @date 2020/5/23 18:22
 * @description
 */
@Service
public class ArticleServiceImpl implements  ArticleService{
    @Autowired
    private ArticleRepository articleRepository;


     public Page<Article> findAllByPaganation(int pageNum, int pageSize)
    {
       // Pageable pageable= PageRequest.of(pageNum,pageSize,sort);
        Pageable pageable=PageRequest.of(pageNum,pageSize, DESC,"id");
        Page<Article> page=articleRepository.findAll(pageable);
        return page;
    }



}
