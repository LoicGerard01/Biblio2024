package bibliotheque.mvc.view;

import bibliotheque.metier.Lecteur;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static bibliotheque.utilitaires.Utilitaire.choixListe;

public class LecteurViewConsole extends AbstractViewLecteur{

    Scanner sc = new Scanner(System.in);
    @Override
    public void menu() {
        update(lecteurController.getAll());
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

    public void ajouter(){

    }
    private void retirer(){

    }
    public void rechercher(){

    }
    public void modifier(){

    }

    @Override
    public void affList(List ll) {

    }
}
