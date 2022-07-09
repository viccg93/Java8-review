package org.java8.devto.java8Review.app.genericos;

public class ClaseSinGenerics{
    private Integer campo1;
    private String campo2;

    public ClaseSinGenerics(Integer campo1, String campo2){
        this.campo1 = campo1;
        this.campo2 = campo2;
    }

    public void saludaCampo1(){
        System.out.println("Mi campo es de tipo: " + this.campo1.getClass().getName());
    }
    public void saludaCampo2(){
        System.out.println("Mi campo es de tipo: " + this.campo2.getClass().getName());
    }
}
