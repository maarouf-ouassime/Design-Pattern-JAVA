public class Main {
    public static void main(String[] args) {
        Dessin dessin = new Dessin(1);
        dessin.addFigure(new Cercle());
        dessin.addFigure(new Rectangle());

        dessin.dessiner();
    }
}
