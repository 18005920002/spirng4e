package com.test;

import java.io.Serializable;

/**
 * Created by wangzhen on 2018/4/2.
 * 门店汇总货物对象
 */
public class OrderSummaryShopGoodsVo implements Serializable,Comparable<OrderSummaryShopGoodsVo> {


    /**
     * 货物规格名称
     */
    private String goodsSpecName;

    /**
     * 货物规格数量
     */
    private Double goodsSpecCount;

    /**
     * 货物规格单位
     */
    private String goodsSpecUnit;

    /**
     * 货物规格统一编码
     */
    private String unifiedCode;

    /**
     * 商品大类编码
     */
    private Integer largeClass;

    /**
     * 货物配货类型
     * {@link com.lucky.base.stock.enums.goods.GoodsEnum.DeliveryTypeEnum}
     */
    private Integer deliveryType;


    public String getGoodsSpecName() {
        return goodsSpecName;
    }

    public void setGoodsSpecName(String goodsSpecName) {
        this.goodsSpecName = goodsSpecName;
    }

    public Double getGoodsSpecCount() {
        return goodsSpecCount;
    }

    public void setGoodsSpecCount(Double goodsSpecCount) {
        this.goodsSpecCount = goodsSpecCount;
    }

    public String getGoodsSpecUnit() {
        return goodsSpecUnit;
    }

    public void setGoodsSpecUnit(String goodsSpecUnit) {
        this.goodsSpecUnit = goodsSpecUnit;
    }

    public String getUnifiedCode() {
        return unifiedCode;
    }

    public void setUnifiedCode(String unifiedCode) {
        this.unifiedCode = unifiedCode;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Integer getLargeClass() {
        return largeClass;
    }

    public void setLargeClass(Integer largeClass) {
        this.largeClass = largeClass;
    }

    @Override
    public int compareTo(OrderSummaryShopGoodsVo o) {
        if(this.getDeliveryType() > o.getDeliveryType()) {
            return 1;
        } else if(this.getDeliveryType() < o.getDeliveryType()) {
            return -1;
        }
        return 0;
    }
}
