package com.jd.jr.test.service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wuxiaozhou on 2017/8/26.11:39
 */
public class CriticAspect {
    private static final Set<String> strs = new HashSet<String>();
    public static void main(String[] args) {
        strs.add("a");
        System.out.println(strs);
        strs.add("b");
    }
}
