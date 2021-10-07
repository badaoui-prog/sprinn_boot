package com.categorie.boutique.model;

public class Produit {
    private String nom ;
    private long num ;

    public Produit(String nom, long num) {
        this.nom = nom;
        this.num = num;
    }

    @Override
    public String toString() {
        return "produit{" +
                "nom='" + nom + '\'' +
                ", num=" + num +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }
}
