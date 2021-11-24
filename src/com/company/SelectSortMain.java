package com.company;
import com.company.SelectSort;
public class SelectSortMain {
    public static void main(String args[]){
        int [] a ={15,23,4,61,23,53,18};
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("\n");

        SelectSort s = new SelectSort();//简单选择排序的调用
        s.selectSort(a);

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

    }

}
