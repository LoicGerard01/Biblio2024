package bibliotheque.mvc.view;

import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.Ouvrage;
import bibliotheque.mvc.GestionMVC;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static bibliotheque.utilitaires.Utilitaire.choixElt;
import static bibliotheque.utilitaires.Utilitaire.choixListe;

public class ExemplaireViewConsole extends AbstractViewExemplaire {
    Scanner sc=new Scanner(System.in);
    @Override
    public void menu() {
        update(exemplaireController.getAll());
        List options = Arrays.asList("ajouter", "retirer", "rechercher","modifier","fin");
        do{
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
        }while (true);
    }
    public void ajouter(){

    }
    private void retirer(){
        int nl = choixElt(lex)-1;
        Exemplaire ex = lex.get(nl);
        boolean ok = exemplaireController.remove(ex);
        if(ok) affMsg("client effacé");
        else affMsg("client non effacé");
    }
    public void rechercher(){
        try{
            System.out.println("matricule");
            String matricule = sc.nextLine();
            Exemplaire rech = new Exemplaire(matricule,"",null);
            Exemplaire ex = exemplaireController.search(rech);
            if(ex==null) affMsg("exemplaire inconnu");
            else{
                affMsg(ex.toString());
            }
        }catch (Exception e){
            System.out.println("erreur : "+e);
        }
    }
    public void modifier(){

    }

    @Override
    public void affList(List lex) {

    }
    private void affMsg(String msg){
        System.out.println(msg);
    }
}
