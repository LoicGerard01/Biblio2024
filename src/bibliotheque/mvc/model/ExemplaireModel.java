package bibliotheque.mvc.model;

import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.Rayon;

import java.util.ArrayList;
import java.util.List;

public class ExemplaireModel extends DAOExemplaire {

    private List<Exemplaire> ldatas = new ArrayList<>();

    @Override
    public Exemplaire add(Exemplaire ex) {
        boolean present = ldatas.contains(ex);
        if(!present){
            ldatas.add(ex);
            notifyObservers();
            return ex;
        }else return null;
    }

    @Override
    public boolean remove(Exemplaire ex) {
        boolean ok = ldatas.remove(ex);
        notifyObservers();
        return ok;
    }

    @Override
    public Exemplaire update(Exemplaire ex) {
        int p = ldatas.indexOf(ex);
        if (p < 0) return null;
        ldatas.set(p, ex);
        notifyObservers();
        return ex;
    }

    @Override
    public Exemplaire read(Exemplaire rech) {
        int p = ldatas.indexOf(rech);
        if(p<0) return null;
        return ldatas.get(p);
    }

    @Override
    public List<Exemplaire> getAll() {
        return ldatas;
    }

    @Override
    public Rayon getRayon(Exemplaire ex) {
        return ex.getRayon();
    }

    @Override
    public Ouvrage getOuvrage(Exemplaire ex) {
        return ex.getOuvrage();
    }
}
