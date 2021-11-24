package com.company;
import java.math.*;
import java.util.*;
//单行注释
/*多行注释，不可嵌套使用*/
/**
 * @author mecous
 * @version 1.0.0
 */
/**
 * 一个文件只能又一个public class 且类名与文件相同
 *  System.out.println（）先输出再换行
 *  System.out.print只输出不换行
 */
/**
 *
 * */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how many numbers do you need to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();
        BigInteger x = BigInteger.valueOf(1);

        for(int i=1; i<=k; i++)
            x =x.multiply(BigInteger.valueOf(n -i+1)).divide(BigInteger.valueOf(1));
        System.out.println("Your odds are 1 in "+ x +"good luck!" );
	// write your code here
    }
}
