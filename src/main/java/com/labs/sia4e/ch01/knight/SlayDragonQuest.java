package com.labs.sia4e.ch01.knight;

import java.io.PrintStream;

/**
 * Title SlayDragonQuest
 * Description Quest的一个具体实例
 *
 * @author win10
 * @version 1.0 2018/10/5 10:24
 */
public class SlayDragonQuest implements Quest{

    private PrintStream ps;

    public SlayDragonQuest(PrintStream stream){
        ps = stream;
    }

    @Override
    public void embark() {
        ps.println("SLAY DRAGON QUEST EMBARK...");
    }
}
