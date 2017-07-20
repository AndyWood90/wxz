package com.jd.jr.test.service.impl;

import com.jd.jr.test.service.CDPlayer;
import com.jd.jr.test.service.CompactDisc;
import org.springframework.context.annotation.Bean;

/**
 * Created by wuxiaozhou on 2017/7/18.9:30
 */
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("sgtPeppers playing");
    }


}
