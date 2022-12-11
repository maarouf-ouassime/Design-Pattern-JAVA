package decorateurs;

import composants.Boisson;

public class Chantilly extends DecorateurAbstrait {
    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Chantilly";
    }

    @Override
    public double cout() {
        return 2.0 + boisson.cout();
    }
}
