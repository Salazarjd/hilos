package com.devjs;

public class VectorBHilos extends Thread{

    private int[] vectorB = new int[90000000];

    @Override
    public void run(){
        for (int i = 0; i < 90000000; i++){
            vectorB[i] = (int) Math.floor(Math.random()*100+1);
        }
    }

    public int[] getVectorB() {
        return vectorB;
    }
}
