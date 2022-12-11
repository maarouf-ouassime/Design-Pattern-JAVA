package concept;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.appliquerStrategie();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Choisissez une strategie :");
           String strategyClassName = scanner.nextLine();
            try {
                Class<?> strategyClass = Class.forName(strategyClassName);
                IStrategy strategy = (IStrategy) strategyClass.newInstance();
                context.setStrategie(strategy);
                context.appliquerStrategie();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }
}
