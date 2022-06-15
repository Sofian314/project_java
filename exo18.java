import java.util.Scanner;

public class exo18 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Votre chaine : ");
        var chaine=input.next();

        int s=0;
        int n=chaine.length();

        for (int i=0;i<n;i++){
            if (chaine.charAt(i)==chaine.charAt(n-i-1)){
                s=1;
            }else {
                s=2;
            }
        }
        if (s==1){
            System.out.println(chaine+" est un palindrome");
        }else {
            System.out.println(chaine+" n'est pas un palindrome");
        }

    }
}
