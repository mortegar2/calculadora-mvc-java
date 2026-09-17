package vista;

import javax.swing.*;

public class Vista extends JFrame {

    public JTextField txtNumeroUno;
    public JTextField txtNumeroDos;
    public JTextField txtResultado;

    public JButton btnSumar;
    public JButton btnRestar;
    public JButton btnMultiplicar;
    public JButton btnDividir;

    public Vista() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(null);

        JLabel lblUno = new JLabel("Número 1:");
        lblUno.setBounds(20, 20, 100, 25);
        add(lblUno);

        txtNumeroUno = new JTextField();
        txtNumeroUno.setBounds(130, 20, 200, 25);
        add(txtNumeroUno);

        JLabel lblDos = new JLabel("Número 2:");
        lblDos.setBounds(20, 60, 100, 25);
        add(lblDos);

        txtNumeroDos = new JTextField();
        txtNumeroDos.setBounds(130, 60, 200, 25);
        add(txtNumeroDos);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(20, 100, 100, 25);
        add(lblResultado);

        txtResultado = new JTextField();
        txtResultado.setBounds(130, 100, 200, 25);
        txtResultado.setEditable(false);
        add(txtResultado);

        btnSumar = new JButton("+");
        btnSumar.setBounds(30, 160, 70, 30);
        add(btnSumar);

        btnRestar = new JButton("-");
        btnRestar.setBounds(110, 160, 70, 30);
        add(btnRestar);

        btnMultiplicar = new JButton("*");
        btnMultiplicar.setBounds(190, 160, 70, 30);
        add(btnMultiplicar);

        btnDividir = new JButton("/");
        btnDividir.setBounds(270, 160, 70, 30);
        add(btnDividir);
    }
}