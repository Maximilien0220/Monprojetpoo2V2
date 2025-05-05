package com.exemple;

import java.util.Scanner;

public class SuiteGeometrique {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         -------------------------------
         Ce programme calcule la somme des n premiers termes
         d'une suite géométrique définie par :
         Un = U1 * q^(n-1)

         L'utilisateur entre :
         - le premier terme (U1)
         - la raison (q)
         - le nombre de termes (n)
         -------------------------------
         Lecture des valeurs saisies par l'utilisateur
        */

        System.out.print("Entrez le premier terme U1 : ");
        double U1 = scanner.nextDouble();

        System.out.print("Entrez la raison q : ");
        double q = scanner.nextDouble();

        System.out.print("Entrez le nombre de termes n : ");
        int n = scanner.nextInt();

        // Affichage de l'expression générale de la suite
        System.out.println("\nExpression de la suite : Un = " + U1 + " × " + q + "^(n-1)");
        System.out.println("Calcul des " + n + " premiers termes :");

        // Affichage des termes de la suite
        for (int i = 0; i < n; i++) {
            double terme = U1 * Math.pow(q, i);  // Ui = U1 * q^i
            System.out.println("U" + (i + 1) + " = " + terme);
        }

        // Calcul de la somme selon la formule
        double somme;
        if (q == 1) {
            somme = U1 * n;  // Cas particulier si la raison est 1
        } else {
            somme = U1 * (1 - Math.pow(q, n)) / (1 - q);
        }

        // Affichage de la somme
        System.out.println("\nLa somme des " + n + " premiers termes est : " + somme);

        scanner.close();
    }
}
