// Sous-classe dans un autre package
package banque.clients;

import banque.CompteBancaire;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(double soldeInitial, double taux) {
        super(soldeInitial);
        this.tauxInteret = taux;
    }

    public void appliquerInteret() {
        // On peut accéder directement à "solde" car il est protected
        solde += solde * tauxInteret;
    }
}
