package com.jd.jr.test.service.impl;

import com.jd.jr.test.service.CompactDisc;

import java.util.List;

/**
 * Created by wuxiaozhou on 2017/7/19.8:53
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }
}
