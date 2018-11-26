package com.labs.sia4e.ch04.aop.concert;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * AOP 组件自动扫描
 *
 * @author win10
 * @version v1.0 2018/11/23 17:29
 */
@Configuration
@ComponentScan
//开启切面自动代理
@EnableAspectJAutoProxy
public class AopComponentScanConfig {
}
