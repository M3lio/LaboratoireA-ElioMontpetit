import java.util.Scanner;
import java.text.DecimalFormat;
public class Convertisseur2 {
    public static void main(String[] args){
        //définition des variables
        int degres;
        double radians;

        Scanner sc = new Scanner(System.in);
        //défi: arrondir

        DecimalFormat df = new DecimalFormat("###.##");
        //demander la valeur

        System.out.print("Bonjour, veuillez entrer votre valeur en degres ");

        degres = sc.nextInt();
        //calculer la valeur en radians

        radians = Math.toRadians(degres);
        //donner la valeur en radian

        System.out.println("votre valeur en radians est  :"+radians);

        System.out.println("votre valeur en radians formatees est   :"+df.format(radians));



        sc.close();
    }
}
