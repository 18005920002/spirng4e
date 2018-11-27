package com.labs.sia4e.ch01.knight;

/**
 * 骑士类
 *
 * @author win10
 * @version  2018/10/4 22:29
 */
public class BraveKnight implements Knight{

    private Quest quest;
    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
