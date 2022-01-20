package com.blog.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.entity.Comment;
import com.blog.model.dto.CommentBackDTO;
import com.blog.model.dto.CommentDTO;
import com.blog.model.dto.ReplyDTO;
import com.blog.model.vo.CommentVO;
import com.blog.model.vo.ConditionVO;
import com.blog.model.vo.PageResult;
import com.blog.model.vo.ReviewVO;

import java.util.List;

/**
 * 评论服务
 *
 * @author fuqianlin
 * @date 2022-01-20
 */
public interface CommentService extends IService<Comment> {
    /**
     * 查看评论
     *
     * @param articleId 文章id
     * @return 评论列表
     */
    PageResult<CommentDTO> listComments(Integer articleId);

    /**
     * 查看评论下的回复
     *
     * @param commentId 评论id
     * @return 回复列表
     */
    List<ReplyDTO> listRepliesByCommentId(Integer commentId);

    /**
     * 添加评论
     *
     * @param commentVO 评论对象
     */
    void saveComment(CommentVO commentVO);

    /**
     * 点赞评论
     *
     * @param commentId 评论id
     */
    void saveCommentLike(Integer commentId);

    /**
     * 审核评论
     *
     * @param reviewVO 审核信息
     */
    void updateCommentsReview(ReviewVO reviewVO);

    /**
     * 查询后台评论
     *
     * @param condition 条件
     * @return 评论列表
     */
    PageResult<CommentBackDTO> listCommentBackDTO(ConditionVO condition);


}
