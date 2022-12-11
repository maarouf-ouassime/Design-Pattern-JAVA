


public abstract class Figure implements Observer{
    public double epaisseurContour;
    public String couleurContour;
    public String couleurRemplissage;

    @Override
    public void update(Observable observable) {
        this.epaisseurContour=((DefaultSettings)observable).getEpaisseur();
        this.couleurContour=((DefaultSettings)observable).getCouleurContour();
        this.couleurRemplissage=((DefaultSettings)observable).getCouleurRemplissage();
    }

    public abstract double perimetre();
    public abstract double surface();
    public abstract void dessiner();

}
