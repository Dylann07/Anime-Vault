import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection collection = new Collection();
        Sauvegarde sauvegarde = new Sauvegarde();
        sauvegarde.creationSave();
        System.out.println("Bienvenue cher utilisateur sur ANIMEVAULT");

        int choix;
        do
        {
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
                scanner.nextLine();

                if (choix != 1 && choix != 2 && choix != 3 && choix != 4 && choix != 5 && choix != 6 && choix != 7 && choix != 8 && choix != 9 && choix != 0)
                {
                    System.out.println("\nErreur !! veuillez entrez un chiffres compris entre 0 et 9");
                }
            }while (choix != 1 && choix != 2 && choix != 3 && choix != 4 && choix != 5 && choix != 6 && choix != 7 && choix != 8 && choix != 9 && choix != 0);

            switch (choix)
            {
                case 1:
                    Manga M = new Manga();
                    System.out.println("AJOUT D'UN MANGA");
                    System.out.println("=========================================");
                    M.ajoutManga();
                    collection.ajouterMedia(M);
                    sauvegarde.ecritureSave(M);
                    break;
                case 2:

                    Anime A = new Anime();
                    System.out.println("AJOUT D'UN ANIME");
                    A.ajoutAnime();
                    collection.ajouterMedia(A);
                    sauvegarde.ecritureSave(A);
                    break;
                case 3:
                    System.out.println("AFFICHAGE DE VOTRE COLLECTION");
                    System.out.println("=========================================");
                    collection.afficher(choix);
                    break;
                case 4:
                    System.out.println("AFFICHAGE DE VOTRE COLLECTION DE MANGAS");
                    System.out.println("=========================================");
                    collection.afficher(choix);
                    break;
                case 5:
                    System.out.println("AFFICHAGE DE VOTRE COLLECTION D'ANIME");
                    System.out.println("=========================================");
                    collection.afficher(choix);
                    break;
                case 6:
                    System.out.println("RECHERCHE PAR TITRE");
                    System.out.print("Titres rehcerché : ");
                    String recherche = scanner.nextLine();
                    collection.recherche(recherche);
                    System.out.println("=========================================");
                    break;
                case 7:
                    collection.trierParNote();
                    collection.afficher(3);
                    break;
                case 8:
                    System.out.println("RECHERCHE DU TITRE A SUPPRIMER");
                    System.out.print("Titres rehcerché : ");
                    String SUP = scanner.nextLine();
                    collection.supprimer(SUP);
                    break;
                case 0:
                    System.out.println("AU REVOIR CHERE UTILISATEUR !!!");
                    return;
            }
        } while (choix == 1 || choix == 2 || choix == 3 || choix == 4 || choix == 5 || choix == 6 || choix == 7 || choix == 8);
        scanner.close();
    }
}