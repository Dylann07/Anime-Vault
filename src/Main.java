import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                System.out.println("7- TRIER");
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
                    sauvegarde.ecritureSave(M);
                    break;
                case 2:

                    Anime A = new Anime();
                    System.out.println("AJOUT D'UN ANIME");
                    A.ajoutAnime();
                    sauvegarde.ecritureSave(A);
                    break;
                case 3:
                    System.out.println("AFFICHAGE DE VOTRE COLLECTION");
                    System.out.println("=========================================");
                    sauvegarde.affichageSave(choix);
                    break;
                case 4:
                    System.out.println("AFFICHAGE DE VOTRE COLLECTION DE MANGAS");
                    System.out.println("=========================================");
                    sauvegarde.affichageSave(choix);
                    break;
                case 5:
                    System.out.println("AFFICHAGE DE VOTRE COLLECTION D'ANIME");
                    System.out.println("=========================================");
                    sauvegarde.affichageSave(choix);
                    break;
                case 6:
                    System.out.println("RECHERCHE PAR TITRE");
                    System.out.print("Titres rehcerché : ");
                    String recherche = scanner.nextLine();
                    sauvegarde.rechercheSave(recherche);
                    System.out.println("=========================================");
                    break;
                case 7:
                    int choixTrie , choixOrdre;
                    do
                    {
                        System.out.println("1- Trier par titre");
                        System.out.println("2- Trier par Auteur");
                        System.out.println("3- Trier par Année");
                        System.out.println("4- Trier par note");
                        System.out.println("5- Trier par Status");
                        System.out.print("Réponse : ");
                        choixTrie = scanner.nextInt();
                        scanner.nextLine();

                        if (choixTrie != 1 && choixTrie != 2 && choixTrie != 3 && choixTrie != 4 && choixTrie != 5)
                        {
                            System.out.println("\nErreur !! veuillez entrez un chiffres compris entre 1 et 5");
                        }
                    }while (choixTrie != 1 && choixTrie != 2 && choixTrie != 3 && choixTrie != 4 && choixTrie != 5);

                    do
                    {
                        System.out.println("1- Ordre Croissant / Alphabetique / A-Z");
                        System.out.println("2- Ordre Decroissant /NON  Alphabetique / Z-A");
                        System.out.print("Réponse : ");
                        choixOrdre = scanner.nextInt();
                        scanner.nextLine();

                        if (choixOrdre != 1 && choixOrdre != 2)
                        {
                            System.out.println("\nErreur !! veuillez entrez un chiffres compris entre 0 et 9");
                        }
                    }while (choixOrdre != 1 && choixOrdre != 2);
                    sauvegarde.trieSave(choixTrie , choixOrdre);
                    sauvegarde.affichageSave(3);
                    break;
                case 8:
                    System.out.println("RECHERCHE DU TITRE A SUPPRIMER");
                    System.out.print("Titres rehcerché : ");
                    String SUP = scanner.nextLine();
                    sauvegarde.suppressionSave(SUP);
                    break;
                case 0:
                    System.out.println("AU REVOIR CHERE UTILISATEUR !!!");
                    return;
            }
        } while (choix == 1 || choix == 2 || choix == 3 || choix == 4 || choix == 5 || choix == 6 || choix == 7 || choix == 8);
        scanner.close();
    }
}