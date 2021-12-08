package com.lee.controller;
import com.lee.entity.GoodsInfo;
import com.lee.service.IGoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lee
 * @since 2021-12-08
 */
@RestController
@RequestMapping("/api/good")
public class GoodsInfoController {

    @Autowired
    IGoodsInfoService goodsInfoService;

    @RequestMapping("getGoodList")
    public List<GoodsInfo> getGoodList(){
        return goodsInfoService.getGoodEntityList();
    }
}
