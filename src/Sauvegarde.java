import java.io.*;

public class Sauvegarde {
    private File save = new File("C:\\Users\\rosne\\Documents\\Codes\\Codes Java\\Anime-Vault\\src\\Save.csv");

    public void creationSave ()
    {
        try
        {
            if (save.createNewFile())
            {
                System.out.println("fichier de sauvegarde crée.");
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(save)))
                {
                    bw.write("sep=;\n");
                    bw.write("Titre;Auteur;Année;Note;Genre;Nb Tome/Episode;Edteur/Studio;Categorie\n");

                }
            }
            else
            {
                System.out.println("Le fichier existe déjà");
                try (BufferedReader br = new BufferedReader(new FileReader(save)))
                {
                    br.readLine();
                    String ligne = br.readLine();
                    if (!"Titre;Auteur;Année;Note;Genre;Nb Tome/Episode;Edteur/Studio;Categorie".equals(ligne))
                    {
                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(save, true)))
                        {
                            bw.write("sep=;\n");
                            bw.write("Titre;Auteur;Année;Note;Genre;Nb Tome/Episode;Edteur/Studio;Categorie\n");
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

    public void ecritureSave (Media media)
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(save, true)))
        {
            if (media instanceof Manga)
            {
                Manga objM = (Manga)media;
                bw.write(objM.titre + ";" + objM.auteur + ";" + objM.annee + ";" + objM.note + ";" + objM.getGenreM() + ";" + objM.getNbTomes() + ";" + objM.getEditeur() + ";" + "Manga\n");
            }
            else if (media instanceof Anime)
            {
                Anime objA = (Anime)media;
                bw.write(objA.titre + ";" + objA.auteur + ";" + objA.annee + ";" + objA.note + ";" + objA.getGenreA() + ";" + objA.getNbEpisodes() + ";" + objA.getStudio() + ";" + "Anime\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


