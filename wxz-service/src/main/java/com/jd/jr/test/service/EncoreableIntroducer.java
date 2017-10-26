package com.jd.jr.test.service;

import com.jd.jr.test.service.impl.DefaultEncoreable;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by wuxiaozhou on 2017/8/26.11:24
 */
@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "com.jd.jr.test.service.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;

}
