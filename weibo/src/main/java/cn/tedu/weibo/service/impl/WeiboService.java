package cn.tedu.weibo.service.impl;

import cn.tedu.weibo.mapper.WeiboMapper;
import cn.tedu.weibo.pojo.dto.InsertWeiboDTO;
import cn.tedu.weibo.pojo.entity.Weibo;
import cn.tedu.weibo.pojo.vo.WeiboDetailVO;
import cn.tedu.weibo.pojo.vo.WeiboIndexVO;
import cn.tedu.weibo.service.IWeiboService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class WeiboService implements IWeiboService {
    @Autowired
    WeiboMapper mapper;

    @Override
    public void addNew(InsertWeiboDTO weiboDTO) {
        Weibo weibo = new Weibo();
        BeanUtils.copyProperties(weiboDTO,weibo);
        weibo.setCreated(new Date());

        mapper.insert(weibo);
    }

    @Override
    public List<WeiboIndexVO> listForIndex() {
        return mapper.selectForIndex();
    }

    @Override
    public WeiboDetailVO detailById(Long id) {
        return mapper.selectById(id);
    }
}
