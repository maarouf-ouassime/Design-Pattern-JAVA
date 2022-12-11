package decorateurs;

import composants.Boisson;

public class Caramel extends DecorateurAbstrait {

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + ", Caramel";
    }

    @Override
    public double cout() {
        return 0.5 + boisson.cout();
    }
}

