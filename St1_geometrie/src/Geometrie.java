public class Geometrie {
    public static void main(String[] args) {
        //définition des variables

        float rayon, longueur, hauteur, surfaceCercle, surfaceCube, volumeCube, surfaceCylindre;
        float volumeCylindre, apothemeCone, surfaceCone, volumeCone;

        rayon = 10;
        longueur = 7;
        hauteur = 5;

        //cercle

        System.out.println("Le cercle");

        System.out.println("- Rayon     : " + rayon);

        surfaceCercle = (float) ((Math.pow(rayon, 2)) * Math.PI);

        System.out.println("- Surface   : " + surfaceCercle);

        //Cube

        System.out.println("Le cube");

        System.out.println("- longueur  : " + longueur);

        surfaceCube = (float) (Math.pow(longueur, 2) * 6);

        System.out.println("- Surface   : " + surfaceCube);

        volumeCube = (float) (Math.pow(longueur, 3));

        System.out.println("- Volume    : " + volumeCube);

        //Cylindre

        System.out.println("Le cylindre");

        System.out.println("- rayon     : " + rayon);

        System.out.println("- hauteur   : " + hauteur);

        surfaceCylindre = (float) ((Math.PI * 2 * hauteur * rayon) + (2 * ((Math.pow(rayon, 2) * Math.PI))));

        System.out.println("- Surface   : " + surfaceCylindre);

        volumeCylindre = (float) ((Math.pow(rayon, 2) * Math.PI) * hauteur);

        System.out.println("- Volume    : " + volumeCylindre);

        //Cone

        System.out.println("Le cone");

        System.out.println("- rayon     : " + rayon);

        System.out.println("- hauteur   : " + hauteur);

        apothemeCone = (float) (Math.sqrt(Math.pow(hauteur, 2) + Math.pow(rayon, 2)));

        System.out.println("- apotheme  : " + apothemeCone);

        surfaceCone = (float) ((Math.PI * Math.pow(rayon, 2)) + (Math.PI * rayon * apothemeCone));

        System.out.println("- Surface   : " + surfaceCone);

        volumeCone = (float) (((Math.PI * Math.pow(rayon, 2) * hauteur) / 3));

        System.out.println("- Volume    : " + volumeCone);

    }
}
