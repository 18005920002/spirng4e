package com.labs.sia4e.ch02.auto;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 组件自动扫描配置类，默认扫描同一个包及其子包下的组件
 *
 * @author win10
 * @version v1.0 2018/10/10 15:51
 */
@Configuration
//启用自动扫描
@ComponentScan
public class CDPlayerConfig {

}
