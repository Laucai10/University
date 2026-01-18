package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.booleanThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonnageTest {

    // Écrivez vos tests ici
    // Exemple :
    @Test
    public void testExemple() {
        assertEquals(2,1+1,"1+1 doit être égal à 2");
        // remplacer par de vrais tests des méthodes de la classe Personnage
    }
    //Question 1
    @Test
    @DisplayName("Nom de test")
    public void testPV1(){
        Personnage p = new Personnage("A", 10, 20, 15);
        boolean pv = p.getPointsDeVie()>0;
        assertEquals(true, pv, "Les points de vie ne doivent pas être négative");
    }
    @Test
    public void testPV2(){
        Personnage p = new Personnage("A", 10, 20, 15);
        assertEquals(10, p.getPointsDeVie(), "Les points de vie sont pas les mêmes");
    }
    @Test
    public void testAtt1(){
        Personnage p = new Personnage("A", 10, 20, 15);
        boolean att = p.getAttaque()>0;
        assertEquals(true, att, "L'attaque ne doit pas être négatif");
    }
    @Test
    public void testAtt2(){
        Personnage p = new Personnage("A", 10, 20, 15);
        assertEquals(20, p.getAttaque(), "Les attaques ne sont aps les mêmes");
    }
    @Test
    public void testDef1(){
        Personnage p = new Personnage("A", 10, 20, 15);
        boolean def = p.getDefense()>0;
        assertEquals(true, def, "La défense ne doit pas être négatif");
    }
    @Test
    public void testDef2(){
        Personnage p = new Personnage("A", 10, 20, 15);
        assertEquals(15, p.getDefense(), "La défense n'est pas la même");
    }
    
}