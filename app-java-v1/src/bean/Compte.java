package bean;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moulaYounes
 */
public class Compte {
    private String rib;
    private double solde;
    private List<Transaction> transactions = new ArrayList<>();

    public Compte() {
    }

    
    
    public Compte(String rib, double solde) {
        this.rib = rib;
        this.solde = solde;
    }

    
    
    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    
}
