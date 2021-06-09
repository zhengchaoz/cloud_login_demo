package com.zheng.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author 郑超
 * @create 2021/6/9
 */
@Aspect
@Component
public class LogAspect {

    Logger logger = LoggerFactory.getLogger(LogAspect.class);

    // 切入点
    @Pointcut("@annotation(com.zheng.annotation.RequiredLog)")
    public void doLog() {
    }

    @Around("doLog()")
    public Object diAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        Object o = joinPoint.proceed();
        logger.info("登录信息 ===" + Arrays.toString(args));
        logger.info("登录时间 ===" + LocalDateTime.now());
        logger.info("登录返回 ===" + o);

        System.out.println(joinPoint.getClass().getName());
        System.out.println(joinPoint.getSignature().getName());

        return o;
    }

}
