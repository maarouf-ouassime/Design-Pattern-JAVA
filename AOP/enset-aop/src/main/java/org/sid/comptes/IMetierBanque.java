package org.sid.comptes;

public interface IMetierBanque {
    void addCompte(Compte cp);
    void verser(Long code,double mt);
    void retirer(Long code,double mt);
    Compte consulter(Long code);
}
