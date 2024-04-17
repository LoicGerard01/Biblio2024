package bibliotheque.mvc.model;

import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.Rayon;

import java.util.ArrayList;
import java.util.List;

public class ExemplaireModel extends DAOExemplaire{

    private List<Exemplaire> lex = new ArrayList<>();
    @Override
    public Exemplaire add(Exemplaire ex) {
        boolean present = lex.contains(ex);
        if(!present){
            lex.add(ex);
            notifyObservers();
            return ex;
        }
        else return null;
    }

    @Override
    public boolean remove(Exemplaire ex) {
        boolean ok = lex.remove(ex);
        notifyObservers();
        return ok;
    }
    @Override
    public Exemplaire update(Exemplaire ex) {
        int p = lex.indexOf(ex);
        if(p<0) return null;
        lex.set(p,ex);
        notifyObservers();
        return ex;
    }

    @Override
    public Exemplaire read(Exemplaire rech) {
        int p = lex.indexOf(rech);
        if(p<0) return null;
        return lex.get(p);
    }

    @Override
    public List<Exemplaire> getAll() {
        return null;
    }

    @Override
    public Exemplaire setOuvrage(Ouvrage o) {
        return null;
    }

    @Override
    public Exemplaire setRayon(Rayon r) {
        return null;
    }

    @Override
    public List getNotification() {
        return null;
    }
}
