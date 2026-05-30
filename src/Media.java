import java.util.Scanner;

public class Media {
    protected String titre;
    protected int annee;
    protected Double note;
    protected String status;
    protected String auteur;

    public void ajoutMedia () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Titre : ");
        this.titre = scanner.nextLine();
        System.out.print("Auteur : ");
        this.auteur = scanner.nextLine();
        System.out.print("Année : ");
        int anneeTemp = scanner.nextInt();
        this.annee = (anneeTemp > 1950) ? anneeTemp : 0;
        scanner.nextLine();
        System.out.print("Note : ");
        double noteTemp = scanner.nextDouble();
        this.note = (noteTemp > 0) ? noteTemp : 0;
        int choix;
        do{
            System.out.println("Choix du Status ");
            System.out.println("1- En cours");
            System.out.println("2- Terminer");
            System.out.println("3- Abandonné");
            System.out.print("Status : ");
            choix = scanner.nextInt();
            switch (choix) {
                case 1 -> this.status = "En cours";
                case 2 -> this.status = "Terminé";
                case 3 -> this.status = "Abandonné";
            }
        }while (choix < 1 || choix > 3);
    }

    public void affichageMedia () {
        System.out.println("Titre : " + this.titre);
        System.out.println("Auteur : " + this.auteur);
        System.out.println("Année : " + this.annee);
        System.out.println("Note : " + this.note);
        System.out.println("Status : " + this.status);

    }

}

