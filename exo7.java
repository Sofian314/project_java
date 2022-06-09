import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Entrez un nombre entier: ");
        int entier=input.nextInt();

        if(entier==0){
            System.out.println("Le nombre est zéro et il est pair");
        } else if (entier<0 & entier% 2 == 0) {
            System.out.println("Le nombre est négatif et il est pair");
        }else if (entier>0 & entier% 2 == 0){
            System.out.println("Le nombre est positif et il est pair");
        }else if (entier>0 & entier% 2 != 0){
            System.out.println("Le nombre est positif et il est impair");
        }else if (entier<0 & entier% 2 != 0){
            System.out.println("Le nombre est negatif et il est impair");
        }
    }
}
