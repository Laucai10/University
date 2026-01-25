/* Javadoc */
/**
 * Classe représentant une" calculatrice
 */
class Calculatrice {
    /**
     * Additionne deux entiers.
     * @param a premier entier
     * @param b second entier
     * @return la somme de a et b
     */
    public int addition(int a, int b){
        return a+b;
    }
}
/* Mon premier programme */
class MaPremiereClasse {
    public static void main(String[] args){
        System.out.println("Bonjour");
    }
}
/* Programmation procédurale */
class LocalisationProcedurale {
    public static double latitude1, longitude1;
    public static double latitude2, longitude2;
    public static void main(String[] args) {
        latitude1 = 48.8566;  // Paris
        longitude1 = 2.3522;
        latitude2 = 51.4893;  // Londres
        longitude2 = -0.1441;

        double distance = calculeDistance(latitude1, longitude1, latitude2, longitude2);
        System.out.println("Distance: " + distance + " km");
    }
    public static double calculeDistance(double lat1, double lon1, double lat2, double lon2) {
        // Formule simplifiée
        return Math.sqrt(Math.pow(lat1 - lat2, 2) + Math.pow(lon1 - lon2, 2));
    }
}
/* Du procédurale à l'objet */
class Localisation {
    // Attributs
    public double latitude;
    public double longitude;
    // Constructeur
    public Localisation (double lat, double lon){
        this.latitude = lat;
        this.longitude = lon;
    }
    // Méthodes
    public double distance (Localisation autre){
        return Math.sqrt(Math.pow(this.latitude-autre.latitude, 2)+Math.pow(this.longitude-autre.longitude,2)); // à vérifier
    }
}
/* Créé des instance de classe */
class TestLocalisation {
    public static void main(String[] args) {
        Localisation upcite = new Localisation (48.8272, 2.3807);
        Localisation tourEiffel = new Localisation(48.8627, 2.2875);
        System.out.println("Disteance entre les deux localisations : "+upcite.distance(tourEiffel));
        /* Modification autorisée */
        tourEiffel.latitude = 48.95;
        Localisation2 upcite2 = new Localisation2 (48.8272, 2.3807);
        Localisation2 tourEiffel2 = new Localisation2 (48.8627, 2.2875);
        /* Erreur */
        //System.out.println(tourEiffel2.latitude);
        /* Correct */
        System.out.println(tourEiffel2.getLatitude());
    }
}
/* Les mots clé public et private */
class Localisation2 {
    // Attributs
    private double latitude;
    private double longitude;
    // Constructeur
    public Localisation2 (double lat, double lon){
        this.latitude = lat;
        this.longitude = lon;
    }
    /* Ecrire accesseur pour latitude */
    public double getLatitude(){
        return this.latitude;
    }
    /* Modifieur */
    public void setLatitude(double lat){
        latitude = lat;
    }
    // Exemple des accesseurs
    public void setLatitude2(double lat){
        if (lat<-90||lat>90){
            System.out.println("Valeur non-autorisée pour la latitude");
        } else{
            this.latitude=lat;
        }
    }
}
/* Immutabilité */
class TestString {
    public static void main(String[] args){
    // Immutabilité
        String s = "Bonjour";
        s = s +" Java"; // Crée un nouvel objet "Bonjour Java"
    // String Pool, Littéral vs new String
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1==s2); // true -> même référence
        
        String s3 = new String ("Java");
        System.out.println(s1==s3); // false
        System.out.println(s1.equals(s3)); // true (contenu identique)
    // Méthode String
        int len = s.length(); // len = 7
        char c = s.charAt(0); // c='B'
        String upper = s.toUpperCase(); // upper = "BONJOUR"
        String replaced = s.replace('o', 'a'); // replaced = "Baujaur"
        int num = 14;
        String numStr = String.valueOf(num); // numStr = "14"
    }
}
