package com.company;
//假单选择排序，时间复杂度O（n2），空间复杂度O（1）
public class SelectSort {
    public void selectSort(int[] a) {
        int n = a.length;
        for (int k = 0; k < n-1; k++) {
            int min = k;
            for (int i=k+1; i < n; i++)
                if (a[i] < a[min]) min = i;
            if (k != min) {
                int temp = a[k];
                a[k] = a[min];
                a[min] = temp;
             }
        }
    }
}
