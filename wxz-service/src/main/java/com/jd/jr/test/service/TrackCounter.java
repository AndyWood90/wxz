package com.jd.jr.test.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuxiaozhou on 2017/8/25.16:23
 */
public class TrackCounter {

    private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

    public void countTrack(int trackNum) {
        int currentCount = getPlayCount(trackNum);
        trackCounts.put(trackNum, currentCount + 1);
    }

    private int getPlayCount(int trackNum) {
        return trackCounts.containsKey(trackNum) ? trackCounts.get(trackNum) : 0;
    }
}
