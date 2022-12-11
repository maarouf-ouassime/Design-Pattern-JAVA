package org.sid.comptes;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        new Application().start();
    }

    public void start() {
        System.out.println("Demarrage de l'application");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner le code du compte : ");
        Long code = scanner.nextLong();
        System.out.println("Donner le solde initiale de compte : ");
        double solde = scanner.nextDouble();
        IMetierBanque metierBanque = new MetierBanqueImpl();
        metierBanque.addCompte(new Compte(code,solde));
        while (true){
            try {
                System.out.println("Type Operation : ");
                String type = scanner.next();
                if (type.equals("q")) {
                    break;
                }
                System.out.println("Montant : ");
                double mt = scanner.nextDouble();
                if(type.equals("v")){
                    metierBanque.verser(code,mt);
                } else if (type.equals("r")) {
                    metierBanque.retirer(code,mt);
                }
                Compte compte = metierBanque.consulter(code);
                System.out.println("Etat du compte : "+compte.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());;
            }
        }
        System.out.println("Fin de l'application");
    }
}
