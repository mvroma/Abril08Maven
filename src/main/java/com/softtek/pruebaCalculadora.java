package com.softtek;
import java.util.Scanner;
public class pruebaCalculadora {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();

        System.out.println(c1.sumar(2, 2));
        System.out.println(c1.restar(10, 2));
        System.out.println(c1.multiplicar(2, 2));
        try {
            System.out.println(c1.dividir(2, 0));
        } catch (ArithmeticException error) {
            System.out.println(error);
        } finally {
            System.out.println(c1.dividir(6, 3));
        }
    }
}