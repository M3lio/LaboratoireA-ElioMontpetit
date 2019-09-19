public class Typage {
    public static void main(String[] args) {
        int var1;
        double var2;
        char var3;

        //Conversion #1: var1  String
        var1 = 42;
        String str1 = Integer.toString(var1);
        System.out.println("La var1 en string est : " + str1);

        //Conversion #2
        //conversion, à premiere vue impossible, car un chiffre n'est ni vrai ni faux, c'est un chiffre, une valeur.
        //quand j'écrit un truc du genre "boolean boo1 = var1;", il s'affiche un message d'erreur
        //de plus, sur internet, je ne trouve rien à ce propos
        System.out.println("la var1 en Boolean est inconvertible");

        //conversion #3
        var2 = 4.2;
        int int1 = (int) var2;
        System.out.println("la var2 en Entier est: " + int1);

        //Conversion #4
        String str2 = Double.toString(Math.round(var2));
        System.out.println("la var2 arrondie en string est: " + str2);

        //Conversion #5
        var3 = '1';
        int int2 = var3;
        System.out.println("la var3 en entier est: " + int2);
        // la valeur en ACII de '1' est 48 + (1) donc 49
        char char1 = 'A';
        int int3 = char1;
        System.out.println("la char1 en entier est: " + int3);
        //A est le 65 char

        //DÉFI
        /*Operation 1 : ici on place 1 (int) à côté de 1.0 (float) donc 11.0
          Operation 2 : ici on on additionne 1 et 1.0 donc 2.0
          Operation 3 : ici on place 1 (int) à côté de 1.0 (float) à côté de 1 (char) donc 1/1.0/1 -> 11.01
          Operation 4 : ici on place 1 (int) à côté de l'addition de 1.0 et de la valeur 1 1 en ASCII, donc 49
          ce qui donne 1/50.0 donc 150.0
         */


    }
}
