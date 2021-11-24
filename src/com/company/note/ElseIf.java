package com.company.note;

import java.util.Scanner;

public class ElseIf {
/* 
1.else 结构是可选的
2，针对于条件表达式：
    没有交集的情况下，条件可以随便更改顺序
    有交集的情况下，需要根据实际情况 考虑清楚if-else 次序问题（存在包含关系时 通常将范围较小的放前面）
if-else 可嵌套 但最好少嵌套。 if后只有一行，大括号可以省略。


*/
//三个数随意输入 按顺序输出
public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    System.out.println("请输入第一个整数：");
    int num1 = scanner.nextInt();
    System.out.println("请输入第二个整数：");
    int num2 =scanner.nextInt();
    System.out.println("请输入第三个整数：");
    int num3 =scanner.nextInt();
    
    if(num1>=num2){
        if(num3>=num1){
            System.out.println(num2+","+num1+","+num3);
        }else if(num3<=num2){
            System.out.println(num3+","+num2+","+num1);
        }else{
            System.out.println(num2+","+num3+","+num1);
        }
    }else{
        if(num3>=num2){
            System.out.println(num1+","+num2+","+num3);
        }else if(num3<=num1){
            System.out.println(num3+","+num1+","+num2);
        }else{
            System.out.println(num1+","+num3+","+num2);
        }
        }
    }
}








    
    
    
