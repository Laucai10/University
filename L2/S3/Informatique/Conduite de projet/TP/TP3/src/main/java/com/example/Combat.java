package com.example;

public class Combat {
    private Leaderboard leaderboard;

    // Constructeur pour injecter le leaderboard
    public Combat(Leaderboard leaderboard) {
        this.leaderboard = leaderboard;
    }

    public void lancerCombat(Personnage joueur1, Personnage joueur2) {
        while (joueur1.estVivant() && joueur2.estVivant()) {
            joueur1.attaquer(joueur2);
            if (joueur2.estVivant()) {
                joueur2.attaquer(joueur1);
            }
        }
        
        // Enregistrer le score du gagnant
        if (joueur1.estVivant()) {
            leaderboard.enregistrerScore(joueur1.getNom(), 1);  // +1 pour le gagnant
        } else {
            leaderboard.enregistrerScore(joueur2.getNom(), 1);  // +1 pour le gagnant
        }
    }
}