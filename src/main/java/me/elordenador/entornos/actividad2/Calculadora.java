package me.elordenador.entornos.actividad2;

public class Calculadora {

    public static int sumar(int a, int b) {
        int solucion = a + b;
        System.out.println(a + " + " + b + " = " + solucion);
        return solucion;
    }

    public static int restar(int a, int b) {
        int solucion = a - b;
        System.out.println(a + " - " + b + " = " + solucion);
        return solucion;
    }

    public static int multiplicar(int a, int b) {
        int solucion = a * b;
        System.out.println(a + " * " + b + " = " + solucion);
        return solucion;
    }

    public static double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            System.out.println("Lanzamos la excepción porque " + a + " / " + b + " no se puede realizar (el divisor es 0)");
            throw new ArithmeticException("Cannot divide by 0");
        }
        double solucion = (double) a / (double) b;
        System.out.println(a + " / " + b + " = " + solucion);

        return solucion;
    }

    public static int potencia(int base, int exponente) {
        return (int) Math.pow(base, exponente);
    }

    public static double media(int a, int b) {
        return (a+b) / 2;
    }

    public static int multiplicacion_de_tres(int a, int b, int c) {
        return a*b*c;
    }

    public static double calculadora(int a, int b, Operaciones operacion) {
        switch (operacion) {
            case SUMAR: return sumar(a, b);
            case RESTAR: return restar(a, b);
            case MULTIPLICAR: return multiplicar(a, b);
            case DIVIDIR: return dividir(a, b);
            case POTENCIA: return potencia(a, b);
            case MEDIA: return media(a, b);
            
            default: return 0;
        }
    }

    public static double calculadora(int a, int b, String operacion) {
        Operaciones operacio = Operaciones.valueOf(operacion);
        return calculadora(a, b, operacio);
    }
}
