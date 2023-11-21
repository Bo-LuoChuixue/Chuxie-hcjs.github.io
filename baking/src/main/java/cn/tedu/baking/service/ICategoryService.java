package cn.tedu.baking.service;

import cn.tedu.baking.pojo.vo.CategoryVO;

import java.util.List;

public interface ICategoryService {
    List<CategoryVO> listByType(Long type);
}
