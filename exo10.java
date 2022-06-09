import java.util.Scanner;

public class exo10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez le nombre ou les tables vont commencer");
        var nombreDebut = input.nextInt();

        System.out.print("Entrez le nombre ou les tables vont terminer");
        var nombreFin = input.nextInt();

        System.out.print("choisir le nombre ou les tables de multiplication vont commencer");
        var nombreDebut1 = input.nextInt();



        System.out.print("choisir le nombre ou les tables de multiplication vont terminer");
        var nombreFin1 = input.nextInt();


        for (int i = nombreDebut; i <= nombreFin; i =i+ 1) {
            for (int k = nombreDebut1; k <= nombreFin1; k += 1) {

                System.out.println(i + " x " + k + " = " + (k * nombreDebut));
            }

        }

    }
}
