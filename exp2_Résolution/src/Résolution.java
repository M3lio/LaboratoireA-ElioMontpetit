import java.util.Random;
import java.util.Scanner;


public class Résolution {
    public static void main(String[] args) {
        double a, b, c, discriminant, x1, x2;
        final int MIN = 1, MAX = 10;


        /*Scanner sc = new Scanner(System.in);
        //Ici on scan les variables
        System.out.println("Bonjour, bienvenue au Résolveur d'équation de second degré");
        System.out.println("veuillez entrer le a");
        a = sc.nextDouble();
        System.out.println("veuillez entrer le b");
        b = sc.nextDouble();
        System.out.println("veuillez entrer le c");
        c = sc.nextDouble();
        System.out.println("les variables a, b et c sont: " + a + "," + b + "," + c);

        //on fait des gros calculs

        discriminant=(Math.sqrt((Math.pow(b, 2))- 4*a*c));
        x1=((-b+discriminant)/(2*a));
        x2=((-b-discriminant)/(2*a));

        //on donnes les info
        System.out.println("Le discriminant est: "+discriminant);
        System.out.println("x1: "+x1);
        System.out.println("x2: "+x2);
         sc.close();
         */
        //alors ici on crée un randomiseur
        Random r = new Random();
        a = ((r.nextDouble() * (MAX - MIN)) + MIN);
        b = ((r.nextDouble() * (MAX - MIN)) + MIN);
        c = ((r.nextDouble() * (MAX - MIN)) + MIN);
        System.out.println("a, b et c sont: " + a + ", " + b + ", " + c);

        discriminant = (Math.sqrt((Math.pow(b, 2)) - 4 * a * c));
        x1 = ((-b + discriminant) / (2 * a));
        x2 = ((-b - discriminant) / (2 * a));

        System.out.println("Le discriminant est: " + discriminant);
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        //ne marche presque jamais, MAIS au moins, fonctionne.


    }
}
