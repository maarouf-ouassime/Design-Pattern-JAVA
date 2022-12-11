package concept;

public class Context {
    private IStrategy strategie = new StrategyImpl1();
    public void appliquerStrategie() {
        System.out.println("Initialisation de la strategie");
        System.out.println("-----------------------------");
        strategie.appliquer();
        System.out.println("-----------------------------");
    }

    public void setStrategie(IStrategy strategie) {
        this.strategie = strategie;
    }
}
