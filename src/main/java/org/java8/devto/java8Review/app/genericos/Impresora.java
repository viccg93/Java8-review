package org.java8.devto.java8Review.app.genericos;

import java.util.ArrayList;
import java.util.List;

public class Impresora {

    private List obtenerListaSinGenerics(){
        List listaNumerica = new ArrayList();
        listaNumerica.add(1);
        listaNumerica.add(3);
        //como no se ha instanciado ArrayList con un tipo definido, lo siguiente ses valido
        listaNumerica.add("o");
        return listaNumerica;
    }

    private List obtenerListaConGenerics(){
        //Posterior a Java 5
        List<Integer> listaNumerica = new ArrayList<Integer>(); //posterior a Java 7 se puede usar el operador diamante
        listaNumerica.add(1);
        listaNumerica.add(3);
        //como no se ha instanciado ArrayList con un tipo definido, lo siguiente ses valido
        //listaNumerica.add("o"); //La validacion se realiza en tiempo de compilacion
        return listaNumerica;
    }


    public void imprimirSumatoria(){
        List<Integer> lista = obtenerListaConGenerics();
        Integer total = 0;
        for(Integer elementoLista: lista){
            total+= elementoLista; //El compilador no marca errores, pero sin duda estamos ante una posible ClassCastException
        }
        System.out.println(total);
    }

}
