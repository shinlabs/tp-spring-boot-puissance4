package com.igs.ipi.tpspringbootmatatinireia.model;


public class GameModel {

    private String nom1;
    private String nom2;

    public GameModel(String n1, String n2) {
        this.nom1 = n1;
        this.nom2 = n2;
    }
    public String getNom1() {
        return nom1;
    }

    public void setNom1(String nom1) {
        this.nom1 = nom1;
    }

    public String getNom2() {
        return nom2;
    }

    public void setNom2(String nom2) {
        this.nom2 = nom2;
    }
}
