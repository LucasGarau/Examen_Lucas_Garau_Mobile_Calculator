package com.example.examenlucasgarau;
public class calculator {

    public static Double sumar(Double numero1 , Double numero2) {
             numero1 = numero1 + numero2;
          return numero1;
    }

    public static Double restar(Double numero1 , Double numero2) {
        numero1 = numero1 - numero2;
        return numero1;
    }

    public static Double dividir(Double numero1 , Double numero2) {
        if (numero1.equals(0))
            throw new IllegalArgumentException("n1 != 0");
        numero1 = numero1 / numero2;
        return numero1;
    }
    public static Double multiplicar(Double numero1 , Double numero2) {
        numero1 = numero1 * numero2;
        return numero1;
    }

}
