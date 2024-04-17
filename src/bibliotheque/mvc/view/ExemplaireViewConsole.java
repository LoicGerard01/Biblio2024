package bibliotheque.mvc.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.TypeOuvrage;
import static bibliotheque.utilitaires.Utilitaire.*;

public class ExemplaireViewConsole extends AbstractViewExemplaire {
    Scanner sc = new Scanner(System.in);

    @Override
    public void menu(){
        update(exemplaireController.getAll());
        List options = Arrays.asList("ajouter", "retirer", "rechercher","modifier","fin");
        do {
            int ch = choixListe(options);

            switch (ch) {
                case 1:
                    ajouter();
                    break;
                case 2:
                    retirer();
                    break;
                case 3:
                    rechercher();
                    break;
                case 4:
                    modifier();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
    public void ajouter() {
        Exemplaire ex;
        do {
            try {
                System.out.println("matricule ?");
                String mat = sc.nextLine();
                System.out.println("Description etat ?");
                String desc = sc.nextLine();

            } catch (Exception e) {
                System.out.println("une erreur est survenue : " + e.getMessage());
            }
        } while (true);
        exemplaireController.add(ex);
    }


    @Override
    public void affList(List le) {
        affListe(le);
    }
}
