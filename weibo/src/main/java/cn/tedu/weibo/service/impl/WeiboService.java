package cn.tedu.weibo.service.impl;

import cn.tedu.weibo.mapper.WeiboMapper;
import cn.tedu.weibo.pojo.dto.InsertWeiboDTO;
import cn.tedu.weibo.service.IWeiboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeiboService implements IWeiboService {
    @Autowired
    WeiboMapper mapper;
    @Override
    public void addNew(InsertWeiboDTO weiboDTO) {
    }
}
