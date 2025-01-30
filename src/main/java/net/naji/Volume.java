package net.naji;

public class Volume {
    private int largeur;
    private int hauteur;
    private int profondeur;


    public Volume(int largeur, int hauteur, int profondeur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.profondeur = profondeur;
    }
    @Override
    public String toString() {
        return "";
    }
    public int calculerVolume(){
       int volume= largeur*hauteur*profondeur;
        return  volume;
    };

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(int profondeur) {
        this.profondeur = profondeur;
    }
    }
