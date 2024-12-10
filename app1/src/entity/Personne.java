package entity;

public abstract class Personne implements IPersonne {
    protected String nom;
    protected String prenom;

    public Personne() {

    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public void saisie() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Veuillez saisir votre Nom  : ");
        nom = scanner.nextLine();

        System.out.print("Veuillez saisir votre Prénom : ");
        prenom = scanner.nextLine();
    }
}

