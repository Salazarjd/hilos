package com.devjs;

import java.util.Arrays;

public class Vectores {

    private final int cantidad = 90000000;;
    private int[] vectorA;
    private int[] vectorB;
    private int[] vectorC;

    public Vectores() {
        this.vectorA = new int[this.cantidad];
        this.vectorB = new int[this.cantidad];
        this.vectorC = new int[this.cantidad];
    }

    public int getCantidad() {
        return cantidad;
    }

    public int[] getVectorA() {
        return vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public int[] getVectorC() {
        return vectorC;
    }

    public void llenarVectores(){
        for (int i = 0; i < this.cantidad; i++){
            this.vectorA[i] = (int) Math.floor(Math.random()*100+1);
            this.vectorB[i] = (int) Math.floor(Math.random()*100+1);

            if(this.vectorA[i] == this.vectorB[i]){
                this.vectorC[i] = this.vectorA[i];
            }else if(this.vectorA[i] > this.vectorB[i]){
                this.vectorC[i] = this.vectorB[i];
            }else{
                this.vectorC[i] = (this.vectorB[i] - this.vectorA[i])*2;
            }


        }
    }


    public void maxValor(){
        System.out.println("Valor máximo encontrado en el vector C: " +Arrays.stream(this.vectorC).max().getAsInt());
    }

    public void showVectores(){

        System.out.print("Vector A [");
        for (int i = 0; i < this.cantidad; i++){
            if(i == this.cantidad-1){
                System.out.println(this.vectorA[i] + "]");
            }else{
                System.out.print(this.vectorA[i] + ", ");
            }
        }

        System.out.print("Vector B [");
        for (int i = 0; i < this.cantidad; i++){
            if(i == this.cantidad-1){
                System.out.println(this.vectorB[i] + "]");
            }else{
                System.out.print(this.vectorB[i] + ", ");
            }
        }

        System.out.print("Vector C [");
        for (int i = 0; i < this.cantidad; i++){
            if(i == this.cantidad-1){
                System.out.println(this.vectorC[i] + "]");
            }else{
                System.out.print(this.vectorC[i] + ", ");
            }
        }
    }
}
