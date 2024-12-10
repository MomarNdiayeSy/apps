import entity.Etudiant;
import entity.Employe;

public class Main {
    public static void main(String[] args) {
        Employe employe = new Employe("Sy", "Momar Ndiaye", "Designer", 2000000);
        employe.affiche();

        Etudiant etudiant = new Etudiant("Thiam", "Abdou Karim", 13.28);
        etudiant.affiche();

    }
}