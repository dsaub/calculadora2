package me.elordenador.entornos.actividad2;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Numero 1: ");
            int a = sc.nextInt(); sc.nextLine();
            System.out.print("Numero 2: ");
            int b = sc.nextInt(); sc.nextLine();

            System.out.print("Operación (sumar, restar, multiplicar, dividir): ");
            String operacion = sc.nextLine().toUpperCase();

            double solucion = Calculadora.calculadora(a, b, operacion);
            System.out.println("El resultado es: " + solucion);
        } catch (ArithmeticException e) {
            System.err.println("No puedo dividir entre 0");
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.err.println("Argumento invalido, debe de elegir entre los siguientes cuatro: SUMAR, RESTAR, MULTIPLICAR, DIVIDIR");
        } catch (Exception e) {
            System.err.println("Ha habido un error leyendo el numero");
        } 
    }
}
