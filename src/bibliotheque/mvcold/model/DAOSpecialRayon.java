package bibliotheque.mvcold.model;

import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.Lecteur;
import bibliotheque.metier.Rayon;

import java.util.List;

public interface DAOSpecialRayon {
    public List<Exemplaire> listerExemplaires(Rayon r) ;
    
}
