package com.example;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class CombatTest {

    // Écrivez vos tests ici
    // Exemple :
    @Test
    public void testExemple2() {
        assertEquals(2,1+1,"1+1 doit être égal à 2");
        // remplacer par de vrais tests des méthodes de la classe Combat
    }
    //Question 2
    @Test
    public void testAttaque1(){
        Personnage a = new Personnage("A", 0, 0, 0);
        Personnage b = new Personnage("B", 100, 100, 100);
        b.attaquer(a);

        assertEquals(-100, a.getPointsDeVie(), "Les dégâts sont pas cohérents avec l'attaque");
    }
    @Test
    public void testAttaque2(){
        Personnage a = new Personnage("A", 0, 0, 0);
        Personnage b = new Personnage("B", 100, 100, 100);
        a.attaquer(b);
        //200 Avant la question 4
        assertEquals(100, b.getPointsDeVie(), "Les dégâts sont pas cohérents avec l'attaque");
    }
    @Test
    public void testAttaque3(){
        Personnage a = new Personnage("A", 0, 100, 0);
        Personnage b = new Personnage("B", 100, 100, 100);
        a.attaquer(b);

        assertEquals(100, b.getPointsDeVie(), "Les dégâts sont pas cohérents avec l'attaque");
    }
    //Question 3
    @Test
    public void testNegatif(){
        Personnage a = new Personnage("A", 0, 0, 0);
        Personnage b = new Personnage("B", 100, 100, 100);
        int pv = b.getPointsDeVie();
        a.attaquer(b);
        boolean negation = pv<b.getPointsDeVie();
        assertFalse(negation, "L'adversaire ne va pas gagner des points de vie");
    }
    //Question 5
    @Test
    public void TestCombat(){
        Leaderboard mockLb = mock(Leaderboard.class);
        Combat fight = new Combat(mockLb);
        Personnage a = new Personnage("A", 9, 79, 95);
        Personnage b = new Personnage("B", 31, 44, 73);
        when(mockLb.obtenirScore("B")).thenReturn (1);
        fight.lancerCombat(a, b);
        verify(mockLb).enregistrerScore("A", 1);
    }
    @Test
    @Timeout(value = 500)
    public void TestLeaderBoard(){
        Leaderboard mockLb = mock(Leaderboard.class);
        Combat fight = new Combat(mockLb);
        Personnage a = new Personnage("A", 9, 79, 95);
        Personnage b = new Personnage("B", 31, 44, 73);
        when(mockLb.obtenirScore("B")).thenReturn (1);
        doThrow(new RuntimeException("BD inaccessible")).when(mockLb).enregistrerScore(anyString (), anyInt ());
        fight.lancerCombat(a, b);
        verify(mockLb).enregistrerScore("A", 1);
    }
    
}