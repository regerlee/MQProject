package com.lee.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author lee
 * @since 2021-12-08
 */
@TableName("tb_goods_info")
@ApiModel(value = "GoodsInfo对象", description = "")
public class GoodsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String goodName;

    private Integer goodStock;

    private String bak;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }
    public Integer getGoodStock() {
        return goodStock;
    }

    public void setGoodStock(Integer goodStock) {
        this.goodStock = goodStock;
    }
    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }

    @Override
    public String toString() {
        return "GoodsInfo{" +
            "id=" + id +
            ", goodName=" + goodName +
            ", goodStock=" + goodStock +
            ", bak=" + bak +
        "}";
    }
}
