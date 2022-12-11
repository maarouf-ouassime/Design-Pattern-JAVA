package decorateurs;

import composants.Boisson;

public class Vanille extends DecorateurAbstrait {

    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Vanille";
    }

    @Override
    public double cout() {
        return 0.9 + boisson.cout();
    }
}

