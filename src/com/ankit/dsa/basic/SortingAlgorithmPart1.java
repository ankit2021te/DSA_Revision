package com.ankit.dsa.basic;

public class SortingAlgorithmPart1 {

    public static void main(String[] args) {

        int[] arr = {1,5,4,6,8,2,200,10,60,3};
        System.out.println("input :");
        printArray(arr);
//        bubbleSortApproach(arr);
        selectionSortApproach(arr);
        System.out.println();
        System.out.println("output :");
        printArray(arr);
    }

    private static void printArray(int[] arr){
        for (int a : arr)
            System.out.print(a+" , ");
    }

   // Bubble Sort, Selection Sort, or Insertion Sort.

    private static void bubbleSortApproach(int[] arr){
        int length = arr.length;

        for (int i=0;i<length;i++){

            for (int j=0;j<length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void selectionSortApproach(int[] arr){
        int length = arr.length;
        for (int i=0;i<length;i++){
            int min = i;
            for (int j=i+1;j<length;j++){
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
