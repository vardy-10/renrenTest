package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.GoodsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品管理
 * 
 * @author zah
 * @email sunlightcs@gmail.com
 * @date 2021-04-01 14:23:11
 */
@Mapper
public interface GoodsDao extends BaseMapper<GoodsEntity> {
	
}
