package com.labs.sia4e.ch02.auto;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * CDPlayer测试类，测试组件扫描
 *
 * @author win10
 * @version v1.0 2018/10/10 15:56
 */
@RunWith(SpringJUnit4ClassRunner.class)

//组件扫描方式
//@ContextConfiguration(classes = CDPlayerConfig.class)

//Java配置类显式配置
@ContextConfiguration(classes = WiringConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void play(){
        player.play();
    }
}
