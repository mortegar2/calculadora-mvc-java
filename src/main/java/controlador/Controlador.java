package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {

    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;

        // Registrar el listener en los cuatro botones
        this.view.btnSumar.addActionListener(this);
        this.view.btnRestar.addActionListener(this);
        this.view.btnMultiplicar.addActionListener(this);
        this.view.btnDividir.addActionListener(this);
    }

    public void iniciar() {
        view.setTitle("MVC Calculadora");
        view.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
            model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));

            if (e.getSource() == view.btnSumar) {
                model.sumar();
                view.txtResultado.setText(String.valueOf(model.getResultado()));
            } else if (e.getSource() == view.btnRestar) {
                model.restar();
                view.txtResultado.setText(String.valueOf(model.getResultado()));
            } else if (e.getSource() == view.btnMultiplicar) {
                model.multiplicar();
                view.txtResultado.setText(String.valueOf(model.getResultado()));
            } else if (e.getSource() == view.btnDividir) {
                double r = model.dividir();
                view.txtResultado.setText(String.valueOf(r));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Ingrese solo números enteros");
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
}