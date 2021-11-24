package com;
import java.util.Arrays;
import java.util.Random;

public class DoubleColorBall {
    public static void main(String[] args) {
        int k = 6 ;
        int n =33 ;
        Random rand2 = new Random();
        int[] numbers = new int[n] ;
        for(int i =0;i<numbers.length;i++)
            numbers[i] =i + 1;
        int[] result = new int[k];
        for(int i =0;i<result.length; i++){
            int r = rand2.nextInt(33)+1;
            result[i] = numbers[r];
            numbers[r] = numbers[n-1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("RedBall Combination:");
        for(int r : result)
            System.out.print(r + " ");
        System.out.println("\nBuleBall:\n"+(rand2.nextInt(16)+1));
        
    }

}
