import java.util.Scanner;

public class exo13 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Veuillez definir une adresse email : ");
        var email= input.nextLine();

        System.out.print("Veuillez definir un mot de passe : ");
        var motDePasse= input.nextLine();

        String mdpTester = "";
        String emailTester= "";
        while (!mdpTester.equals(motDePasse) | !emailTester.equals(email)) {
            System.out.print("Entrez votre email: ");
            emailTester = input.nextLine();
            System.out.print("Votre mot de passe :");
            mdpTester = input.nextLine();

            if(mdpTester.equals(motDePasse) & emailTester.equals(email)){
                System.out.println("Bravo, vous pouvez acceder");
            }else if(!mdpTester.equals(motDePasse) | !emailTester.equals(email) ){
                System.out.println("Email ou mot de passe erroné.Veuillez recommencer");
            }
        }


    }
}
