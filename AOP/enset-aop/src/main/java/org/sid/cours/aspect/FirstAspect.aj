package org.sid.cours.aspect;

public aspect FirstAspect {

    // pointcut pc1(): execution(* org.sid.cours.aspect.Main.main(..));

    /*
    before(): pc1() {
        System.out.println("--------------------------------------------");
        System.out.println("before main from aspect with aspectj syntax");
        System.out.println("--------------------------------------------");
    }

    after(): pc1() {
        System.out.println("--------------------------------------------");
        System.out.println("after main from aspect with aspectj syntax");
        System.out.println("--------------------------------------------");
    }


    void around(): pc1() {
        System.out.println("--------------------------------------------");
        System.out.println("around before main from aspect with aspectj syntax");
        System.out.println("--------------------------------------------");
        proceed();
        System.out.println("--------------------------------------------");
        System.out.println("around after main from aspect with aspectj syntax");
        System.out.println("--------------------------------------------");
    }
     */
}
