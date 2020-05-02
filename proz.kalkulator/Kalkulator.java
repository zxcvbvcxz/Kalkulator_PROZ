package proz.kalulator;

/**
 * Klasa zawierająca funkcję main uruchamiającą kalkulator.
 *
 * @author Bogusław Malewski
 * @version 1.0
 */
public class Kalkulator {

    /**
     * Główna funkcja programu.
     * 
     * @param args Nie wymaga podawania żadnych argumentów
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Widok theWidok = new Widok();
                Model theModel = new Model();
                Kontroler theKontroler = new Kontroler(theWidok, theModel);
                theWidok.setVisible(true);
            }
        });
    }

}
