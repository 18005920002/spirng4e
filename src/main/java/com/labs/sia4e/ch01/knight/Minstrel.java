package com.labs.sia4e.ch01.knight;

import java.io.PrintStream;

/**
 * @Description:
 * @Auther: win10
 * @Date: 2018/10/5 11:17
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(){}

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void beforeQuest(){
        stream.println("Before quest ...");
    }

    public void afterQuest(){
        stream.println("After quest ...");
    }
}
