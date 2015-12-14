/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import java.util.List;

/**
 *
 * @author moulaYounes
 */
public class CompteService {

    public int findCompteByIndex(List<Compte> comptes, String rib) {
        for (int i = 0; i < comptes.size(); i++) {
            Compte compte = comptes.get(i);
            if (compte.getRib().equals(rib)) {
                return i;
            }
        }
        return -1;

    }

    public Compte findCompte(List<Compte> comptes, String rib) {
        int indiceCompte = findCompteByIndex(comptes, rib);
        if (indiceCompte >= 0) {
            return comptes.get(indiceCompte);
        }
        return null;
    }
    
}