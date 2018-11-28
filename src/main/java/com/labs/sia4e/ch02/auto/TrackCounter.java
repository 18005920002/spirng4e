package com.labs.sia4e.ch02.auto;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * 音轨计数器 记录一张CD中每首音乐被播放的次数
 *
 * @author win
 * @version v1.0 2018/11/28 23:22
 */
public class TrackCounter {
    private Map<Integer,Integer> trackCounts = new HashMap<Integer, Integer>();

    @Pointcut("execution(* com.labs.sia4e.ch02.auto.CompactDisc.playTrack(int)) " +
            "&& args(trackNumber)")
    public void trackPlayed(int trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currentCount=getPlayCount(trackNumber);
        trackCounts.put(trackNumber,currentCount + 1);
    }

    public int getPlayCount(int trackNumber){
        return trackCounts.containsKey(trackNumber)?trackCounts.get(trackNumber):0;
    }

}
