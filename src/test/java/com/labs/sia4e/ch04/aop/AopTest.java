package com.labs.sia4e.ch04.aop;

import com.labs.sia4e.ch04.aop.concert.AopComponentScanConfig;
import com.labs.sia4e.ch04.aop.concert.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Aop 测试类
 *
 * @author win10
 * @version v1.0 2018/11/23 11:45
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AopComponentScanConfig.class)
public class AopTest {

    @Autowired
    private Performance performance;

    @Test
    public void testPerform() throws Exception{
        try{
            performance.perform();
        }catch(Exception e){
            System.out.println("performance.perform()抛出异常，触发demandRefund()方法。");
        }
    }
}
