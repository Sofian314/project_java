import java.util.Scanner;

public class exo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nombre ");
        var nombre = input.nextInt();
        var fact=1;
        String s=" ";


        if (nombre == 0) {
            System.out.println("la factorielle de " + nombre + " est 1");
        } else if (nombre ==1) {
            System.out.println("la factorielle de " + nombre + " est 1");
        } else {
            System.out.print("la factorielle de " + nombre + " est 1");
            for (int i = 2; i <= nombre; i =i+1) {
                fact=fact*i;
                s="x"+i;
                System.out.print(s);


            }

            System.out.print(" = "+fact);

        }
    }
}