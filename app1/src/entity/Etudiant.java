package entity;

public class Etudiant extends Personne {
    private String matricule;
    private double moyenne;


    public Etudiant(String nom, String prenom, double moyenne) {
        super(nom, prenom);
        this.moyenne = moyenne;
        this.matricule = generateMatricule();
    }

    public String getMatricule() {
        return matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public String generateMatricule() {
        return "ETU" + ((int) (Math.random() * 10000));
    }

    @Override
    public void affiche() {
        System.out.println("ETUDIANT : " + nom + " " + prenom + ", MATRICULE : " + matricule + ", MOYENNE : " + moyenne);
    }
}
