import java.util.Scanner;

public class experienceVerte {
    public static void main(String[] args) {
        //Définition des variables
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f, k, co2, _, mk_2;
        System.out.println("Entree des quantites...");
        System.out.println("A >");
        a = sc.nextInt();
        System.out.println("B >");
        b = sc.nextInt();
        System.out.println("C >");
        c = sc.nextInt();
        System.out.println("D >");
        d = sc.nextInt();
        System.out.println("E >");
        e = sc.nextInt();
        System.out.println("F >");
        f = sc.nextInt();
        co2 = 0;
        _ = 0;

        //Affichage des variables
        System.out.println("A_" + _ + "{" + a + "} B_" + _ + "{" + b + "} C_" + _ + "{" + c + "} D_" + _ + "{" + d + "} E_" + _ + "{" + e + "} F_" + _ + "{" + f + "} co2_" + _ + "{" + co2 + "}");
        //Début des Réactions
        //R1
        System.out.println("R1:2A + 4C => 3D + CO2");
        k = Math.min(a / 2, c / 4);
        a -= 2 * k;
        c -= 4 * k;
        d += 3 * k;
        co2 = k;
        _ = 1;
        System.out.println("k > " + k);
        System.out.println("A_" + _ + "{" + a + "} B_" + _ + "{" + b + "} C_" + _ + "{" + c + "} D_" + _ + "{" + d + "} E_" + _ + "{" + e + "} F_" + _ + "{" + f + "} co2_" + _ + "{" + co2 + "}");
        //R2
        System.out.println("R2:B + 2C + E => 4F + 4CO2");
        mk_2 = Math.min(b, c / 2);
        k = Math.min(mk_2, e);
        b -= k;
        c -= 2 * k;
        e -= k;
        f += 4 * k;
        co2 += 4 * k;
        _ = 2;
        System.out.println("k > " + k);
        System.out.println("A_" + _ + "{" + a + "} B_" + _ + "{" + b + "} C_" + _ + "{" + c + "} D_" + _ + "{" + d + "} E_" + _ + "{" + e + "} F_" + _ + "{" + f + "} co2_" + _ + "{" + co2 + "}");
        //R3
        System.out.println("R3:A/2 + 4F => B + 4E + CO2");
        k = Math.min(2 * a, f / 4);
        a -= k / 2;
        f -= 4 * k;
        b += k;
        e += 4 * k;
        co2 += k;
        _ = 3;
        System.out.println("k > " + k);
        System.out.println("A_" + _ + "{" + a + "} B_" + _ + "{" + b + "} C_" + _ + "{" + c + "} D_" + _ + "{" + d + "} E_" + _ + "{" + e + "} F_" + _ + "{" + f + "} co2_" + _ + "{" + co2 + "}");

        sc.close();


    }
}
