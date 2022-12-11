


public class Rectangle extends Figure{
    private Point csg;
    private double l;
    private double h;

    @Override
    public double perimetre() {
        return 2*(l+h);
    }

    @Override
    public double surface() {
        return l*h;
    }

    @Override
    public void dessiner() {
    }

    @Override
    public void update(Observer observer) {

    }
}
