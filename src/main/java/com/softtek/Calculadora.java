package com.softtek;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Calculadora {

    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) throws ArithmeticException {
        double resultado = 0;
        if (num2 == 0) {
            throw new ArithmeticException("No se divide entre 0");
        } else {
            resultado = num1 / num2;
        }
        return resultado;
    }

}