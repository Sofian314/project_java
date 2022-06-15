import java.util.Scanner;

public class exo17 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Votre chaine : ");
        var chaine=input.next();

        System.out.print("\nResultat : ");

        for (int i=0; i<chaine.length();i++){
            System.out.print(chaine.charAt(chaine.length()-i-1));
        }


    }
}
