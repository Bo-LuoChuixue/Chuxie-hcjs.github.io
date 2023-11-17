package cn.tedu.weibo.service;

import cn.tedu.weibo.pojo.dto.InsertWeiboDTO;
import cn.tedu.weibo.pojo.vo.WeiboDetailVO;
import cn.tedu.weibo.pojo.vo.WeiboIndexVO;
import java.util.List;

public interface IWeiboService {
    void addNew(InsertWeiboDTO weiboDTO);

    List<WeiboIndexVO> listForIndex();

    WeiboDetailVO detailById(Long id);
}
