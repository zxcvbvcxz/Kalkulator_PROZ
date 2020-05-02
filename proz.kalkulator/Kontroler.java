package proz.kalulator;

import java.awt.event.*;

/**
 * Klasa sprawująca kontrolę nad całym programem.<p>
 * Odpowiedzialna jest za logikę aplikacji. Korzysta ona z klasy Model do wykonywania obliczeń i z klasy Widok do dokonywania zmian w GUI programu
 *
 * @author Bogusław Malewski
 * @version 1.0
 */
public class Kontroler {

    private Widok theWidok;
    private Model theModel;
    private boolean readFromEkran;    // Decyduje o tym czy dane mają być odczytane z głównego ekranu w theWidok czy z danych w theModel

    public Kontroler(Widok theWidok, Model theModel) {
        this.theWidok = theWidok;
        this.theModel = theModel;
        readFromEkran = true;

        this.theWidok.addZeroButtonListener(new ZeroButtonListener());
        this.theWidok.addJedenButtonListener(new JedenButtonListener());
        this.theWidok.addDwaButtonListener(new DwaButtonListener());
        this.theWidok.addTrzyButtonListener(new TrzyButtonListener());
        this.theWidok.addCzteryButtonListener(new CzteryButtonListener());
        this.theWidok.addPiecButtonListener(new PiecButtonListener());
        this.theWidok.addSzescButtonListener(new SzescButtonListener());
        this.theWidok.addSiedemButtonListener(new SiedemButtonListener());
        this.theWidok.addOsiemButtonListener(new OsiemButtonListener());
        this.theWidok.addDziewiecButtonListener(new DziewiecButtonListener());

        this.theWidok.addRowneButtonListener(new RowneButtonListener());
        this.theWidok.addClearButtonListener(new ClearButtonListener());
        this.theWidok.addUsunButtonListener(new UsunButtonListener());
        this.theWidok.addKropkaButtonListener(new KropkaButtonListener());

        this.theWidok.addPlusButtonListener(new PlusButtonListener());
        this.theWidok.addMinusButtonListener(new MinusButtonListener());
        this.theWidok.addRazyButtonListener(new RazyButtonListener());
        this.theWidok.addPodzielicButtonListener(new PodzielicButtonListener());
    }

    private void setReadFromEkran(boolean b) {
        this.readFromEkran = b;
    }

    private boolean isReadFromEkran() {
        return this.readFromEkran;
    }

    private class ZeroButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (!theWidok.getEkranField().matches(".*[a-z].*")) {
                theWidok.dodajDoEkranField("0");
            }
        }
    }

    private class JedenButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (!theWidok.getEkranField().matches(".*[a-z].*")) {
                theWidok.dodajDoEkranField("1");
            }
        }
    }

    private class DwaButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (!theWidok.getEkranField().matches(".*[a-z].*")) {
                theWidok.dodajDoEkranField("2");
            }
        }
    }

    private class TrzyButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (!theWidok.getEkranField().matches(".*[a-z].*")) {
                theWidok.dodajDoEkranField("3");
            }
        }
    }

    private class CzteryButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (!theWidok.getEkranField().matches(".*[a-z].*")) {
                theWidok.dodajDoEkranField("4");
            }
        }
    }

    private class PiecButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (!theWidok.getEkranField().matches(".*[a-z].*")) {
                theWidok.dodajDoEkranField("5");
            }
        }
    }

    private class SzescButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (!theWidok.getEkranField().matches(".*[a-z].*")) {
                theWidok.dodajDoEkranField("6");
            }
        }
    }

    private class SiedemButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (!theWidok.getEkranField().matches(".*[a-z].*")) {
                theWidok.dodajDoEkranField("7");
            }
        }
    }

    private class OsiemButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (!theWidok.getEkranField().matches(".*[a-z].*")) {
                theWidok.dodajDoEkranField("8");
            }
        }
    }

    private class DziewiecButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (!theWidok.getEkranField().matches(".*[a-z].*")) {
                theWidok.dodajDoEkranField("9");
            }
        }
    }

    private class RowneButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (theModel.getOperacja() == Model.Operacja.NONE) {
                return;
            }
            if (theWidok.getEkranField().isEmpty()) {
                return;
            }

            if (isReadFromEkran()) {
                theModel.setDrugiOperand(Double.parseDouble(theWidok.getEkranField()));
                theModel.wykonajOperacje();
                setReadFromEkran(false);
                theWidok.setNumEkranField(Double.toString(theModel.getWynik()));
                theWidok.setEkran2Label("");
            } else {
                theModel.setPierwszyOperand(theModel.getWynik());
                theModel.wykonajOperacje();
                theWidok.setNumEkranField(Double.toString(theModel.getWynik()));
            }
        }
    }

    private class ClearButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            setReadFromEkran(true);
            theWidok.setTextEkranField("");
        }
    }

    private class UsunButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (!theWidok.getEkranField().matches(".*[a-z].*")) {

                setReadFromEkran(true);
                int len = theWidok.getEkranField().length();
                int num = theWidok.getEkranField().length() - 1;
                String store;

                if (len > 0) {
                    StringBuilder back = new StringBuilder(theWidok.getEkranField());
                    back.deleteCharAt(num);
                    store = back.toString();
                    theWidok.setTextEkranField(store);

                }

            }
        }
    }

    private class KropkaButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            setReadFromEkran(true);
            String temp = theWidok.getEkranField();
            if (!temp.matches(".*[a-z.].*") && !temp.isEmpty()) {
                theWidok.dodajDoEkranField(".");
            }
        }
    }

    private class PlusButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (theWidok.getEkranField().isEmpty()) {
                return;
            }
            setReadFromEkran(true);
            theModel.setPierwszyOperand(Double.parseDouble(theWidok.getEkranField()));
            theModel.setOperacja(Model.Operacja.PLUS);
            theWidok.setTextEkranField("");
            theWidok.setEkran2Label(Double.toString(theModel.getPierwszyOperand()) + " +");
        }
    }

    private class MinusButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (theWidok.getEkranField().isEmpty()) {
                return;
            }
            setReadFromEkran(true);
            theModel.setPierwszyOperand(Double.parseDouble(theWidok.getEkranField()));
            theModel.setOperacja(Model.Operacja.MINUS);
            theWidok.setTextEkranField("");
            theWidok.setEkran2Label(Double.toString(theModel.getPierwszyOperand()) + " -");
        }
    }

    private class RazyButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (theWidok.getEkranField().isEmpty()) {
                return;
            }
            setReadFromEkran(true);
            theModel.setPierwszyOperand(Double.parseDouble(theWidok.getEkranField()));
            theModel.setOperacja(Model.Operacja.RAZY);
            theWidok.setTextEkranField("");
            theWidok.setEkran2Label(Double.toString(theModel.getPierwszyOperand()) + " *");
        }
    }

    private class PodzielicButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (theWidok.getEkranField().isEmpty()) {
                return;
            }
            setReadFromEkran(true);
            theModel.setPierwszyOperand(Double.parseDouble(theWidok.getEkranField()));
            theModel.setOperacja(Model.Operacja.PODZIELIC);
            theWidok.setTextEkranField("");
            theWidok.setEkran2Label(Double.toString(theModel.getPierwszyOperand()) + " /");
        }
    }

}
