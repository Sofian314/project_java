import java.util.Scanner;

public class Tableataillefixesuite {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Combien de notes vous voulez inserer?");
        var notesAinserer=input.nextInt();

        float[] notesmaths=new float[notesAinserer];

        for (int i=0; i<=notesmaths.length-1;i++){
            System.out.printf("Notes[%d]",i);
            notesmaths[i]=input.nextFloat();
        }


    }

}
