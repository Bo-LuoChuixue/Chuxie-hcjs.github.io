package cn.tedu.baking.mapper;

import cn.tedu.baking.pojo.entity.Content;
import cn.tedu.baking.pojo.vo.ContentManagementVO;
import cn.tedu.baking.pojo.vo.ContentUpdateVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentMapper {
    int insert(Content content);

    List<ContentManagementVO> selectForManagement(Long type, Long userId);

    int deleteById(Long id);

    ContentUpdateVO selectForUpdateById(Long id);

    int update(Content content);
}
