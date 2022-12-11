package example2;

public class AffichageConditions implements Observateur, Affichage {
    private float temperature;
    private float humidite;
    private Sujet donneesMeteo;
    public AffichageConditions(Sujet dm){
        this.donneesMeteo=dm;
        donneesMeteo.enregisterObservateur(this);
    }
    public void afficher() {
        System.out.println("Conditions actuelles:"+
                temperature+" degrès et "+humidite+" % d'humidité");
    }
    public void actualiser(float t, float h, float p) {
        this.temperature=t;
        this.humidite=h;
        afficher();
    }
}
