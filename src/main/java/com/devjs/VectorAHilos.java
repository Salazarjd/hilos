package com.devjs;
public class VectorAHilos extends Thread{
    private int[] vectorA = new int[90000000];

    @Override
    public void run(){
        for (int i = 0; i < 90000000; i++){
            vectorA[i] = (int) Math.floor(Math.random()*100+1);
        }
    }
    public int[] getVectorA() {
        return vectorA;
    }
}
