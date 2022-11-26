package com.devjs;

import java.util.Arrays;

public class MainHilos {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int[] vectorC = new int[90000000];

        VectorAHilos vectorAHilos = new VectorAHilos();
        vectorAHilos.start();
        int [] vectorA = vectorAHilos.getVectorA();

        VectorBHilos vectorBHilos = new VectorBHilos();
        vectorBHilos.start();
        int [] vectorB = vectorBHilos.getVectorB();
        while(vectorAHilos.isAlive() || vectorBHilos.isAlive());

        for (int i = 0; i < 90000000; i++){
            if(vectorA[i] == vectorB[i]){
                vectorC[i] = vectorA[i];
            }else if(vectorA[i] > vectorB[i]){
                vectorC[i] = vectorB[i];
            }else{
                vectorC[i] = (vectorB[i] - vectorA[i])*2;
            }
        }

        System.out.println("Valor máximo encontrado en el vector C: " + Arrays.stream(vectorC).max().getAsInt());

        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Tiempo de ejecución: " + endTime + " milisegundos");

    }
}
