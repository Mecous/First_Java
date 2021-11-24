package com.company.note;
//逻辑运算符一般操作都是boolean类型的变量
/*
 *& 、&&有区别，true时全部执行
 * &&左边为false时，不再执行右边而&会执行全部
 *|和||同理
 * 开发中多用&&和||
*/
public class Java_Learn {
    public static void main(String args[]){
        String str = "hello";
        int a =10;
        int x =++a ;
        int y =a++;
        x+=a;
        y*=a;
        System.out.println(x +" "+ y +" "+a);
    }
}
