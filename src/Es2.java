import java.util.Arrays;
import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        int howManyStrings = 3;
        int counter = 0;
        String[] userStrings = new String[howManyStrings];

        Scanner scanner = new Scanner(System.in);

        while(counter < howManyStrings) {
            System.out.println("Inserisci una stringa (volta #"+(counter+1)+")");
            String userString = scanner.nextLine();
            userStrings[counter] = userString;
            counter++;
        }

        System.out.println("concatenazione delle stringhe. ordine: iniziale");
        System.out.println(concatenateStrings(userStrings));

        System.out.println("concatenazione delle stringhe. ordine: inverso");
        System.out.println(concatenateStringsReverse(userStrings));

    }


    public static String concatenateStrings(String[] strings) {
        String finalString = "";
        for (int i = 0; i < strings.length; i++) {
            finalString += strings[i];
        }
        return finalString;
    }

    public static String concatenateStringsReverse(String[] strings) {
        String finalString = "";
        for (int i = strings.length-1; i >= 0; i--) {
            finalString += strings[i];
        }
        return finalString;
    }
}
