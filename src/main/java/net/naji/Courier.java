package net.naji;

import java.time.LocalDate;

public abstract class Courier {
    private String numero;
    private int poids;
    private boolean fragile;
    private LocalDate dateReception;
    public final double coefFragile=0.15;
    private Personne expediteur;
    private Personne destinataire;

    public abstract double calculerTarif();

    @Override
    public String toString() {
      String detail="Numéro :"+numero
                +"\nDate réception: " +dateReception
                +"\nExpéditeur: "+expediteur
                +"\nDestinataire: "+destinataire
                +"\nPoids:"+poids;
              if(fragile==true){
                detail+="\nObjet fragile: oui\n";
             }else
                  detail+="\nObjet fragile: non\n";

                 return detail;
    }

    public Courier(String numero, int poids, boolean fragile, LocalDate dateReception, Personne expediteur, Personne destinataire) {
        this.numero = numero;
        this.poids = poids;
        this.fragile = fragile;
        this.dateReception = dateReception;
        this.expediteur = expediteur;
        this.destinataire = destinataire;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public LocalDate getDateReception() {
        return dateReception;
    }

    public void setDateReception(LocalDate dateReception) {
        this.dateReception = dateReception;
    }

    public Personne getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(Personne expediteur) {
        this.expediteur = expediteur;
    }

    public Personne getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(Personne destinataire) {
        this.destinataire = destinataire;
    }
}
