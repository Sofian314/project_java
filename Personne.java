package OrientéObjet;

public class Personne {
    String Prenom;
    String Nom;
    String Pays;
    boolean Maried;
    int nombreEnfant;

    String nomComplet(){
        return Prenom+" "+Nom;
    }
}
