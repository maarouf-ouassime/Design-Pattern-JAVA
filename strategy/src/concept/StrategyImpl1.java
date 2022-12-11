package concept;

public class StrategyImpl1 implements IStrategy {
    @Override
    public void appliquer() {
        System.out.println("J'applique la Strategie 1");
    }
}
