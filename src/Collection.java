import java.util.ArrayList;

public class Collection {
    ArrayList<Media> medias = new ArrayList<>();

    public void ajouterMedia(Media m)
    {
        medias.add(m);
    }

    public void afficher (int a)
    {
        if (a == 3)
        {
            for (Media obj : medias)
            {
                if (obj instanceof Manga)
                    ((Manga) obj).affichageManga();
                else if (obj instanceof Anime)
                    ((Anime) obj).affichageAnime();
                System.out.println("=========================================");
            }
        }
        else if (a == 4)
        {
            for (Media obj : medias)
            {
                if (obj instanceof Manga)
                    ((Manga) obj).affichageManga();
                System.out.println("=========================================");
            }
        }
        else if (a == 5)
        {
            for (Media obj : medias)
            {
               if (obj instanceof Anime)
                    ((Anime) obj).affichageAnime();
                System.out.println("=========================================");
            }
        }
    }

    public void recherche (String mot)
    {
        for (Media obj : medias)
        {
            if (obj.titre.equalsIgnoreCase(mot))
            {
                System.out.println("RECHERCHE REUSSIE");
                System.out.println("=========================================");
                if (obj instanceof Manga)
                    ((Manga) obj).affichageManga();
                else if (obj instanceof Anime)
                    ((Anime) obj).affichageAnime();
            }
        }
    }

    public void supprimer (String motS)
    {
        for (int i = 0 ; i < medias.size() ; i++)
        {
            Media obj = medias.get(i);
            if (obj.titre.equalsIgnoreCase(motS))
            {
                System.out.println("RECHERCHE REUSSIE");
                System.out.println("=========================================");
                if (obj instanceof Manga)
                    ((Manga) obj).affichageManga();
                else if (obj instanceof Anime)
                    ((Anime) obj).affichageAnime();
                medias.remove(i);
                i--;
            }
        }
    }

    public void trierParNote ()
    {
        medias.sort((m1, m2) -> Double.compare(m2.note, m1.note));
    }
}
