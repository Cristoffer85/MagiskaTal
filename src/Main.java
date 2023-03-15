//METOD-demo väldigt bra att ha och läsa igenom för förstå hur div. metoder fungerar, etc!

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Välkommen till den magiska tal-generatorn!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv din skostorlek: ");   // Fråga användaren om Skostorlek
        int shoeSize = (int) scanner.nextFloat();       // Läs in Skostorlek
        System.out.println("Födelseår: ");              // Fråga användaren om Födelseår
        int birthYear = (int) scanner.nextFloat();      // Läs in Födelseår

        int magicNumber = getMagic(shoeSize, birthYear);
        String magicShoeSize = getShoeSize(magicNumber);
        String magicAge = getAge(magicNumber);

        /*Ta din skostorlek x5.
        Ta det svaret och plussa på 50.
        Det svaret gångrar du 20, plussa på 1022.
        Minus det årtal du är född (Fyra siffror).
        Nu ska du ha ett fyrsiffrigt tal framför dej.

        De två första är din skostorlek och det andra ska vara din ålder. */
        print("Ditt magiska tal är " + magicNumber);
        print("Din skostorlek är " + magicShoeSize);
        print("Din ålder är " + magicAge);
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static int getMagic(int shoeSize, int birthYear) {
        int magic = shoeSize * 5;   // Ta det svaret och plussa på 50.
        magic += 50;                // Det svaret gångrar du 20,
        magic *= 20;                // plussa på 1022.
        magic += 1022;              // Minus det årtal du är född (Fyra siffror).
        magic -= birthYear;         // Få magicNumber.

        return magic;
    }

    public static String getShoeSize(int magicNumber) {
        // Get the first two digits
        String num = Integer.toString(magicNumber).substring(0, 2);
        return num;
    }

    public static String getAge(int magicNumber) {
        // Get the last two digits
        String num = Integer.toString(magicNumber).substring(2, 4);
        return num;
    }
}

    /*
        substring - Dela upp en sträng. Exempel: "Hej".substring(0, 2) -> "He", "Hej".substring(1, 3) -> "ej"
        första talet är var man startar i strängen, andra talet är var det ska sluta

        parseInt - Konvertera en sträng till ett heltal. Exempel: "123" -> 123
        toString - Konvertera ett heltal till en sträng. Exempel: 123 -> "123"
        Integer.parseInt - Konvertera en sträng till ett heltal. Exempel: "123" -> 123
        Integer.toString - Konvertera ett heltal till en sträng. Exempel: 123 -> "123"
*/
