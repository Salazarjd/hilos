package com.devjs;

public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        Vectores vectores = new Vectores();
        vectores.llenarVectores();
        vectores.maxValor();
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Tiempo de ejecución: " + endTime + " milisegundos");
    }
}