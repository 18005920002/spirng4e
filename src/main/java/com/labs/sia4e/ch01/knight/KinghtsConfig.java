package com.labs.sia4e.ch01.knight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Auther: win10
 * @Date: 2018/10/5 10:45
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
