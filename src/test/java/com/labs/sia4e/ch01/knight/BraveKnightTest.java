package com.labs.sia4e.ch01.knight;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @version v0.1 2018/10/9 13:19
 * @auther win10
 */
public class BraveKnightTest {
    @Test
    public void testEmbarkOnQuest(){

        Quest quest = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(quest);
        braveKnight.embarkOnQuest();
        verify(quest,times(1)).embark();

    }
}
