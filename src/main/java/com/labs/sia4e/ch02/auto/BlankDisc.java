package com.labs.sia4e.ch02.auto;

import java.util.List;

/**
 * 空白CD
 *
 * @author win
 * @version v1.0 2018/11/28 23:16
 */
public class BlankDisc implements CompactDisc{

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title,String artist,List<String> tracks){
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing "+title+" by "+artist);
        for(String track:tracks){
            System.out.println("-Track: "+track);
        }
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("Playing track:"+trackNumber);
    }
}
