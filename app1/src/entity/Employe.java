package entity;

public class Employe extends Personne {
    private String fonction;
    private int salaire;

    public Employe(String nom, String prenom, String fonction, int salaire) {
        super(nom, prenom);
        this.fonction = fonction;
        this.salaire = salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void affiche() {
        System.out.println("EMPLOYE : " + nom + " " + prenom + ", FONCTION : " + fonction + ", SALAIRE : " + salaire);
    }
}
