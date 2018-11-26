package com.labs.sia4e.ch04.aop.concert.imp;

import com.labs.sia4e.ch04.aop.concert.Performance;
import org.springframework.stereotype.Component;

/**
 * 音乐会实现类
 *
 * @author win10
 * @version v1.0 2018/11/23 11:50
 */
@Component
public class KWilliamPerformance implements Performance {

    @Override
    public void perform() throws Exception{
        System.out.println("K.William performing... -------------");
        throw new Exception("");
    }
}
