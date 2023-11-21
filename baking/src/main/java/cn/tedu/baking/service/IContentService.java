package cn.tedu.baking.service;

import cn.tedu.baking.pojo.dto.ContentDTO;
import cn.tedu.baking.pojo.vo.ContentManagementVO;
import cn.tedu.baking.pojo.vo.ContentUpdateVO;

import java.util.List;

public interface IContentService {
    void addNew(ContentDTO contentDTO);

    List<ContentManagementVO> listForManagement(Long type, Long userId);

    void deleteById(Long id);

    ContentUpdateVO getDetailForUpdate(Long id);
}
