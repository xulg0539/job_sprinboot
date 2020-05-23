package com.xulg.controller;

import com.xulg.pojo.Article;
import com.xulg.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xulin
 * @date 2020/5/23 12:21
 * @description 文章列表查询
 * 实现数据的分页查询和显示
 * 思路：控制层调用服务层，服务层调用dao层
 * dao层采用jpa
 * 前段数据显示使用模板thymeleaf的标签实现数据显示和分页控制
 */
@Controller
public class IndexController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("toIndex")
    public String findArticlesByPaging(Model model,@RequestParam(value = "pageNum",defaultValue ="0") int pageNum,@RequestParam(value = "pageSize",defaultValue = "2") int pageSize)
    {
        Page<Article> page= articleService.findAllByPaganation(pageNum,pageSize);

        model.addAttribute("datas",page);
//        page.nextPageable().getPageNumber()
//        page.getTotalPages()
//        page.getPageable().getPageNumber()
        return "client/index";
    }

}
