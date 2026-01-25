// Classe parente
package banque;

public class CompteBancaire {
    protected double solde;   // accessible dans les sous-classes

    public CompteBancaire(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public void deposer(double montant) {
        solde += montant;
    }
}


