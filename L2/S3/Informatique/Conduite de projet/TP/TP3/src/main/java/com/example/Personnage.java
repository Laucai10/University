package com.example;

public class Personnage {
    private String nom;
    private int pointsDeVie;
    private int attaque;
    private int defense;

    public Personnage(String nom, int pointsDeVie, int attaque, int defense) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.attaque = attaque;
        this.defense = defense;
    }
    public String getNom() {
        return this.nom;
    }

    public int getPointsDeVie() {
        return this.pointsDeVie;
    }

    public int getAttaque() {
        return this.attaque;
    }

    public int getDefense() {
        return this.defense;
    }

    public void attaquer(Personnage adversaire) {
        int degats = this.attaque - adversaire.getDefense();
        if (degats>0){
            adversaire.recevoirDegats(degats);
        }
    }

    public void recevoirDegats(int degats) {
        this.pointsDeVie -= degats;
    }

    public boolean estVivant() {
        return this.pointsDeVie > 0;
    }
}