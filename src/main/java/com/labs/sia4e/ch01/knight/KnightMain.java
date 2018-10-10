package com.labs.sia4e.ch01.knight;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Description:
 * @Auther: win10
 * @Date: 2018/10/5 10:55
 */
public class KnightMain {
    public static void main(String[] args) {
        //配置文件的路径：resources下的根目录
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        //FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("../../../../knights.xml");
        //Knight knight = (Knight)context.getBean("knight");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
