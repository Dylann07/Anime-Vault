import java.util.Scanner;

public class Anime extends Media{
    private int nbEpisodes ;
    private String studio;
    private String genreA;

    public void ajoutAnime () {
        ajoutMedia();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Studio : ");
        this.studio = scanner.nextLine();
        System.out.print("Nombres d'épisodes : ");
        int nbEpisodesTemp = scanner.nextInt();
        this.nbEpisodes = (nbEpisodesTemp > 0) ? nbEpisodesTemp : 0;
        scanner.nextLine();
        int Choix;
        do {
            System.out.println("Choix du Genre");
            System.out.println("1- ACTION");
            System.out.println("2- AVENTURE");
            System.out.println("3- FANTASY");
            System.out.println("4- ISEKAI");
            System.out.println("5- HORREUR");
            System.out.println("6- ROMANCE");
            System.out.println("7- COMEDIE");
            System.out.println("8- SLICE_OF_LIFE");
            System.out.println("9- SPORT");
            System.out.println("10- MECHA");
            System.out.println("11- PSYCHOLOGIQUE");
            System.out.println("12- MYSTERE");
            System.out.println("13- SCIENCE_FICTION");
            System.out.println("14- HISTORIQUE");
            System.out.println("15- MUSICAL");
            System.out.print("Genre : ");
            Choix = scanner.nextInt();

            switch (Choix) {
                case 1 -> this.genreA = "ACTION";
                case 2 -> this.genreA = "AVENTURE";
                case 3 -> this.genreA = "FANTASY";
                case 4 -> this.genreA = "ISEKAI";
                case 5 -> this.genreA = "HORREUR";
                case 6 -> this.genreA = "ROMANCE";
                case 7 -> this.genreA = "COMEDIE";
                case 8 -> this.genreA = "SLICE_OF_LIFE";
                case 9 -> this.genreA = "SPORT";
                case 10 -> this.genreA = "MECHA";
                case 11 -> this.genreA = "PSYCHOLOGIQUE";
                case 12 -> this.genreA = "MYSTERE";
                case 13 -> this.genreA = "SCIENCE_FICTION";
                case 14 -> this.genreA = "HISTORIQUE";
                case 15 -> this.genreA = "MUSICAL";
                default -> System.out.println("Genre invalide !");
            }
            scanner.nextLine();
        }while (Choix < 1 || Choix > 15);
    }

    public void affichageAnime ()
    {
        affichageMedia();
        System.out.println("Nb d'épisodes : " + this.nbEpisodes);
        System.out.println("Studio : " + this.studio);
        System.out.println("Genre : " + this.genreA);
    }

    public int getNbEpisodes()
    {
        return nbEpisodes;
    }

    public String getStudio()
    {
        return studio;
    }

    public String getGenreA()
    {
        return genreA;
    }
}
