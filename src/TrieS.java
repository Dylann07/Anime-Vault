import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class TrieS {
    public static void trierTitre (@NotNull ArrayList<Media> obj , int x)
    {

        switch(x)
        {
            case 1 -> obj.sort((m1, m2) -> m1.titre.compareToIgnoreCase(m2.titre));//ordre alphabetique A à Z
            case 2 -> obj.sort((m1, m2) -> m2.titre.compareToIgnoreCase(m1.titre));//ordre NON alphabetique Z - A
        }
    }

    public static void trierAuteur (@NotNull ArrayList<Media> obj , int x)
    {
        switch(x)
        {
            case 1 -> obj.sort((m1, m2) -> m1.auteur.compareToIgnoreCase(m2.auteur));//ordre alphabetique A à Z
            case 2 -> obj.sort((m1, m2) -> m2.auteur.compareToIgnoreCase(m1.auteur));//ordre NON alphabetique Z - A
        }
    }

    public static void trierAnnee (@NotNull ArrayList<Media> obj , int x)
    {
        switch(x)
        {
            case 1 -> obj.sort((m1, m2) -> Integer.compare(m1.annee, m2.annee));//ordre croissant
            case 2 -> obj.sort((m1, m2) -> Integer.compare(m2.annee, m1.annee));//ordre decroissant
        }
    }

    public static void trierNote (@NotNull ArrayList<Media> obj , int x)
    {
        switch(x)
        {
            case 1 -> obj.sort((m1, m2) -> Double.compare(m1.note, m2.note));//ordre croissant
            case 2 -> obj.sort((m1, m2) -> Double.compare(m2.note, m1.note));//ordre decroissant
        }

    }

    public static void trierStatus (@NotNull ArrayList<Media> obj , int x)
    {
        switch(x)
        {
            case 1 -> obj.sort((m1, m2) -> m1.status.compareToIgnoreCase(m2.status));//ordre alphabetique A à Z
            case 2 -> obj.sort((m1, m2) -> m2.status.compareToIgnoreCase(m1.status));//ordre NON alphabetique Z - A
        }
    }

}
