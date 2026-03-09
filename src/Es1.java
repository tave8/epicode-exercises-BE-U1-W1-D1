import java.util.Arrays;

public class Es1 {
    public static void main(String[] args) {
        int risultatoMoltiplicazione = moltiplica(4, 5);
        String stringaConcatenata = concatena("giuseppe", 4);

        String[] stringhe = {"a", "b", "c", "d", "e"};
        String stringaDaSwappare = "swappami";
        String[] nuoveStringhe = inserisciInArray(stringhe, stringaDaSwappare);

        System.out.println(risultatoMoltiplicazione);
        System.out.println(stringaConcatenata);
        System.out.println(Arrays.toString(nuoveStringhe));
    }


    public static int moltiplica(int x, int y) {
        return x * y;
    }

    public static String concatena(String string, int number) {
        return string + number;
    }

    public static String[] inserisciInArray(String[] stringheInput, String stringaInput) {
//        TODO: make sure stringheInput has lenght 5
//        if (stringheInput.length != 5) {
//            throw new Exception("");
//            return;
//        }
        String[] nuoveStringhe = new String[6];
        nuoveStringhe[0] = stringheInput[0];
        nuoveStringhe[1] = stringheInput[1];
//        terza posizione nuova di stringa input
        nuoveStringhe[2] = stringaInput;
        nuoveStringhe[3] = stringheInput[2];
//        quinta posizione nuova, quarta posizione prima
        nuoveStringhe[4] = stringheInput[3];
//        sesta posizione nuova, quinta posizione prima
        nuoveStringhe[5] = stringheInput[4];

        return nuoveStringhe;
    }

}
