package com.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Description:
 * @Auther: win10
 * @Date: 2018/10/8 10:53
 */
public class Test {
    public static void main(String[] args) {
        OrderSummaryShopGoodsVo o1 = new OrderSummaryShopGoodsVo();
        o1.setDeliveryType(1);
        OrderSummaryShopGoodsVo o2 = new OrderSummaryShopGoodsVo();
        o1.setDeliveryType(1);
        List<OrderSummaryShopGoodsVo> dataList = new ArrayList<OrderSummaryShopGoodsVo>();//null;//new ArrayList<>(dataMap.get(keyName).getOrderSummaryShopGoodsVoMap().values());
        dataList.add(o1);
        //排序
        Collections.sort(dataList, new Comparator<OrderSummaryShopGoodsVo>(){
            @Override
            public int compare(OrderSummaryShopGoodsVo o1, OrderSummaryShopGoodsVo o2) {
                int result = 0;
                result = o1.getDeliveryType().compareTo(o2.getDeliveryType());
                if(0 == result) {
                    result = o1.getLargeClass().compareTo(o2.getLargeClass());
                }
                if(0 == result) {
                    result = o1.getUnifiedCode().compareTo(o2.getUnifiedCode());
                }
                return result;
            }
        });
        /*Double p = null;
        BigDecimal x = BigDecimal.valueOf(p);
        System.out.println(x);*/
    }
}
