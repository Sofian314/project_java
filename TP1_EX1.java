public class TP1_EX1 {
    public static void main(String[] args) {
        int ageEnfant=13;

        if (ageEnfant>=7 && ageEnfant<=9){
            System.out.println("Tu es dans la catégorie Poussin");
        } else if (ageEnfant>=10 && ageEnfant<=11) {
            System.out.println("Tu es dans la catégorie Pupille");
        }else if (ageEnfant>=12 && ageEnfant<=13) {
            System.out.println("Tu es dans la catégorie Benjamin");
        }else if (ageEnfant>=14 && ageEnfant<=15) {
            System.out.println("Tu es dans la catégorie Minime");
        }else if (ageEnfant>=16 && ageEnfant<=17) {
            System.out.println("Tu es dans la catégorie Cadet");
        }
    }
}
