package org.java8.devto.java8Review.app;

import org.java8.devto.java8Review.app.genericos.ClaseConGenerics;
import org.java8.devto.java8Review.app.genericos.ClaseSinGenerics;
import org.java8.devto.java8Review.app.genericos.Impresora;

public class Main {
    public static void main(String[] args) {
        Impresora impresora = new Impresora();
        impresora.imprimirSumatoria();

        ClaseSinGenerics objSinGenerics = new ClaseSinGenerics(10,"10");
        objSinGenerics.saludaCampo1();
        objSinGenerics.saludaCampo2();

        ClaseConGenerics<Integer> campoEntero = new ClaseConGenerics<Integer>(10);
        campoEntero.saluda();

        ClaseConGenerics<String> campoCadena = new ClaseConGenerics<String>("10");
        campoCadena.saluda();


    }
}
