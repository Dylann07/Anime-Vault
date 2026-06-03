public interface HeaderSauvegarde {
    public void creationSave();
    public void ecritureSave(Media media);
    public void affichageSave (int x);
    public void rechercheSave(String mot);
    public void suppressionSave(String motSupp);
    public void trieSave(int type , int ordre);
}
