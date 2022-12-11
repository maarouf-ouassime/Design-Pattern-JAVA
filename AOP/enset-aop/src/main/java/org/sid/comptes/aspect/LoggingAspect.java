package org.sid.comptes.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    public LoggingAspect() throws IOException {
        logger.addHandler(new FileHandler("log.xml"));
        logger.setUseParentHandlers(false);
    }
    Long t1,t2;
    @Pointcut("execution(* org.sid.comptes.MetierBanqueImpl.*(..))")
    public void pc1(){

    }
    /*
    @Before("pc1()")
    public void avant(JoinPoint joinPoint){
        t1=System.currentTimeMillis();
        logger.info("---------------------------------------------------------");
        logger.info("Avant l'execution de la methode "+joinPoint.getSignature());
    }

    @After("pc1()")
    public void apres(JoinPoint joinPoint){
        logger.info("Apres l'execution de la methode "+joinPoint.getSignature());
        t2=System.currentTimeMillis();
        logger.info("Duree d'execution de la methode "+(t2-t1));
        logger.info("---------------------------------------------------------");
    }
     */
    @Around("pc1()")
    public Object autour(ProceedingJoinPoint proceedingJoinPoint, JoinPoint joinPoint) throws Throwable {
        t1=System.currentTimeMillis();
        logger.info("---------------------------------------------------------");
        logger.info("Avant l'execution de la methode "+joinPoint.getSignature());
        Object obj = proceedingJoinPoint.proceed();
        logger.info("Apres l'execution de la methode "+joinPoint.getSignature());
        t2=System.currentTimeMillis();
        logger.info("Duree d'execution de la methode "+(t2-t1));
        logger.info("---------------------------------------------------------");
        return obj;
    }
}
