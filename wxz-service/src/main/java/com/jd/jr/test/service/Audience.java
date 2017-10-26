package com.jd.jr.test.service;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by wuxiaozhou on 2017/8/25.15:53
 */
public class Audience {
    public void silenceCellPhones() {
        System.out.println("silenceCellPhones");
    }
    public void takeSeats() {
        System.out.println("takeSeats");
    }
    public void applause() {
        System.out.println("clap clap clap");
    }
    public void demandRefund() {
        System.out.println("demandRefund");
    }
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("silenceCellPhones");
            System.out.println("takeSeats");
            jp.proceed();
            System.out.println("clap clap clap");
        } catch (Throwable e) {
            System.out.println("demanding a refund");
        }
    }
}
