import java.util.Scanner;

public class Es3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        *********** PERIMETRO RETTANGOLO
        System.out.println("*** TASK: calcola perimetro rettangolo ***");
        System.out.println("> STEP 1: fornisci un lato del rettangolo ***");
        double userLato1Rettangolo = Double.parseDouble(scanner.nextLine());
        System.out.println("> STEP 2: fornisci l'altro lato del rettangolo ***");
        double userLato2Rettangolo = Double.parseDouble(scanner.nextLine());
        System.out.println("il perimetro del rettangolo è: " + calcolaPerimetroRettangolo(userLato1Rettangolo, userLato2Rettangolo));

//        *********** PARI O DISPARI
        System.out.println("*** TASK: e pari o dispari ***");
        System.out.println("> STEP 1: fornisci un intero ***");
        int userIntero = Integer.parseInt(scanner.nextLine());
        System.out.println("il valore fornito è: " + ePariODispari(userIntero));

//        ********** AREA TRIANGOLO
        System.out.println("*** TASK: calcola area triangolo ***");
        System.out.println("> STEP 1: fornisci il primo lato del triangolo ***");
        double userLato1Triangolo = Double.parseDouble(scanner.nextLine());
        System.out.println("> STEP 2: fornisci il secondo lato del triangolo ***");
        double userLato2Triangolo = Double.parseDouble(scanner.nextLine());
        System.out.println("> STEP 3: fornisci il terzo lato del triangolo ***");
        double userLato3Triangolo = Double.parseDouble(scanner.nextLine());
        System.out.println("l'area del triangolo è: " + calcolaAreaTriangolo(userLato1Triangolo, userLato2Triangolo, userLato3Triangolo));
    }

    static public double calcolaPerimetroRettangolo(double l1, double l2) {
        return l1 * l2;
    }

    static public int ePariODispari(int x) {
        boolean ePari = x % 2 == 0;
        if(ePari) {
            return 0;
        }
        return 1;
    }

    static public double calcolaAreaTriangolo(double l1, double l2, double l3) {
        double semiPerimetro = (l1 + l2 + l3)/2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - l1) * (semiPerimetro - l2) * (semiPerimetro - l3));
    }


}
