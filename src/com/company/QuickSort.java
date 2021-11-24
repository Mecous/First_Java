package com.company;

public class QuickSort {

    private int partition(int[] a, int low, int high) {
        int pivot = a[(low + high) / 2];
        int temp;
        while (low < high) {
            while (low < high)
                if (a[pivot] < a[high]) high--;
            while (low < high)
                if (a[low] < a[pivot]) low++;
        }
        return low;
    }
    public void quickSort(int[] a  ){
        int n = a.length;

    }
}