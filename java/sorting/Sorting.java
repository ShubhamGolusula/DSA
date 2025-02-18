package sorting;

import java.util.Arrays;

public class Sorting {
    public static int[] selectionSort(int[] a, int n){
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
               if (a[j] < a[min]){
                   min = j;
               }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }

    public static int[] bubbleSort(int[] a, int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < n-1; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
    public static int[] bubbleSortRecursion(int[] a, int start, int end){
        if (start < end){
            for (int i = 0; i < end-1; i++) {
                if (a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            bubbleSortRecursion(a,start,end-1);
        }
        return a;
    }

    public static int[] insertionSort(int[] a, int n){
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i-1;
            while(j >=0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        return a;
    }

    //divide and merge
    public static int[] mergeSort(int[] a, int left, int right){
        if (left >= right) return a;

        int mid = (left+right)/2;
        a = mergeSort(a,left,mid);
        a = mergeSort(a,mid+1,right);
        a = merge(a,left,mid,right);

        return a;
    }

    public static int[] merge(int[] a, int left, int mid, int right){
        int i = left;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[right-left+1];
        while (i <= mid && j <= right){
            if (a[i] > a[j]){
                temp[k++] = a[j++];
            } else {
                temp[k++] = a[i++];
            }
        }
        while (i <= mid){
            temp[k++] = a[i++];
        }
        while (j <= right){
            temp[k++] = a[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            a[left++] = temp[l];
        }
        return a;
    }

    public static int[] quickSort(int[] a, int left, int right){
        if (left < right) {
            int p = partition(a,left,right);
            quickSort(a,left,p-1);
            quickSort(a,p+1,right);
        }

        return a;
    }

    public static int partition(int[] a, int left, int right){
        int pivot = (left+right)/2;
        int i = left;
        int j = right;
        while (i < j){
            while(a[i] < a[pivot]){i++;};
            while (a[j] > a[pivot]){j--;};
            if(i < j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[j];
        a[j] = a[pivot];
        a[pivot] = temp;
        return j;

    }

    public static void main(String[] args) {
        int a[] = new int[]{4,1,3,5,7};
        a = bubbleSortRecursion(a, 0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
