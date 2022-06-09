import java.util.Scanner;

public class exo9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Veuillez saisir un entier entre 1 et 12: ");
        byte entier=input.nextByte();

        if(entier==1){
            System.out.println("Vous etes né le mois de janvier");
        } else if (entier==2) {
            System.out.println("Vous etes né le mois de fevrier");
        }else if (entier==3) {
            System.out.println("Vous etes né le mois de mars");
        }else if (entier==4) {
            System.out.println("Vous etes né le mois de avril");
        }else if (entier==5) {
            System.out.println("Vous etes né le mois de mai");
        }else if (entier==6) {
            System.out.println("Vous etes né le mois de juin");
        }else if (entier==7) {
            System.out.println("Vous etes né le mois de juillet");
        }else if (entier==8) {
            System.out.println("Vous etes né le mois de aout");
        }else if (entier==9) {
            System.out.println("Vous etes né le mois de septembre");
        }else if (entier==10) {
            System.out.println("Vous etes né le mois de octobre");
        }else if (entier==11) {
            System.out.println("Vous etes né le mois de novembre");
        }else if (entier==12) {
            System.out.println("Vous etes né le mois de decembre");
        }
    }
}
