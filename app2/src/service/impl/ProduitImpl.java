package service.impl;

import entity.Produit;
import service.impl.IProduit;

import java.util.Scanner;

public class ProduitImpl implements IProduit {

    @Override
    public Produit saisie() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la référence : ");
        String ref = sc.nextLine();

        System.out.print("Entrez le libellé : ");
        String libelle = sc.nextLine();

        System.out.print("Entrez la quantité : ");
        double quantite = sc.nextDouble();

        System.out.print("Entrez le prix : ");
        int prix = sc.nextInt();

        return new Produit(ref, libelle, quantite, prix);
    }

    @Override
    public void affichage(Produit produit) {
        System.out.println("Détails du produit :");
        System.out.println(produit.toString());
    }
}
