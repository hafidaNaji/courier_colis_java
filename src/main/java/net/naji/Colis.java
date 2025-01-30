package net.naji;

import java.time.LocalDate;

public class Colis extends Courier{
    private Volume volume;
    public final double tarifBase=40.0;
    public final double tarifUnit=0.03;
    public final double coefiVolume=0.05;
    public Colis(String numero, int poids, boolean fragile, LocalDate dateReception, Personne expediteur, Personne destinataire,int largeur,int hauteur, int profondeur) {
        super(numero, poids, fragile, dateReception, expediteur, destinataire);
        volume=new Volume(largeur,hauteur,profondeur);
    }

    @Override
    public double calculerTarif() {
        double total;
        double montantFragilite = 0;
        total=tarifBase+volume.calculerVolume()*coefiVolume+getPoids()*tarifUnit;
        if(isFragile()==true){
            montantFragilite=total*coefFragile;

        }
        return total + montantFragilite;

    }

    @Override
    public String toString() {
        String detail ="----------colis------------\n";
        return detail+super.toString()
                +"Volume: ("+volume.getLargeur()+"x"+volume.getHauteur()+"x"+volume.getProfondeur()  +")"
                +"\nA payer: "+calculerTarif();


    }
}
