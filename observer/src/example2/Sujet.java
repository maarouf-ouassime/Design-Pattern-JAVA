package example2;

public interface Sujet {
    void enregisterObservateur(Observateur obs);
    void supprimerObservateur(Observateur obs);
    void notifierObservateurs();
}
