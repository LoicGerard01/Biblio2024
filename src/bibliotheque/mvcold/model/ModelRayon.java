package bibliotheque.mvcold.model;

import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.Rayon;
import bibliotheque.mvc.model.ModelList;

import java.util.ArrayList;
import java.util.List;

public class ModelRayon extends ModelList<Rayon> implements DAOSpecialRayon{
    @Override
    public List<Exemplaire> listerExemplaires(Rayon r) {
        return new ArrayList<>(r.listerExemplaires());
    }
}