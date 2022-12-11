package decorateurs;

import composants.Boisson;

public class Chocolat extends DecorateurAbstrait {

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Chocolat";
    }

    @Override
    public double cout() {
        return 1.5 + boisson.cout();
    }
}
