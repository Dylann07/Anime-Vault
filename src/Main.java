import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue cher utilisateur sur ANIMEVAULT");

        int choix;
        do
        {
            System.out.println("1- AJOUTER UN MANGA");
            System.out.println("2- AJOUTER UN ANIME");
            System.out.println("3- AFFICHER TOUTE LA COLLECTION");
            System.out.println("4- AFFICHER QUE LES MANGAS");
            System.out.println("5- AFFICHER QUE LES ANNIMES");
            System.out.println("6- RECHERCHE PAR TITRE");
            System.out.println("7- TRIER PAR NOTES");
            System.out.println("8- SUPPRIMER UN MEDIA");
            System.out.println("0- QUITTER");
            System.out.print("Réponse : ");
            choix = scanner.nextInt();

            if (choix != 1 && choix != 2 && choix != 3 && choix != 4 && choix != 5 && choix != 6 && choix != 7 && choix != 8 && choix != 9 && choix != 0)
            {
                System.out.println("\nErreur !! veuillez entrez un chiffres compris entre 0 et 9");
            }

            switch (choix)
            {
                case 1:
                    Manga M = new Manga();
                    System.out.println("AJOUT D'UN MANGA");
                    M.ajoutManga();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 0:
                    System.out.println("AU REVOIR CHERE UTILISATEUR !!!");
                    break;
            }
        } while (choix != 1 && choix != 2 && choix != 3 && choix != 4 && choix != 5 && choix != 6 && choix != 7 && choix != 8 && choix != 9 && choix != 0);
    }
}