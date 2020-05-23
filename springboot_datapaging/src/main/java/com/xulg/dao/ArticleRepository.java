package com.xulg.dao;

import com.xulg.pojo.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author xulin
 * @date 2020/5/23 18:20
 * @description
 */
public interface ArticleRepository  extends JpaRepository<Article,Integer>{
}
