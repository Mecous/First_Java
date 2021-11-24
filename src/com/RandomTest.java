package com;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();
        int k=10;
        int [] a = new int[k];
        for(int i =0;i < 10;i++){
            a[i]=rand.nextInt(100)+1;
        //    System.out.printf(rand.nextInt(100)+1+" ")
        }
        Arrays.sort(a);
       //for(int x : a)
        System.out.printf(Arrays.toString(a)+ " "+a[0]+" "+a[1]);
        int[] b =new int[15];
        b = Arrays.copyOfRange(a,5,10);
        System.out.printf("\n"+Arrays.toString(b));

    }
    
}
