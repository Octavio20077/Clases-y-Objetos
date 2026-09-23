package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("***Ejemplo aritmetica.Aritmetica***");
        Aritmetica aritmetica1 = new Aritmetica(5, 7);
        System.out.println("Atributo operando 1: " + aritmetica1.getOperando1());
        aritmetica1.setOperando1(5);
        aritmetica1.setOperando2(5);
        aritmetica1.sumar();
        aritmetica1.resta();

        System.out.println();
        //creamos un objeto
        Aritmetica aritmetica2 = new Aritmetica(12, 16);
        aritmetica2.sumar();

    }
}
