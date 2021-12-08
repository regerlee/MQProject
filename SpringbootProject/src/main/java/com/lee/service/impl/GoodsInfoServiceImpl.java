package com.lee.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lee.dao.GoodsInfoMapper;
import com.lee.dao.MsgRecordMapper;
import com.lee.entity.GoodsInfo;
import com.lee.service.IGoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lee
 * @since 2021-12-08
 */

public class GoodsInfoServiceImpl extends ServiceImpl<GoodsInfoMapper, GoodsInfo> implements IGoodsInfoService {
    @Autowired
    private GoodsInfoMapper mapper;
    @Override
    public List<GoodsInfo> getGoodEntityList() {
        QueryWrapper<GoodsInfo> wrapper= Wrappers.query();
        List<GoodsInfo> goodList  = mapper.selectList(wrapper);
        if (goodList.size()>0)
            return goodList;
        return null;
    }
}
