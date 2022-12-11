import composants.Boisson;
import composants.Espresso;
import decorateurs.Chocolat;
import decorateurs.Vanille;

public class Main {
    public static void main(String[] args) {

        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescription() + " " + boisson.cout());
        System.out.println("****************");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription() + " " + boisson.cout());
        System.out.println("****************");
        boisson = new Vanille(boisson);
        System.out.println(boisson.getDescription() + " " + boisson.cout());
        System.out.println("****************");
        boisson = new Vanille(boisson);
        System.out.println(boisson.getDescription() + " " + boisson.cout());

    }
}
