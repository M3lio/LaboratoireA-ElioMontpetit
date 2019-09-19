//Projet salutation, par Élio Montpetit

import java.util.Scanner;

public class salutation {
    public static void main(String[] args) {

        //définir les variables
        String nom;
        //demander le nom
        Scanner sc = new Scanner(System.in);
        System.out.println("bonjour, quel est votre nom?");
        //lire le nom
        nom = sc.next();
        System.out.println();
        //dire bonjour "nom"
        System.out.println();
        System.out.println("Bonjour " + nom);

        sc.close();


    }


}
