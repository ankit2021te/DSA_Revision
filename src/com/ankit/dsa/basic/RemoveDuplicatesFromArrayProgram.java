package com.ankit.dsa.basic;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayProgram {

    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1,1,1,1};
        System.out.println("Before");
        printArray(arr);

        sortArrayUsingBubbleSort(arr);
        System.out.println("After sort");
        printArray(arr);
//        System.out.println(removeDuplicatesFromArray(arr));
        removeDuplicatesInArray(arr);

    }

    private static Set<Integer> removeDuplicatesFromArray(int[] arr){

        Set<Integer> set = new HashSet<>();
        for (int n : arr){
            set.add(n);
        }
        return set;
    }

    private static void removeDuplicatesInArray(int[] arr){
        int length = arr.length;

        if(length<2)
            System.out.println("Unique element: "+arr[1]);

//        boolean isUnique = true;
        int count=0;
        for (int i=0;i<length-1;i++){

            if(arr[i]<arr[i+1]) {
                System.out.println("Unique element in if block: " + arr[i]);
//                isUnique=true;
                count++;
            } /*else if(arr[i]==arr[i+1] & isUnique){
                System.out.println("Unique element in else if block: " + arr[i]);
                isUnique = false;
            }*/
        }
        if(arr[length-1]>arr[length-2])
            System.out.println("Unique element in outside loop of if: "+arr[length-1]);
        else if(count<2)
            System.out.println("Unique element in outside loop of else if: "+arr[length-1]);
    }

    private static void sortArrayUsingBubbleSort(int[] arr){
        int length = arr.length;

        for(int i=0;i<length;i++){
            for(int j=0;j<length-1-i;j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    private static void printArray(int[] arr){
        System.out.println();
        for (int a : arr)
            System.out.print(a+" , ");
        System.out.println();
    }

}
