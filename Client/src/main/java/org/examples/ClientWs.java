package org.examples;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService proxy= new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.converstionEuroToDh(1));
        Compte c1 =proxy.getCompte(5);
        System.out.println(c1.getCode());
        System.out.println(c1.getSolde());
        System.out.println(c1.getDateCreation());
        List<Compte> compteList= proxy.listCompte();
        for ( Compte c: compteList){
            System.out.println("---------");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println(c.getDateCreation());
        }
    }

}
