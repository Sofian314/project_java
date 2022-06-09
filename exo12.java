import java.util.Scanner;

public class exo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nombre ");
        var nombre = input.nextInt();

        for (int i=nombre+1; i<=nombre+10; i++ ){
            System.out.println(i);
        }

    }


}
