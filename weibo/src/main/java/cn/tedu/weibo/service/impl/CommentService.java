package cn.tedu.weibo.service.impl;

import cn.tedu.weibo.mapper.CommentMapper;
import cn.tedu.weibo.pojo.dto.CommentDTO;
import cn.tedu.weibo.pojo.entity.Comment;
import cn.tedu.weibo.service.ICommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class CommentService implements ICommentService {
    @Autowired
    CommentMapper mapper;

    @Override
    public void addNew(CommentDTO commentDTO) {
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentDTO, comment);
        comment.setCreated(new Date());
        mapper.insert(comment);
    }
}
