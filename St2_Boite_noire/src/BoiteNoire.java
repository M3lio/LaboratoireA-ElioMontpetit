import java.text.DecimalFormat;

public class BoiteNoire {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#######.##");
        //définition des variables
        double mVolSphere, poidsSphere, rayonSphere, volumeSphere, mVolSubstanceIsolation, poidsSubstanceIsolation;
        double volumeSubstanceIsolation, quantiteSubstanceIsolation, poidsBoite, volumeBoite, poidsTotal;
        mVolSphere = 3517.0;
        poidsBoite = 375.0;
        volumeBoite = 125.0;
        rayonSphere = 2.15;
        mVolSubstanceIsolation = 13545.88;
        //calculs+définitions de ces variables
        volumeSphere = ((Math.pow(rayonSphere, 3) * 4 * Math.PI) / 3);
        poidsSphere = (mVolSphere * volumeSphere);
        volumeSubstanceIsolation = (volumeBoite - volumeSphere);
        poidsSubstanceIsolation = (mVolSubstanceIsolation * volumeSubstanceIsolation);
        quantiteSubstanceIsolation = (volumeSubstanceIsolation * 1000);
        poidsTotal = (poidsBoite + poidsSphere + poidsSubstanceIsolation);


        // Affichage du rapport d'informations
        System.out.println("-------------------------------------------");
        System.out.println("- RAPPORT D'INFORMATIONS");
        System.out.println(" Sphere");
        System.out.println(" * Masse volumique : " + mVolSphere + " kg/m3");
        System.out.println(" * Poids : " + df.format(poidsSphere) + " kg");
        System.out.println(" * Rayon : " + rayonSphere + " m");
        System.out.println(" * Volume : " + volumeSphere + " m3");
        System.out.println(" Substance isolante");
        System.out.println(" * Masse volumique : " + mVolSubstanceIsolation + " kg/m3");
        System.out.println(" * Poids : " + df.format(poidsSubstanceIsolation) + " kg");
        System.out.println(" * Volume : " + volumeSubstanceIsolation + " m3");
        System.out.println(" * Quantite : " + quantiteSubstanceIsolation + " l");
        System.out.println(" Boite noire");
        System.out.println(" * Poids : " + df.format(poidsBoite) + " kg");
        System.out.println(" * Volume : " + volumeBoite + " m3");
        System.out.println(" * Poids total : " + df.format(poidsTotal) + " kg");
        System.out.println("-------------------------------------------");

    }
}
