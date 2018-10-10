package com.labs.sia4e.ch01.knight;

import java.io.PrintStream;

/**
 * @Description:
 * @Auther: win10
 * @Date: 2018/10/5 10:24
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
