import java.util.Scanner;

public class Media {
    protected String titre;
    protected int annee;
    protected Double note;
    protected String status;

    public static int nbMedia = 0;
    Scanner sacnner = new Scanner(System.in);

    public void ajoutMedia () {
        System.out.print("Titre : ");
        this.titre = sacnner.nextLine();
        System.out.print("Année : ");
        this.annee = sacnner.nextInt();
        System.out.print("Note : ");
        this.note = sacnner.nextDouble();
        Scanner sacnner = new Scanner(System.in);
        System.out.println("Choix du Status ");
        System.out.println("1- En cours");
        System.out.println("2- Terminer");
        System.out.println("3- Abandonné");
        System.out.print("Status : ");
        int choix = sacnner.nextInt();
        if (choix == 1)
            this.status = "En cours";
        else if (choix == 2)
            this.status = "Terminé";
        else if (choix == 3)
            this.status = "Abandonné";

        this.nbMedia++;
    }

    public void affichageMedia () {
        System.out.println("Titre : " + this.titre);
        System.out.println("Année : " + this.annee);
        System.out.println("Note : " + this.note);
        System.out.println("Status : " + this.status);
    }
}

