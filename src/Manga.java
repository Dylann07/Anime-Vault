import java.util.Scanner;
public class Manga extends Media{
    private int nbTomes;
    private String editeur;
    private String genreM;

    public void constuct (String titre , String auteur , int annee , double note ,String status , String genreM , int nbTomes , String editeur)
    {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.note = note;
        this.status = status;
        this.genreM = genreM;
        this.nbTomes = nbTomes;
        this.editeur = editeur;
    }
    public void ajoutManga () {
        ajoutMedia();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Editeur : ");
        this.editeur = scanner.nextLine();
        System.out.print("Nombres de tomes : ");
        int nbTomesTemp = scanner.nextInt();
        this.nbTomes = (nbTomesTemp > 0) ? nbTomesTemp : 0;
        scanner.nextLine();
        int Choix;
        do {
            System.out.println("Choix du Genre");
            System.out.println("1- SHONEN");
            System.out.println("2- SHOJO");
            System.out.println("3- SEINEN");
            System.out.println("4- JOSEI");
            System.out.println("5- KODOMOMUKE");
            System.out.print("Genre : ");
            Choix = scanner.nextInt();
            switch (Choix) {
                case 1 -> this.genreM = "SHONEN";
                case 2 -> this.genreM = "SHOJO";
                case 3 -> this.genreM = "SEINEN";
                case 4 -> this.genreM = "JOSEI";
                case 5 -> this.genreM = "KODOMOMUKE";
            }
        }while (Choix < 1 || Choix > 5);
    }

    public void affichageManga ()
    {
        affichageMedia();
        System.out.println("Nb de Tomes : " + this.nbTomes);
        System.out.println("Editeur : " + this.editeur);
        System.out.println("Genre : " + this.genreM);
    }

    public int getNbTomes()
    {
        return nbTomes;
    }

    public String getEditeur()
    {
        return editeur;
    }

    public String getGenreM()
    {
        return genreM;
    }


    public void setNbTomes(int nbTomes)
    {
        this.nbTomes = nbTomes;
    }

    public void setEditeur(String editeur)
    {
        this.editeur = editeur;
    }

    public void setGenreM(String genreM)
    {
        this.genreM = genreM;
    }

}
