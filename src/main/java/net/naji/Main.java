package net.naji;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("############COURIER");
        Personne exp1= new Personne("Lala","Lali","066111");
        Personne dest1= new Personne("Lola","Loli","06525811");
        Personne exp2= new Personne("Mama","Mami","06125661");
        Personne dest2= new Personne("Moma","Momi","062551");

        Courier objv1 = new ObjetDeValeur("v-222", 2000,true, LocalDate.of(2023,5,4),exp1,dest1,5000,'M');
        Courier colis1 = new Colis("c-333",1000,true,LocalDate.of(2013,5,4),exp2,dest2,5,5,10);
        System.out.println(colis1);
        System.out.println(objv1);
    }
}