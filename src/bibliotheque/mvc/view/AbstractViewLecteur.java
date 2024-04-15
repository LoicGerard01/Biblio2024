package bibliotheque.mvc.view;

import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.Lecteur;
import bibliotheque.mvc.controller.LecteurController;
import bibliotheque.mvc.observer.Observer;

import java.util.List;

public abstract class AbstractViewLecteur implements Observer {
    protected LecteurController lecteurController;
    protected List<Lecteur> lec;
    public void setController(LecteurController lecteurController) {
        this.lecteurController = lecteurController;
    }
    public abstract void menu();
    public abstract void affList(List ll);
    public List<Lecteur> getAll(){
        return lec;
    }
    @Override
    public void update(List lec){
        this.lec = lec;
        affList(lec);
    }

}
