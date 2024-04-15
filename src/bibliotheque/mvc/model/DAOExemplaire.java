package bibliotheque.mvc.model;

import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.Rayon;
import bibliotheque.mvc.observer.Subject;

import java.util.List;

public abstract class DAOExemplaire extends Subject {

    public abstract Exemplaire add(Exemplaire ex) ;

    public abstract boolean remove( Exemplaire ex) ;

    public abstract Exemplaire update(Exemplaire ex) ;

    public abstract Exemplaire read(Exemplaire rech) ;

    public abstract List<Exemplaire> getAll() ;

    public abstract Rayon getRayon(Exemplaire ex);
    public abstract Ouvrage getOuvrage(Exemplaire ex);

    public List<Exemplaire> getNotification(){
        return getAll();
    }


}
