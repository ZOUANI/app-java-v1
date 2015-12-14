package bean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moulaYounes
 */
public class Transaction {
    private int id;
    private String type;
    private String typePaiement;
    private double montant;
    private Compte compte = new Compte();
    
 

    public Transaction() {
    }

    public Transaction(String type, String typePaiement, double montant) {
        this.type = type;
        this.typePaiement = typePaiement;
        this.montant = montant;
    }
    
    

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypePaiement() {
        return typePaiement;
    }

    public void setTypePaiement(String typePaiement) {
        this.typePaiement = typePaiement;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
    
    
}
