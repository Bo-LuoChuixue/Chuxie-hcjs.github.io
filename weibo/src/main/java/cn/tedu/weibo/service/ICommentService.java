package cn.tedu.weibo.service;

import cn.tedu.weibo.pojo.dto.CommentDTO;

public interface ICommentService {
    void addNew(CommentDTO commentDTO);
}
