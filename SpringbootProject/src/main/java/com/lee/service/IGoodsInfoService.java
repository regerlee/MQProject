package com.lee.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.entity.GoodsInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lee
 * @since 2021-12-08
 */
@Service
@Component
public interface IGoodsInfoService extends IService<GoodsInfo> {
    public List<GoodsInfo> getGoodEntityList();
}
