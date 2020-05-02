package proz.kalulator;

/**
 * Klasa zawierająca dane i metody przetwarzające je, umożliwiające wykonanie czterech podstawowych działań matematycznych na tych danych, czyli
 * dodawanie, odejmowanie, mnożenie i dzielenie.
 * <p>
 * Aby wykonać operację na liczbach trzeba ustawić wartości operandów za pomocą metod {@link #setPierwszyOperand(double liczba)} i
 * {@link #setDrugiOperand(double liczba)}. Trzeba rownież wybrać operację jaka ma być przeprowadzona za pomocą metody
 * {@link #setOperacja(Operacja op)}. Po ustawieniu operandów i wybraniu operacji można przeprowadzić operację za pomocą metody
 * {@link #wykonajOperacje()}. Aby uzyskać wynik operacji trzeba wywołać metodę {@link #getWynik()}, która ten wynik zwróci.
 *
 * @author Bogusław Malewski
 * @version 1.0
 */
public class Model {

    /**
     * Operacje możliwe do przeprowadzenia.
     */
    public enum Operacja {
        /**
         * Żadna operacja nie została wybrana.
         */
        NONE,
        /**
         * Operacja dodawnia.
         */
        PLUS,
        /**
         * Operacja odejmowania.
         */
        MINUS,
        /**
         * Operacja mnożenia.
         */
        RAZY,
        /**
         * Operacja dzielenia.
         */
        PODZIELIC
    }
    private double pierwszyOperand;
    private double drugiOperand;
    private Operacja operacja;
    private double wynik;

    /**
     * Ustawia operandy i wynik na zera i wybraną operację na {@link Operacja#NONE NONE}.
     */
    public Model() {
        operacja = Operacja.NONE;
    }
    /**
     * Ustawia podaną operację.
     * @param op Operacja ktróra ma być ustawiona
     */
    public void setOperacja(Operacja op) {
        this.operacja = op;
    }
/**
 * Zwraca operację która jest obecnie wybrana.
 * @return Zwraca operację która jest obecnie wybrana.
 */
    public Operacja getOperacja() {
        return this.operacja;
    }
/**
 * Ustawia pierwszy operand na podaną liczbę.
 * @param liczba Liczba która ma zostać ustwiona jako pierwszy operand.
 */
    public void setPierwszyOperand(double liczba) {
        this.pierwszyOperand = liczba;
    }
/**
 * Zwraca wartość pierwszego operandu.
 * @return Zwraca wartość pierwszego operandu.
 */
    public double getPierwszyOperand() {
        return this.pierwszyOperand;
    }
/**
 * Ustawia drugi operand na podaną liczbę.
 * @param liczba Liczba która ma zostać ustwiona jako drugi operand.
 */
    public void setDrugiOperand(double liczba) {
        this.drugiOperand = liczba;
    }
/**
 * Zwraca wartość drugiego operandu.
 * @return Zwraca wartość drugiego operandu.
 */
    public double getDrugiOperand() {
        return this.drugiOperand;
    }
/**
 * Ustawia wynik na podaną liczbę.
 * @param liczba Liczba która ma zostać ustawiona jako wynik.
 */
    public void setWynik(double liczba) {
        this.wynik = liczba;
    }
/**
 * Zwraca wartość wyniku
 * @return Zwraca wartość wyniku
 */
    public double getWynik() {
        return this.wynik;
    }
/**
 * Wykonuje operację na operandach. 
 * <p>
 * Operandy należy ustawić za pomocą funkcji {@link #setPierwszyOperand(double liczba)} i {@link #setDrugiOperand(double liczba)}.
 * Wynik opracji jest zapisywany w obiekcie. Aby uzyskać wynik nalezy użyć metody {@link #getWynik()}.
 */
    public void wykonajOperacje() {
        switch (operacja) {
            case PLUS:
                dodaj();
                break;
            case MINUS:
                odejmij();
                break;
            case RAZY:
                pomnoz();
                break;
            case PODZIELIC:
                podziel();
                break;
            case NONE:
                break;
        }
    }

    private void dodaj() {
        setWynik(this.pierwszyOperand + this.drugiOperand);
    }

    private void odejmij() {
        setWynik(this.pierwszyOperand - this.drugiOperand);
    }

    private void pomnoz() {
        setWynik(this.pierwszyOperand * this.drugiOperand);
    }

    private void podziel() {
        setWynik(this.pierwszyOperand / this.drugiOperand);
    }

}
