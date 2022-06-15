package OrientéObjet;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        Personne identite=new Personne();

        System.out.print("Prenom  : ");
        identite.Prenom=input.next();


        System.out.print("Nom  : ");
        identite.Nom=input.next();


        System.out.print("Pays  : ");
        identite.Pays=input.next();


        System.out.print("Married (Taper true si vous etes marié false sinon) : ");
        identite.Maried=input.nextBoolean();


        System.out.print("Nombre d'enfant  : ");
        identite.nombreEnfant=input.nextInt();


        System.out.println("Identite");
        System.out.println("Prenom Nom :"+identite.nomComplet());
        System.out.println("Pays :"+identite.Pays);
        System.out.print("Marie ou Celibataire :");
        if (identite.Maried==true){
            System.out.println("Marié");}
        else {System.out.println("Celibataire");}
        System.out.println("Nombre enfant :"+identite.nombreEnfant);
    }
}
