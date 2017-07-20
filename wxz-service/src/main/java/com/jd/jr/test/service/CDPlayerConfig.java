package com.jd.jr.test.service;

import com.jd.jr.test.service.impl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wuxiaozhou on 2017/7/18.9:23
 */
@Configuration
public class CDPlayerConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
    @Bean
    public CDPlayer anotherCDPlayer() {
        return new CDPlayer(sgtPeppers());
    }
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
