import entity.Produit;
import service.impl.ProduitImpl;

public class Main {
    public static void main(String[] args) {
        ProduitImpl produitService = new ProduitImpl();

        Produit produit = produitService.saisie();

        produitService.affichage(produit);
    }
}
