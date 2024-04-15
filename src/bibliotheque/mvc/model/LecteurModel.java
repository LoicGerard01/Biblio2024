package bibliotheque.mvc.model;

import bibliotheque.metier.Auteur;
import bibliotheque.metier.Lecteur;

import java.util.ArrayList;
import java.util.List;

public class LecteurModel extends DAOLecteur {

    private List<Lecteur> ldatas = new ArrayList<>();
    @Override
    public Lecteur add(Lecteur lec) {
        boolean present =ldatas.contains(lec);
        if (!present) {
            ldatas.add(lec);
            notifyObservers();
            return lec;
        } else return null;
    }

    @Override
    public boolean remove(Lecteur lec) {
        boolean ok = ldatas.remove(lec);
        notifyObservers();
        return ok;
    }

    @Override
    public Lecteur update(Lecteur lec) {
        int p = ldatas.indexOf(lec);
        if (p < 0) return null;
        ldatas.set(p, lec);
        notifyObservers();
        return lec;
    }

    @Override
    public Lecteur read(Lecteur lec) {
        int p = ldatas.indexOf(lec);
        if(p<0) return null;
        return ldatas.get(p);
    }

    @Override
    public List<Lecteur> getAll() {
        return ldatas;
    }
}
