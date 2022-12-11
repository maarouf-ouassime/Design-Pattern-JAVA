package org.sid.comptes.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.sid.comptes.Compte;
import org.sid.comptes.MetierBanqueImpl;

@Aspect
public class PatchRetraitAspect {
    @Pointcut("execution(* org.sid.comptes.MetierBanqueImpl.retirer(..))")
    public void pc1(){}

    @Around("pc1() && args(code,mt)")
    public Object autourRetirer(
            Long code,
            double mt,
            ProceedingJoinPoint proceedingJoinPoint,
            JoinPoint joinPoint) throws Throwable {
        MetierBanqueImpl metierBanque = (MetierBanqueImpl) joinPoint.getTarget();
        Compte compte = metierBanque.consulter(code);
        if(compte.getSolde()<mt)
            throw new RuntimeException("Solde insuffisant");
        return proceedingJoinPoint.proceed();
    }
}
