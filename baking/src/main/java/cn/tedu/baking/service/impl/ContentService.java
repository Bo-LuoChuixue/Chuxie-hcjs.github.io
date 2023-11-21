package cn.tedu.baking.service.impl;

import cn.tedu.baking.mapper.ContentMapper;
import cn.tedu.baking.pojo.dto.ContentDTO;
import cn.tedu.baking.pojo.entity.Content;
import cn.tedu.baking.pojo.vo.ContentManagementVO;
import cn.tedu.baking.pojo.vo.ContentUpdateVO;
import cn.tedu.baking.service.IContentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ContentService implements IContentService {
    @Autowired
    ContentMapper mapper;
    @Override
    public void addNew(ContentDTO contentDTO) {
        Content content = new Content();
        BeanUtils.copyProperties(contentDTO, content);

        if (contentDTO.getId()==null) {//新增
            content.setCreateTime(new Date());
            mapper.insert(content);
        }else{//修改
            content.setUpdateTime(new Date());
            mapper.update(content);
        }

    }

    @Override
    public List<ContentManagementVO> listForManagement(Long type, Long userId) {
        return mapper.selectForManagement(type,userId);
    }

    @Override
    public void deleteById(Long id) {
        mapper.deleteById(id);
    }

    @Override
    public ContentUpdateVO getDetailForUpdate(Long id) {
        return mapper.selectForUpdateById(id);
    }
}
