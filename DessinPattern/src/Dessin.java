public class Dessin{

    private TraitementStrategy traitementStrategy;

    private Figure[] figures;
    private int nbFigures;

    public Dessin(int nbFigures){
        this.figures = new Figure[nbFigures];
        this.nbFigures = 0;
    }

    public void addFigure(Figure f){
        if(nbFigures < figures.length){
            figures[nbFigures] = f;
            nbFigures++;
        }
    }

    public void dessiner(){
        for(int i = 0; i < nbFigures; i++){
            figures[i].dessiner();
        }
    }


    public void export(){

    }
    public void setTraitementStrategy(){

    }

}
