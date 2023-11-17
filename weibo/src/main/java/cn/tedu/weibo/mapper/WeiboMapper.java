package cn.tedu.weibo.mapper;

import cn.tedu.weibo.pojo.entity.Weibo;
import cn.tedu.weibo.pojo.vo.WeiboDetailVO;
import cn.tedu.weibo.pojo.vo.WeiboIndexVO;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface WeiboMapper {
    int insert(Weibo weibo);

    List<WeiboIndexVO> selectForIndex();

    WeiboDetailVO selectById(Long id);
}
