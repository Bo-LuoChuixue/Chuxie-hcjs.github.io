package cn.tedu.weibo.service;

import cn.tedu.weibo.pojo.dto.CommentDTO;
import cn.tedu.weibo.pojo.vo.CommentVO;
import java.util.List;

public interface ICommentService {
    void addNew(CommentDTO commentDTO);

    List<CommentVO> listById(Long id);
}
