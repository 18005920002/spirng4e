package com.labs.sia4e.ch01.knight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 基于Java的配置类
 * @author win10
 * @version 1.0 2018/10/5 10:45
 */

@Configuration
public class KinghtsConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean Quest quest(){
        return new SlayDragonQuest(System.out);
    }

}
