import java.util.Scanner;

public class Convertisseur1 {
    public static void main(String[] args) {
        //définition des variables
        float radian;
        int degré;

        Scanner sc = new Scanner(System.in);
        //demande la valeur

        System.out.print("Bonjour, veuillez entrer votre valeur en radian ");

        radian = sc.nextFloat();
        //calculer la variable

        degré = (int) (180 * (radian / Math.PI));
        //donner la valeur

        System.out.println("votre valeur en degré est  :" + degré);

        sc.close();
    }
}
