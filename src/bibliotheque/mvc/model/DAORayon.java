package bibliotheque.mvc.model;

import bibliotheque.metier.Auteur;
import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.Rayon;
import bibliotheque.mvc.observer.Subject;

import java.util.List;
import java.util.Set;

public abstract class DAORayon extends Subject {
    public abstract Rayon add(Rayon r) ;

    public abstract boolean remove( Rayon r) ;

    public abstract Rayon update(Rayon r) ;

    public abstract Rayon read(Rayon rech) ;

    public abstract List<Rayon> getAll() ;

    public abstract Set<Exemplaire> listerExemplaire(Rayon r);
    public List<Rayon> getNotification(){return getAll();}
}
