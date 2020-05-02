package proz.kalulator;

import java.awt.Color;
import java.util.Locale;
import java.awt.event.ActionListener;

/**
 * Klasa tworząca GUI kalkulatora.
 * <p>
 * Udostępnia meteody umożliające zmiany w GUI i obsługę zdarzeń
 *
 * @author Bogusław Malewski
 * @version 1.0
 */
public class Widok extends javax.swing.JFrame {

    private javax.swing.JButton zeroButton;
    private javax.swing.JButton jedenButton;
    private javax.swing.JButton dwaButton;
    private javax.swing.JButton trzyButton;
    private javax.swing.JButton czteryButton;
    private javax.swing.JButton piecButton;
    private javax.swing.JButton szescButton;
    private javax.swing.JButton siedemButton;
    private javax.swing.JButton osiemButton;
    private javax.swing.JButton dziewiecButton;

    private javax.swing.JLabel ekran2Label;
    private javax.swing.JTextField ekranField;

    private javax.swing.JButton rowneButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton usunButton;
    private javax.swing.JButton kropkaButton;

    private javax.swing.JButton plusButton;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton razyButton;
    private javax.swing.JButton podzielicButton;

    /**
     * Tworzy GUI kalkulatora.
     */
    public Widok() {
        initComponents();
    }

    private void initComponents() {
        zeroButton = new javax.swing.JButton();
        jedenButton = new javax.swing.JButton();
        dwaButton = new javax.swing.JButton();
        trzyButton = new javax.swing.JButton();
        czteryButton = new javax.swing.JButton();
        piecButton = new javax.swing.JButton();
        szescButton = new javax.swing.JButton();
        siedemButton = new javax.swing.JButton();
        osiemButton = new javax.swing.JButton();
        dziewiecButton = new javax.swing.JButton();

        ekranField = new javax.swing.JTextField();
        ekran2Label = new javax.swing.JLabel();

        usunButton = new javax.swing.JButton();
        rowneButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        kropkaButton = new javax.swing.JButton();

        minusButton = new javax.swing.JButton();
        razyButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        podzielicButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        //setLocation(new java.awt.Point(500, 250));
        setLocationRelativeTo(null);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        ekranField.setEditable(false);
        ekranField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ekranField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ekranField.setBackground(Color.WHITE);

        usunButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        usunButton.setText("<--");

        rowneButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rowneButton.setText("=");

        clearButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clearButton.setText("C");

        osiemButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        osiemButton.setText("8");

        dziewiecButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dziewiecButton.setText("9");

        plusButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        plusButton.setText("+");

        siedemButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        siedemButton.setText("7");

        piecButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        piecButton.setText("5");

        szescButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        szescButton.setText("6");

        minusButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minusButton.setText("-");

        czteryButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        czteryButton.setText("4");

        dwaButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dwaButton.setText("2");

        trzyButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        trzyButton.setText("3");

        razyButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        razyButton.setText("*");

        jedenButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jedenButton.setText("1");

        kropkaButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kropkaButton.setText(".");

        podzielicButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        podzielicButton.setText("/");

        zeroButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        zeroButton.setText("0");

        ekran2Label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ekran2Label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ekran2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                .addComponent(rowneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jedenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(dwaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(trzyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(razyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(kropkaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(podzielicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(usunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(ekranField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(siedemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(osiemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(dziewiecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(czteryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(piecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(szescButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ekran2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ekranField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(usunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(osiemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dziewiecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(siedemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(piecButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(szescButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(czteryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dwaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(trzyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(razyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jedenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(kropkaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(podzielicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rowneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
        );
        pack();
    }

    /**
     * Dopisuje do tekstu wyświetlanego na głownym ekranie kalkulatora podany String.
     *
     * @param s String który ma zostać dopisany.
     */
    public void dodajDoEkranField(String s) {
        this.ekranField.setText(ekranField.getText() + s);
    }

    /**
     * Wyświetla podany tekst na głownym ekranie kalkulatora.
     *
     * @param s Tekst który ma zostać wyświetlony na ekranie kalkulatora.
     */
    public void setTextEkranField(String s) {
        this.ekranField.setText(s);
    }

    /**
     * Wyświetla podany tekst reprezentujący liczbę w odpowiednim formacie na głównym ekranie kalkulatora.
     * <p>
     * Tekst musi być liczbą w formacie dziesiętnym. Wyświetlana jest liczba z dokładnością do 5 miejsc po przecinku.
     *
     * @param s String reprezentujący liczbę w formacie dziesiętnym.
     */
    public void setNumEkranField(String s) {
        this.ekranField.setText(String.format(Locale.US, "%.5f", Double.parseDouble(s)));
    }

    /**
     * Zwraca zawartość głównego ekranu kalkulatora w postaci String.
     *
     * @return Zwraca zawartość głównego ekranu w postaci String.
     */
    public String getEkranField() {
        return this.ekranField.getText();
    }

    /**
     * Dopisuje do tekstu wyświetlanego na pomocniczym ekranie kalkulatora podany string.
     *
     * @param s String który ma zostać dopisany.
     */
    public void dodajDoEkran2Label(String s) {
        this.ekran2Label.setText(ekranField.getText() + s);
    }

    /**
     * Wyświetla podany tekst na pomocniczym ekranie kalkulatora.
     *
     * @param s Tekst który ma zostać wyświetlony na ekranie kalkulatora.
     */
    public void setEkran2Label(String s) {
        this.ekran2Label.setText(s);
    }

    /**
     * Zwraca zawartość pomocniczego ekranu kalkulatora w postaci String.
     *
     * @return Zwraca zawartość pomocniczego ekranu w postaci String.
     */
    public String getEkran2Label() {
        return this.ekran2Label.getText();
    }

    /**
     * Dodaje do przycisku "0" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addZeroButtonListener(ActionListener listener) {
        this.zeroButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "1" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addJedenButtonListener(ActionListener listener) {
        this.jedenButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "2" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addDwaButtonListener(ActionListener listener) {
        this.dwaButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "3" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addTrzyButtonListener(ActionListener listener) {
        this.trzyButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "4" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addCzteryButtonListener(ActionListener listener) {
        this.czteryButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "5" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addPiecButtonListener(ActionListener listener) {
        this.piecButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "6" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addSzescButtonListener(ActionListener listener) {
        this.szescButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "7" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addSiedemButtonListener(ActionListener listener) {
        this.siedemButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "8" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addOsiemButtonListener(ActionListener listener) {
        this.osiemButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "9" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addDziewiecButtonListener(ActionListener listener) {
        this.dziewiecButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "=" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addRowneButtonListener(ActionListener listener) {
        this.rowneButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "C" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addClearButtonListener(ActionListener listener) {
        this.clearButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "&lt;--" podany ActionListener. @param listener ActionL
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addUsunButtonListener(ActionListener listener) {
        this.usunButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "." podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addKropkaButtonListener(ActionListener listener) {
        this.kropkaButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "+" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addPlusButtonListener(ActionListener listener) {
        this.plusButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "-" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addMinusButtonListener(ActionListener listener) {
        this.minusButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "*" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addRazyButtonListener(ActionListener listener) {
        this.razyButton.addActionListener(listener);
    }

    /**
     * Dodaje do przycisku "/" podany ActionListener.
     *
     * @param listener ActionListener który ma być dodany.
     */
    public void addPodzielicButtonListener(ActionListener listener) {
        this.podzielicButton.addActionListener(listener);
    }
}
