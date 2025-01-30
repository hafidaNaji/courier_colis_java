package net.naji;

import java.time.LocalDate;

public class ObjetDeValeur extends Courier{
    private double valeurDeclare;
    private char taille;
    public final  double tarifBase=70.0;
    public final double tarifUnit=0.12;
    public final double coefDeclaration=0.06;

    public ObjetDeValeur(String numero, int poids, boolean fragile, LocalDate dateReception, Personne expediteur, Personne destinataire,double valeurDeclare,char taille) {
        super(numero, poids, fragile, dateReception, expediteur, destinataire);
        this.taille=taille;
        this.valeurDeclare=valeurDeclare;
    }

    @Override
    public double calculerTarif() {
        double total;
        double montantFragilite = 0;
        double montantTaille=0;
        switch (taille){
            case 'S': montantTaille = 0;break;
            case 'M': montantTaille = 80;break;
            case 'L': montantTaille = 150;break;
            case 'X': montantTaille = 300;break;
            default:  montantTaille = 0;break;
        }
        total=tarifBase+getPoids()*tarifUnit+valeurDeclare*coefDeclaration;
        total+=montantTaille;
        if(isFragile()==true){
            montantFragilite=total*coefFragile;

        }
        return total + montantFragilite;

    }

    @Override
    public String toString() {
        String detail ="----------Objet Valeur------------\n";
        return detail+super.toString()
              +"Taille: "+taille
                +"\nValeur déclarée : "+valeurDeclare
                +"\nA payer: "+calculerTarif();

    }
}
