package com.example;

public interface Leaderboard {
    // Enregistre le résultat d'un personnage à la fin du combat dans la base de données
    void enregistrerScore(String nom, int score);
    // Récupère le score d'un personnage
    int obtenirScore(String nom);
    // Renvoie true si le score du personnage1 est supérieur à celui du personnage2, false sinon
    boolean comparerScore(String nom1, String nom2);
}
