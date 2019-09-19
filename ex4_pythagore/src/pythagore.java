import java.util.Scanner;

public class pythagore {
    public static void main(String[] args) {
        //définition des variables
        Scanner sc = new Scanner(System.in);
        double A, B, C;
        //demander les valeurs
        System.out.println("Bonjour, bienvenue dans le programme pythagore");
        System.out.println("Veuillez entrer votre A");
        A = sc.nextDouble();
        System.out.println("Veuillez entrer votre B");
        B = sc.nextDouble();
        //donner la valeur
        C = Math.round(Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2)));
        System.out.println("Le C (arrondi) est: " + C);
        sc.close();

    }
}
