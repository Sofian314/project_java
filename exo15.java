import java.util.Scanner;


public class exo15 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Donner la taille du 1er tableau = ");
        var tableau1=input.nextInt();

        System.out.print("Donner la taille du 2em tableau = ");
        var tableau2=input.nextInt();

        System.out.print("Donner la taille du 3em tableau = ");
        var tableau3=input.nextInt();

        int[] T1=new int[tableau1];

        int[] T2=new int[tableau2];

        int[] T3=new int[tableau3];

        System.out.println("\nT1");

        for (int i=0; i<=tableau1-1; i++){
            System.out.print("T1["+i+"]=");
            T1[i]=input.nextInt();

        }
        System.out.print("T1=[");
        for (int i=0; i<=tableau1-1; i++){
            System.out.print(" "+T1[i]+" ");
        }
        System.out.print("]");

        System.out.println("\nT2");

        for (int i=0; i<=tableau2-1; i++){
            System.out.print("T2["+i+"]=");
            T2[i]=input.nextInt();

        }
        System.out.print("T2=[");
        for (int i=0; i<=tableau2-1; i++){
            System.out.print(" "+T2[i]+" ");
        }
        System.out.print("]");


        System.out.println("\nT3");

        for (int i=0; i<=tableau3-1; i++){
            System.out.print("T3["+i+"]=");
            T3[i]=input.nextInt();

        }
        System.out.print("T3=[");
        for (int i=0; i<=tableau3-1; i++){
            System.out.print(" "+T3[i]+" ");
        }
        System.out.print("]");

        System.out.println("\nT");

        int n=T1.length+T2.length+T3.length;

        int[] T = new int[n];

        for(int i=0;i<=T1.length-1;i++){
            T[i]=T1[i];
        }

        for(int i=0;i<=T2.length-1;i++){
                T[i+T1.length]=T2[i];
        }

        for(int i=0;i<=T3.length-1;i++){
                T[i+T2.length+T1.length]=T3[i];
        }

        System.out.print("T=[");
        for (int i=0; i<=n-1; i++){
            System.out.print(" "+T[i]+" ");
        }
        System.out.print("]");

        int S=0;
        System.out.print("\nS= 0");

        for (int i=0; i<=n-1; i++){
            if (T[i]%3==0){
                S=S+T[i];
                System.out.printf(" + "+T[i]);
            }
        }
        System.out.print(" = "+S);

    }
}
