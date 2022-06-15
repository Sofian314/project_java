import java.util.Scanner;

public class exo19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] matrice=new int[4][4];

        for (int i=0;i<matrice.length;i++){
            for (int j=0;j<matrice[i].length;j++){
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]=input.nextInt();
            }
        }

        System.out.println("Affichage de tout le tableau");
        for(int i=0;i< matrice.length;i++){
            for(int j=0;j<matrice[i].length;j++){
                System.out.print(matrice[i][j] +" ");
            }
            System.out.println();
        }

        int sommeDiagonale=0;

        for (int i=0;i< matrice.length;i++){
            for(int j=0;j<matrice[i].length;j++){
                if (i==j){
                    sommeDiagonale=sommeDiagonale+matrice[i][j];
                }
            }
        }
        System.out.println("\n Somme de la diagonale ="+sommeDiagonale);


    }
}
