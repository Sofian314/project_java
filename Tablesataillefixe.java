public class Tablesataillefixe {
    public static void main(String[] args) {
        float[] notesPhysique = {17.5f, 18.5F, 19, 9, 12};// taille 5
        float[] notesMaths = new float[5];//{0,0,0,0,0}

        //Acces au tableaux
        System.out.println("Acces au tableau sans boucle\n");
        System.out.println(notesPhysique[0]);
        System.out.println(notesPhysique[1]);
        System.out.println(notesPhysique[2]);
        System.out.println(notesPhysique[3]);
        System.out.println(notesPhysique[4]);

        System.out.println("Acces au tableau avec boucle\n");
        for (int i = 0; i <= notesPhysique.length - 1; i++) {
            System.out.println(notesPhysique[i]);
        }

        // Moyenne des notes

        float sommedesnotes=0;
        for (int i=0;i<+notesPhysique.length-1;i++){
            sommedesnotes=sommedesnotes+notesPhysique[i];
        }
        System.out.println("somme des notes="+sommedesnotes);
        float moyenne=sommedesnotes/notesPhysique.length;
        System.out.println("moyenne des notes ="+moyenne);
    }
}
