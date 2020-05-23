package com.xulg.service;

import com.xulg.pojo.Article;
import org.springframework.data.domain.Page;

/**
 * @author xulin
 * @date 2020/5/23 18:39
 * @description
 */
public interface ArticleService {
    public Page<Article> findAllByPaganation(int pageNum, int pageSize);
}
