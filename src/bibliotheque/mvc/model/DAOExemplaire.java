package bibliotheque.mvc.model;

import bibliotheque.metier.*;
import bibliotheque.mvc.observer.Subject;

import java.util.List;
import java.util.Set;

public abstract class DAOExemplaire extends Subject {
    public abstract Exemplaire add(Exemplaire ex);
    public abstract boolean remove(Exemplaire ex);
    public abstract Exemplaire update(Exemplaire ex) ;

    public abstract Exemplaire read(Exemplaire ex) ;

    public abstract List<Exemplaire> getAll() ;

    public abstract Exemplaire setOuvrage (Ouvrage o);
    public abstract Exemplaire setRayon (Rayon r);

}
