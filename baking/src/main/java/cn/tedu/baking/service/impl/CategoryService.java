package cn.tedu.baking.service.impl;

import cn.tedu.baking.mapper.CategoryMapper;
import cn.tedu.baking.pojo.vo.CategoryVO;
import cn.tedu.baking.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    CategoryMapper mapper;
    @Override
    public List<CategoryVO> listByType(Long type) {
        return mapper.selectByType(type);
    }
}
