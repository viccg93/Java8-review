package org.java8.devto.java8Review.app.genericos;

public class ClaseConGenerics <T>{
    private T campo;

    public ClaseConGenerics(T campo){
        this.campo = campo;
    }

    public void saluda(){
        System.out.println("Mi campo es de tipo: " + this.campo.getClass().getName());
    }
}
