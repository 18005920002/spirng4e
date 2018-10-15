package com.labs.sia4e.ch02.auto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Title 显示装配配置类
 * Description 需要显式装配某些类时，采用Java配置类的方式进行Bean装配，
 * 比如第三方提供的，没有使用@Componet注解进行标注的Bean，无法自动扫描，
 * 这种情况下需要使用手动装配。
 *
 * @author win10
 * @version v1.0 2018/10/15 9:17
 */
@Configuration
public class WiringConfig {

    @Bean
    CompactDisc getSgtPepper(){
        return new SgtPepper();
    }

    /*@Bean
    MediaPlayer getPlayer(){
        return new CDPlayer(getSgtPepper());
    }*/


    @Bean
    MediaPlayer getPlayerWithParam(CompactDisc cd){
        return new CDPlayer(cd);
    }
}
