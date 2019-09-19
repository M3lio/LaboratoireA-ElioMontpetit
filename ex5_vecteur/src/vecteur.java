import java.util.Scanner;

public class vecteur {
    public static void main(String[] args) {
        double xa, ya, za, xb, yb, zb, distance;
        Scanner sc = new Scanner(System.in);

        //le point a
        System.out.println("Quel sont les coordones du point A?");
        System.out.println("xa : ");
        xa = sc.nextDouble();
        System.out.println("ya : ");
        ya = sc.nextDouble();
        System.out.println("za : ");
        za = sc.nextDouble();
        System.out.println("Le point A (" + xa + "," + ya + "," + za + ")");

        //le point b
        System.out.println("Quel sont les coordones du point B?");
        System.out.println("xb : ");
        xb = sc.nextDouble();
        System.out.println("yb : ");
        yb = sc.nextDouble();
        System.out.println("zb : ");
        zb = sc.nextDouble();
        System.out.println("Le point A (" + xb + "," + yb + "," + zb + ")");

        //on calcule la distance
        distance = (Math.sqrt(Math.pow((xb - xa), 2) + Math.pow((yb - ya), 2) + Math.pow((zb - za), 2)));
        System.out.println("La distance est : " + distance);
        sc.close();
    }
}
