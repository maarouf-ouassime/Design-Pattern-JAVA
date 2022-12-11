package org.sid.comptes;

import java.util.HashMap;
import java.util.Map;

public class MetierBanqueImpl implements IMetierBanque {
    private Map<Long,Compte> compteMap = new HashMap<>();
    @Override
    public void addCompte(Compte cp) {
        compteMap.put(cp.getCode(),cp);
    }

    @Override
    public void verser(Long code, double mt) {
        Compte compte = compteMap.get(code);
        compte.setSolde(compte.getSolde()+mt);
    }

    @Override
    public void retirer(Long code, double mt) {
        Compte compte = compteMap.get(code);
        compte.setSolde(compte.getSolde()-mt);
    }

    @Override
    public Compte consulter(Long code) {
        return compteMap.get(code);
    }
}
