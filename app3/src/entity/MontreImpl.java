package entity;
import java.util.Scanner;

public class MontreImpl implements IMontre {
    @Override
    public Montre saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir votre l'ID de la montre : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Veuillez saisir votre le libellé de la montre : ");
        String lib = scanner.nextLine();

        System.out.print("Veuillez saisir votre la nature de la montre : ");
        String nature = scanner.nextLine();

        return new Montre(id, lib, nature);
    }

    @Override
    public void affichage(Montre m) {
        System.out.println("ID : " + m.getId() + ", Libellé : " + m.getLib() + ", Nature : " + m.getNature());
    }
}

