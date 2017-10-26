package com.jd.jr.test.service.impl;

import com.jd.jr.test.service.QLMockService;
import com.jd.jr.test.service.vo.QueryRequest;
import org.springframework.stereotype.Service;

/**
 * Created by wuxiaozhou on 2017/8/11.13:53
 */
@Service
public class QLMockServiceImpl implements QLMockService {
    @Override
    public Boolean query(QueryRequest request) {
        System.out.println("logger");
        System.out.println("logger2");
        return true;

    }

    private static InnerClass innerClass = new InnerClass();

    public static InnerClass getInnerClass() {
        return new InnerClass();
    }

    private static class InnerClass {
        private static InnerClass instance;
        private InnerClass (){}

        public static InnerClass getInstance() {
            if (instance == null) {
                instance = new InnerClass();
            }
            return instance;
        }
    }
}
