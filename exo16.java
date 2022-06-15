import java.util.Scanner;

public class exo16 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Donner la taille du tableau : ");
        var tableau=input.nextInt();

        int[] T=new int[tableau];
        System.out.println("\nRemplir le tableau T");

        for (int i=0; i<=tableau-1; i++){
            System.out.print("T["+i+"]=");
            T[i]=input.nextInt();
        }

        System.out.print("\nEntrer un nombre a rechercher  : ");
        var nombreARechercher=input.nextInt();

        var occurences=0;

        for (int i=0; i<=tableau-1; i++){
            if (T[i]==nombreARechercher){
                occurences=occurences+1;
            }
        }
        if (occurences!=0){
            System.out.print(nombreARechercher+" existe et se retrouve "+occurences+" fois dans le tableau");
        } else if (occurences==0) {
            System.out.print("le nombre recherché n'existe pas dans le tableau");
        }


    }
}
