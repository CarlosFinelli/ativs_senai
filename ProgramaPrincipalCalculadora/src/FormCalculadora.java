import javax.swing.*;
import java.awt.*;

public class FormCalculadora extends JFrame {
    private JButton btnCalcular;
    private JTextField tfNumero1;
    private JTextField tfNumero2;
    private JLabel lbNumero1;
    private JLabel lbNumero2;
    private JLabel lbResultado;

    Container container;

    public FormCalculadora() {
        this.setTitle("SENAI TDS: Calculadora soma");

        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(600, 150);

        container = this.getContentPane();

        btnCalcular = new JButton("Calcular");
        tfNumero1 = new JTextField(10);
        tfNumero2 = new JTextField(10);
        lbNumero1 = new JLabel("Numero 1");
        lbNumero2 = new JLabel("Numero 2");

        container.add(lbNumero1);
        container.add(lbNumero2);
        container.add(tfNumero1);
        container.add(tfNumero2);
        container.add(btnCalcular);
        container.add(lbResultado);
    }
}
