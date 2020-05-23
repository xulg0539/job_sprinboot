package com.xulg.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 文章实体类
 * 建立实体类和数据表之间的映射关系
 */
//设置实体类并指定映射的数据表名
@Entity(name="t_article")
public class Article {


    //映射主键
    @Id
    //设置主键自增策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id; //文章id
    @Column(name="title")
    private String title; //文章标题
    @Column(name="content")
    private String content; //文章内容
    @Column(name="created")
    private Date created;//发表时间
    @Column(name="modified")
    private Date modified ;//修改时间
    @Column(name="categories")
    private String categories;//文章分类
    @Column(name="tags")
    private String tags;//文章标签
    @Column(name="allow_comment")
    private Integer allow_comment;//是否允许评论
    @Column(name="thumbnail")
    private String thumbnail;//文章缩略图

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", categories='" + categories + '\'' +
                ", tags='" + tags + '\'' +
                ", allow_comment=" + allow_comment +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getAllow_comment() {
        return allow_comment;
    }

    public void setAllow_comment(Integer allow_comment) {
        this.allow_comment = allow_comment;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
