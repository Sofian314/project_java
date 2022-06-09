import java.util.Scanner;

public class Exo8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("entrez a : ");
        float a=input.nextFloat();

        System.out.print("entrez b : ");
        float b=input.nextFloat();

        System.out.print("entrez c : ");
        float c=input.nextFloat();

        double delta=b*b-4*a*c;

        if(delta<0){
            System.out.println("l'équation ax^2+bx+c n'a pas de solution réelle");
        } else if (delta==0) {
            double x= -b/(2*a);
            System.out.printf("l'équation ax^2+bx+c a une unique solution : x=%.3f",x);
        }else if (delta>0) {
            double x1=(-b-Math.sqrt(delta))/(2*a);
            double x2=(-b+Math.sqrt(delta))/(2*a);
            System.out.printf("l'équation ax^2+bx+c a deux solution x1=%.3f et x2=%.3f ",x1,x2);
        }
    }
}
