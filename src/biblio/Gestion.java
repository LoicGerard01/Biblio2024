package biblio;

import biblio.metier.*;

import java.net.http.WebSocket;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static biblio.metier.TypeOuvrage.*;
import static biblio.metier.TypeLivre.*;
public class Gestion {

    private static List<Auteur> listeAuteurs = new ArrayList<>();
    private static List<Lecteur> listeLecteurs = new ArrayList<>();
    private static List<Ouvrage> listeOuvrage = new ArrayList<>();
    private static List<Rayon> listeRayon = new ArrayList<>();
    private static List<Location> listeLocation = new ArrayList<>();

    public static void ajoutAuteur(){
        String nom,prenom,nationalite;
        Scanner sc= new Scanner(System.in);

        System.out.println("nom ?");
        nom = sc.nextLine();

        System.out.println("prenom ?");
        prenom = sc.nextLine();

        System.out.println("nationalite ?");
        nationalite = sc.nextLine();

        Auteur a = new Auteur(nom,prenom,nationalite);
        listeAuteurs.add(a);
    }
    public static void ajoutOuvrage(){
        int choix ;
        do{
            Scanner sc =new Scanner(System.in);
            System.out.println("1.Livre");
            System.out.println("2.CD");
            System.out.println("3.DVD");
            System.out.println("Choix ?");
            choix=sc.nextInt();
        }while (choix < 1 || choix > 3);

    }
    public static void ajoutLecteur(){

    }
    public static void ajoutRayon(){

    }
    public static void ajoutExemplaire(){

    }
    public static void louer(){

    }
    public static void rendre(){

    }


    public static void main(String[] args) {
        Auteur a = new Auteur("Verne", "Jules", "France");
        Livre l = new Livre("Vingt mille lieues sous les mers", 10, LocalDate.of(1880, 1, 1), LIVRE, 1.50, "français", "aventure", "a125", 350, ROMAN, "histoire de sous-marin");

        a.getLouvrage().add(l);
        l.getLauteurs().add(a);

        Rayon r = new Rayon("r12", "aventure");
        Exemplaire e = new Exemplaire("m12", "état neuf", l);
        e.setRayon(r);
        r.getLex().add(e);

        Lecteur lec = new Lecteur("Dupont", "Jean", LocalDate.of(2000, 1, 4), "Mons", "jean.dupont@mail.com", "0458774411");
        Location loc = new Location(LocalDate.of(2023, 2, 1), LocalDate.of(2023, 3, 1), lec, e);


        lec.getLloc().add(loc);
        e.getLloc().add(loc);

        System.out.println(a);
        System.out.println(l);
        System.out.println(r);
        System.out.println(e);
        System.out.println(lec);
        System.out.println(loc);
    }
}