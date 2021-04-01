package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.GoodsEntity;

import java.util.Map;

/**
 * 商品管理
 *
 * @author zah
 * @email sunlightcs@gmail.com
 * @date 2021-04-01 14:23:11
 */
public interface GoodsService extends IService<GoodsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

