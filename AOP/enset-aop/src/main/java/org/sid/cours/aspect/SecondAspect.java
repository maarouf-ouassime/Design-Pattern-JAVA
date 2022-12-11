package org.sid.cours.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class SecondAspect {

    @Pointcut("execution(* org.sid.*.main(..))")
    public void pc1(){

    }

   /* @Before("pc1()")
    public void beforeMain(){
        System.out.println("******************************************");
        System.out.println("before main from aspect with class syntax");
        System.out.println("******************************************");
    }

    @After("pc1()")
    public void afterMain(){
        System.out.println("******************************************");
        System.out.println("after main from aspect with class syntax");
        System.out.println("******************************************");
    }

    @Around("pc1()")
    public void aroundMain(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("******************************************");
        System.out.println("before main from aspect with class syntax");
        System.out.println("******************************************");
        proceedingJoinPoint.proceed();
        System.out.println("******************************************");
        System.out.println("after main from aspect with class syntax");
        System.out.println("******************************************");
    }
*/
}
