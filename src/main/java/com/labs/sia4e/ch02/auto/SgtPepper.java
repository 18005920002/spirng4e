package com.labs.sia4e.ch02.auto;

import org.springframework.stereotype.Component;

/**
 * SgtPepper专辑，CD的实例
 *
 * @author win10
 * @version v1.0 2018/10/10 11:08
 */
@Component
public class SgtPepper implements CompactDisc {

    private String title="Track name";
    private String artist = "Sgt Pepper";

    @Override
    public void play(){
        System.out.println("Playing "+title+" by "+artist);
    }
}
