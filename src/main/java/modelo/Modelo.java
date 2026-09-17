package modelo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Modelo {

    private int numeroUno;
    private int numeroDos;
    private int resultado;

    public int sumar() {
        this.resultado = this.numeroUno + this.numeroDos;
        return this.resultado;
    }

    public int restar() {
        this.resultado = this.numeroUno - this.numeroDos;
        return this.resultado;
    }

    public int multiplicar() {
        this.resultado = this.numeroUno * this.numeroDos;
        return this.resultado;
    }

    public double dividir() {
        if (this.numeroDos == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return (double) this.numeroUno / this.numeroDos;
    }
}