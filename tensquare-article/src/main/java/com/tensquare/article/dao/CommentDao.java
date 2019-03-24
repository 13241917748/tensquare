package com.tensquare.article.dao;

import com.tensquare.article.pojo.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 *  文章评论数据访问
 */
public interface CommentDao extends MongoRepository<Comment, String> {

    /**
     * 根据文章ID查询评论列表
     * @param articleid
     * @return
     */
    public List<Comment> findByArticleid(String articleid);

    /**
     * 根据文章ID删除评论
     * @param articleid
     * @return
     */
    public List<Comment> deleteByArticleid(String articleid);

}
