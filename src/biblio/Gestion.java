package biblio;

import biblio.metier.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Gestion {

    private static List<Auteur> listeAuteurs = new ArrayList<>();
    private static List<Lecteur> listeLecteurs = new ArrayList<>();
    private static List<Ouvrage> listeOuvrage = new ArrayList<>();
    private static List<Rayon> listeRayon = new ArrayList<>();
    private static List<Location> listeLocation = new ArrayList<>();


    public void menu() {
        Scanner scanner = new Scanner(System.in);

        String liste = "" +
                "\t1 - Ajout Auteur " + "" +
                "\n\t2 - Ajout Ouvrage " + "" +
                "\n\t3 - Ajout Lecteur " + "" +
                "\n\t4 - Ajout Rayon " + "" +
                "\n\t5 - Ajout Exemplaire " + "" +
                "\n\t6 - Louer " + "" +
                "\n\t7 - Rendre " + "" +
                "\n\t8 - Fin";

        int choix;
        do {
            String option;
            System.out.println("" + liste);
            option = saisieControlee("Choix ? ", "^(1[0-3]|[1-9])$");
            choix = Integer.parseInt(option);

            switch (choix) {
                case 1:
                    ajoutAuteur();
                    break;
                case 2:
                    ajoutOuvrage();
                    break;
                case 3:
                    ajoutLecteur();
                    break;
                case 4:
                    ajoutRayon();
                    break;
                case 5:
                    ajoutExemplaire();
                    break;
                case 6:
                    louer();
                    break;
                case 7:
                    rendre();
                    break;
                case 8:
                    System.out.println("Fin de programme ");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 8.");
            }
        } while (choix != 8);
    }
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
        String titre,langue,genre;
        int ageMin;
        LocalDate dateParution;
        TypeOuvrage typeOuvrage;
        double prixLocation;


    }
    public static void ajoutLecteur(){
        String nom,prenom,adresse,mail,tel,date;
        LocalDate dn;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy"); // format de la date

        Scanner sc=new Scanner(System.in);
        System.out.println("nom ?");
        nom=sc.nextLine();
        System.out.println("prenom ?");
        prenom=sc.nextLine();

        System.out.println("date de naissance ?");
        date = sc.nextLine();
        dn = LocalDate.parse(date,formatter);

        System.out.println("adresse ?");
        adresse = sc.nextLine();

        System.out.println("mail ?");
        mail = sc.nextLine();

        System.out.println("téléphone ?");
        tel = sc.nextLine();

        listeLecteurs.add(new Lecteur(nom,prenom,dn,adresse,mail,tel));
    }
    public static void ajoutRayon(){
        String codeRayon , genre;
        Scanner sc=new Scanner(System.in);
        System.out.println("code du rayon ?");
        codeRayon = sc.nextLine();
        System.out.println("genre du rayon ?");
        genre = sc.nextLine();

        listeRayon.add(new Rayon(codeRayon,genre));
    }
    public static void ajoutExemplaire(){

    }
    public static void louer(){

    }
    public static void rendre(){

    }

    public static String saisieControlee(String texte, String regex) {

        Scanner sc = new Scanner(System.in);
        String s;
        do {
            System.out.println(texte);
            s = sc.nextLine();
            if (!s.matches(regex)) {
                System.out.println("Erreur, recommencez ");
            }
        }
        while (!s.matches(regex));


        return s;
    }


    public static void main(String[] args) {
       /*
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
        */

        Gestion gestion = new Gestion();
        gestion.menu();

    }
}