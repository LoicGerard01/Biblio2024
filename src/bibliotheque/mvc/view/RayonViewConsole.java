package bibliotheque.mvc.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static bibliotheque.utilitaires.Utilitaire.choixListe;

public class RayonViewConsole extends AbstractViewRayon{

    Scanner sc=new Scanner(System.in);
    @Override
    public void menu() {
        update(rayonController.getAll());
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

    @Override
    public void affList(List lr) {

    }

    public void ajouter(){

    }
    private void retirer(){

    }
    public void rechercher(){

    }
    public void modifier(){

    }
}
