import entity.Chemise;
import entity.ChemiseImpl;
import entity.Montre;
import entity.MontreImpl;

public class Main {
    public static void main(String[] args) {
        ChemiseImpl chemiseImpl = new ChemiseImpl();
        Chemise chemise = chemiseImpl.saisie();
        chemiseImpl.affichage(chemise);

        MontreImpl montreImpl = new MontreImpl();
        Montre montre = montreImpl.saisie();
        montreImpl.affichage(montre);
    }
}
