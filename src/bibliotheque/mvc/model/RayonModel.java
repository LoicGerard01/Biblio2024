package bibliotheque.mvc.model;

import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.Rayon;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RayonModel extends DAORayon{
    private List<Rayon> ldatas = new ArrayList<>();
    @Override
    public Rayon add(Rayon r) {
        boolean present =ldatas.contains(r);
        if (!present) {
            ldatas.add(r);
            notifyObservers();
            return r;
        } else return null;
    }

    @Override
    public boolean remove(Rayon r) {
        boolean ok = ldatas.remove(r);
        notifyObservers();
        return ok;
    }

    @Override
    public Rayon update(Rayon r) {
        int p = ldatas.indexOf(r);
        if (p < 0) return null;
        ldatas.set(p, r);
        notifyObservers();
        return r;
    }

    @Override
    public Rayon read(Rayon rech) {
        int p = ldatas.indexOf(rech);
        if(p<0) return null;
        return ldatas.get(p);
    }

    @Override
    public List<Rayon> getAll() {
        return ldatas;
    }

    @Override
    public Set<Exemplaire> listerExemplaire(Rayon r) {
        return r.listerExemplaires();
    }
}
