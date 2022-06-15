import java.util.Scanner;
//import java.util.ArrayList;
public class exo20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] matrice=new int[4][4];

        for (int i=0;i<matrice.length;i++){
            for (int j=0;j<matrice.length;j++){
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]=input.nextInt();
            }
        }

        System.out.println("Affichage de tout le tableau");
        for(int i=0;i< matrice.length;i++){
            for(int j=0;j<matrice.length;j++){
                System.out.print(matrice[i][j] +" ");
            }
            System.out.println();
        }

        int sommeDiagonale1=0;
        int sommeDiagonale2=0;

        for (int i=0;i< matrice.length;i++){
            for(int j=0;j<matrice.length;j++){
                if (i==j){
                    sommeDiagonale1=sommeDiagonale1+matrice[i][j];
                }
            }
        }

        for (int i=0;i< matrice.length;i++){
            for(int j=0;j<matrice.length;j++){
                if (i+j== matrice.length-1){
                    sommeDiagonale2=sommeDiagonale2+matrice[matrice.length-1-i][matrice.length-1-j];
                    //System.out.println("matrice[i][matrice.length-1-j]="+matrice[matrice.length-1-i][matrice.length-1-j]);
                }
            }
        }
        System.out.println("\n Somme de la diagonale ="+sommeDiagonale1);
        System.out.println("\n Somme de la diagonale inverse ="+sommeDiagonale2);
        int s2= sommeDiagonale1+sommeDiagonale2;
        System.out.println("\n Somme des 2 diagonales ="+s2);


    }
}
