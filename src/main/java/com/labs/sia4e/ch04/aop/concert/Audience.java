package com.labs.sia4e.ch04.aop.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 观众类，这是一个切面
 *
 * @author win10
 * @version v1.0 2018/11/23 11:26
 */
@Component
@Aspect
public class Audience {

    //定义命名的切点
    @Pointcut("execution(* com.labs.sia4e.ch04.aop.concert.Performance.perform(..))")
    public void point(){}

    //无效 * 只代表一级目录，不能代表多级目录
    //@Before("execution(* *.sia4e.ch04.aop.concert.Performance.perform(..))")

    //有效
    //@Before("execution(* *.labs.sia4e.ch04.aop.concert.Performance.perform(..))")

    //有效
    //@Before("execution(* com.labs.sia4e.ch04.aop.concert.Performance.perform(..))")

    /**
     * 前置通知
     */
    @Before("point()")
    public void silenceCellPhone(){
        System.out.println("silence Cell Phone ...");
    }

    /**
     * 前置通知
     */
    @Before("point()")
    public void takeSeats(){
        System.out.println("take Seats ...");
    }
    /**
     * 后置通知
     */
    @AfterReturning("point()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP ...");
    }
    /**
     * 异常通知
     */
    @AfterThrowing("point()")
    public void demandRefund(){
        System.out.println("demand Refund ...");
    }

    /**
     * 环绕通知
     * @param joinPoint
     */
    /*@Around("point()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("2. silence Cell Phone ...");
            System.out.println("2. take Seats ...");
            joinPoint.proceed();
            System.out.println("2. CLAP CLAP CLAP ...");
        } catch (Throwable throwable) {
            System.out.println("2. demand Refund ...");
        }
    }*/

}
