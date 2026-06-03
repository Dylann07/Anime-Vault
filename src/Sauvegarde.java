import java.io.*;
import java.util.*;

public class Sauvegarde implements HeaderSauvegarde{
    private File save = new File("C:\\Users\\rosne\\Documents\\Codes\\Codes Java\\Anime-Vault\\src\\Save.csv");

    @Override
    public void creationSave ()
    {
        try
        {
            if (save.createNewFile())
            {
                System.out.println("fichier de sauvegarde crée.");
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(save)))
                {
                    bw.write("Titre;Auteur;Année;Note;Status;Genre;Nb Tome/Episode;Edteur/Studio;Categorie\n");

                }
            }
            else
            {
                System.out.println("Le fichier existe déjà");
                try (BufferedReader br = new BufferedReader(new FileReader(save)))
                {
                    String ligne = br.readLine();
                    if (!"Titre;Auteur;Année;Note;Status;Genre;Nb Tome/Episode;Edteur/Studio;Categorie".equals(ligne))
                    {
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(save)))
                        {
                            bw.write("Titre;Auteur;Année;Note;Status;Genre;Nb Tome/Episode;Edteur/Studio;Categorie\n");
                        }
                    }
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void ecritureSave (Media media)
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(save, true)))
        {
            if (media instanceof Manga)
            {
                Manga objM = (Manga)media;
                bw.write(objM.titre + ";" + objM.auteur + ";" + objM.annee + ";" + objM.note + ";" + objM.status + ";" + objM.getGenreM() + ";" + objM.getNbTomes() + ";" + objM.getEditeur() + ";" + "Manga\n");
            }
            else if (media instanceof Anime)
            {
                Anime objA = (Anime)media;
                bw.write(objA.titre + ";" + objA.auteur + ";" + objA.annee + ";" + objA.note + ";" +  objA.status + ";" + objA.getGenreA() + ";" + objA.getNbEpisodes() + ";" + objA.getStudio() + ";" + "Anime\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void affichageSave (int x)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(save)))
        {
            br.readLine();
            String ligne ;
            while ((ligne = br.readLine()) != null)
            {
                String[] colonnes = ligne.split(";");

                if (colonnes[8].equalsIgnoreCase("Manga") && (x == 4 || x == 3))
                {
                    System.out.println("Titre : " + colonnes[0]);
                    System.out.println("Auteur : " + colonnes[1]);
                    System.out.println("Année : " + colonnes[2]);
                    System.out.println("Note : " + colonnes[3]);
                    System.out.println("Status : " + colonnes[4]);
                    System.out.println("Genre : " + colonnes[5]);
                    System.out.println("Nb de Tomes : " + colonnes[6]);
                    System.out.println("Editeur : " + colonnes[7]);
                }
                else if (colonnes[8].equalsIgnoreCase("Anime") && (x == 5 || x == 3))
                {
                    System.out.println("Titre : " + colonnes[0]);
                    System.out.println("Auteur : " + colonnes[1]);
                    System.out.println("Année : " + colonnes[2]);
                    System.out.println("Note : " + colonnes[3]);
                    System.out.println("Status : " + colonnes[4]);
                    System.out.println("Genre : " + colonnes[5]);
                    System.out.println("Nb d'épisodes : " + colonnes[6]);
                    System.out.println("Studio : " + colonnes[7]);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void rechercheSave (String mot)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(save)))
        {
            br.readLine();
            String ligne ;
            System.out.println("RECHERCHE EN COURS .....");
            while ((ligne = br.readLine()) != null)
            {
                String[] colonnes = ligne.split(";");

                if (colonnes[0].equalsIgnoreCase(mot))
                {
                    System.out.println("RECHERCHE REUSSIE");
                    System.out.println("Titre : " + colonnes[0]);
                    System.out.println("Auteur : " + colonnes[1]);
                    System.out.println("Année : " + colonnes[2]);
                    System.out.println("Note : " + colonnes[3]);
                    System.out.println("Status : " + colonnes[4]);
                    System.out.println("Genre : " + colonnes[5]);

                    if (colonnes[8].equalsIgnoreCase("Manga"))
                    {
                        System.out.println("Nb de Tomes : " + colonnes[6]);
                        System.out.println("Editeur : " + colonnes[7]);
                    }
                    else if (colonnes[8].equalsIgnoreCase("Anime"))
                    {
                        System.out.println("Nb d'épisodes : " + colonnes[6]);
                        System.out.println("Studio : " + colonnes[7]);
                    }
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void suppressionSave (String motSupp)
    {
        List<String> lignes = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(save)))
        {
            String ligne ;
            int i = -1;
            System.out.println("RECHERCHE EN COURS DU MANGA/ANIME A SUPPRIMER .....");
            while ((ligne = br.readLine()) != null)
            {
                String[] colonnes = ligne.split(";");
                lignes.add(ligne);
                if (colonnes[0].equalsIgnoreCase(motSupp))
                {
                    System.out.println("RECHERCHE REUSSIE");
                    i= lignes.size() - 1;
                    System.out.println("Titre : " + colonnes[0]);
                    System.out.println("Auteur : " + colonnes[1]);
                    System.out.println("Année : " + colonnes[2]);
                    System.out.println("Note : " + colonnes[3]);
                    System.out.println("Status : " + colonnes[4]);
                    System.out.println("Genre : " + colonnes[5]);

                    if (colonnes[8].equalsIgnoreCase("Manga"))
                    {
                        System.out.println("Nb de Tomes : " + colonnes[6]);
                        System.out.println("Editeur : " + colonnes[7]);
                    }
                    else if (colonnes[8].equalsIgnoreCase("Anime"))
                    {
                        System.out.println("Nb d'épisodes : " + colonnes[6]);
                        System.out.println("Studio : " + colonnes[7]);
                    }
                }
            }

            if (i == -1)
            {
                System.out.println("Introuvable.");
                return;
            }
            else
            {
                lignes.remove(i);
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(save)))
                {
                    for (String obj : lignes)
                    {
                        bw.write(obj + "\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void trieSave(int type , int ordre)
    {
        ArrayList<Media> mediaAll = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(save)))
        {
            br.readLine();
            String ligne ;
            System.out.println("RECHERCHE EN COURS DU MANGA/ANIME A SUPPRIMER .....");
            while ((ligne = br.readLine()) != null)
            {
                String[] colonnes = ligne.split(";");
                if (colonnes[8].equals("Manga"))
                {
                    Manga M = new Manga();
                    M.setTitre(colonnes[0]);
                    M.setAuteur(colonnes[1]);
                    M.setAnnee(Integer.parseInt((String) colonnes[2]));
                    M.setNote(Double.parseDouble((String) colonnes[3]));
                    M.setStatus(colonnes[4]);
                    M.setGenreM(colonnes[5]);
                    M.setNbTomes(Integer.parseInt((String) colonnes[6]));
                    M.setEditeur(colonnes[7]);
                    mediaAll.add(M);
                }
                else if (colonnes[8].equals("Anime"))
                {
                    Anime A = new Anime();
                    A.setTitre(colonnes[0]);
                    A.setAuteur(colonnes[1]);
                    A.setAnnee(Integer.parseInt((String) colonnes[2]));
                    A.setNote(Double.parseDouble((String) colonnes[3]));
                    A.setStatus(colonnes[4]);
                    A.setGenreA(colonnes[5]);
                    A.setNbEpisodes(Integer.parseInt((String) colonnes[6]));
                    A.setStudio(colonnes[7]);
                    mediaAll.add(A);
                }
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        switch (type)
        {
            case 1 -> TrieS.trierTitre(mediaAll , ordre);
            case 2 -> TrieS.trierAuteur(mediaAll , ordre);
            case 3 -> TrieS.trierAnnee(mediaAll , ordre);
            case 4 -> TrieS.trierNote(mediaAll , ordre);
            case 5 -> TrieS.trierStatus(mediaAll , ordre);
        }

        System.out.println("Trie effectuer");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(save)))
        {
            bw.write("Titre;Auteur;Année;Note;Status;Genre;Nb Tome/Episode;Edteur/Studio;Categorie\n");
            for (Media obj : mediaAll)
            {
                if (obj instanceof Manga)
                {
                    Manga objM = (Manga)obj;
                    bw.write(objM.titre + ";" + objM.auteur + ";" + objM.annee + ";" + objM.note + ";" + objM.status + ";" + objM.getGenreM() + ";" + objM.getNbTomes() + ";" + objM.getEditeur() + ";" + "Manga\n");
                }
                else if (obj instanceof Anime)
                {
                    Anime objA = (Anime)obj;
                    bw.write(objA.titre + ";" + objA.auteur + ";" + objA.annee + ";" + objA.note + ";" +  objA.status + ";" + objA.getGenreA() + ";" + objA.getNbEpisodes() + ";" + objA.getStudio() + ";" + "Anime\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


