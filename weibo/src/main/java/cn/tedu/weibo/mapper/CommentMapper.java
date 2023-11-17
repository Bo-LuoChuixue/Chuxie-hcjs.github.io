package cn.tedu.weibo.mapper;

import cn.tedu.weibo.pojo.entity.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentMapper {
    int insert(Comment comment);
}
