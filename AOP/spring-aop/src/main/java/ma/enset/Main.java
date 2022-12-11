package ma.enset;

import ma.enset.service.IMetier;
import ma.enset.service.SecurityContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = {"ma.enset"})
public class Main {
    public static void main(String[] args) {
       try {
           SecurityContext.authenticate("root","1234",new String[]{"USER","ADMIN"});

           ApplicationContext applicationContext =
                   new AnnotationConfigApplicationContext(Main.class);

           IMetier metier = applicationContext.getBean(IMetier.class);
           System.out.println("*************************");
           System.out.println(metier.getClass().getName());
           System.out.println("*************************");
           metier.process();
           System.out.println(metier.compute());

       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
