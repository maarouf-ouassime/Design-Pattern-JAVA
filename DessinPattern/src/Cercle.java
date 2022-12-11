


public class Cercle extends Figure{
    private Point centre;
    private double rayon;

    @Override
    public double perimetre() {
        return 2*Math.PI*rayon;
    }

    @Override
    public double surface() {
        return Math.PI*rayon*rayon;
    }

    @Override
    public void dessiner() {
    }

    @Override
    public void update(Observer observer) {

    }
}
