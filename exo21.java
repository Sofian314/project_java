import java.util.ArrayList;
import java.util.Scanner;

public class exo21 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        ArrayList<String> langagesDeProgrammation=new ArrayList<>();

        System.out.print("Entrer les languages de programmation et lorsque vous avez finit tapez stop: ");

        var chaine=input.next();
        String stop="stop";
        int compteur=0;

        while (!chaine.equals(stop)){
            langagesDeProgrammation.add(chaine);
            compteur=compteur+1;
        }
        for (int i=0; i<compteur; i++){
            System.out.println(langagesDeProgrammation.get(i));
        }

    }
}
