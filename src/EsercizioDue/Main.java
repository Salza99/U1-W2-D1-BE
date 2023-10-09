package EsercizioDue;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Invio with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        boolean open = true;
        Scanner input = new Scanner(System.in);
        while (open) {
            System.out.println("inserisci il numero di km percorsi:");
            int resp = input.nextInt();
            System.out.println("inserisci quanti litri ha consumato per percorrere quei km");
            int respDue = input.nextInt();

            try {
                calcoloLitriPerKm(resp, respDue);
            }catch (Exception ex) {
                System.out.println("Errore, stai dividendo per 0, chiudo il programma");
                input.close();
                open = false;
            }


        }
    }
    public static void calcoloLitriPerKm(int kmPercorsi, int litriConsumati){
        double litriPerKm = kmPercorsi / litriConsumati;
        System.out.println(litriPerKm + " km/litro");
    }
}