import java.util.Scanner;
public class Manga extends Media{
    private int nbTomes;
    private String editeur;
    private String genre;

    public void ajoutManga () {
        ajoutMedia();
        System.out.print("Nombres de tomes : ");
        this.nbTomes = sacnner.nextInt();
        System.out.println("Choix du Genre");
        System.out.println("1- SHONEN");
        System.out.println("2- SHOJO");
        System.out.println("3- SEINEN");
        System.out.println("4- JOSEI");
        System.out.println("5- KODOMOMUKE");
        System.out.print("Genre : ");
        Scanner sacnner = new Scanner(System.in);
        int Choix = sacnner.nextInt();
        if (Choix == 1)
            this.genre = "En SHONEN";
        else if (Choix == 2)
            this.genre = "SHOJO";
        else if (Choix == 3)
            this.genre = "SEINEN";
        else if (Choix == 4)
            this.genre = "JOSEI";
        else if (Choix == 5)
            this.genre = "KODOMOMUKE";
        System.out.print("Editeur : ");
        this.editeur = sacnner.nextLine();
    }
}
