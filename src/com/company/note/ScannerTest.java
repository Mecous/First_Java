package com.company.note;

import java.util.Scanner;
/**21-11-23
 *Scanner 类 使用时要导入基础的包 java.util.Scanner
 * 使用时 用Scannner直接创建一个对象
 *Scanner s = new Scanner(System.in);
 * 可以用next...（）来读去不同数据类型的数据
 *获取char类型的 直接用字符串就可以
 *注意： 需要根据来输入指定类型的直
 * */

public class ScannerTest {
      public static  void  main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        Scanner d = new Scanner(System.in);
        double w = d.nextDouble();
        System.out.println(str);
        System.out.println(w);
    }
}
