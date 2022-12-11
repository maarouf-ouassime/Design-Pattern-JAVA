package decorateurs;

import composants.Boisson;

public abstract class DecorateurAbstrait extends Boisson {

    protected Boisson boisson;

    public DecorateurAbstrait(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract String getDescription();


}
