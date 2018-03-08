package lectures.Lecture05;

import lectures.Lecture01.Rectangle;
import lectures.Lecture02.Student;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {15,30,12,85,78};
        selectionSort(arr);
        System.out.println(arr);
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < (arr.length - 1); i++){
            int minIndex = i;//Min Index set to i which is 0
            for (int j = i + 1; j < arr.length; j++){//j is one more than i and while j is less
                                                    // than the length of the array, continue.
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void selectionSort(String[] arr){
        for (int i = 0; i < (arr.length - 1); i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j].compareToIgnoreCase(arr[minIndex]) < 0 ){
                    minIndex = j;
                }
            }
            if (i != minIndex){
                String temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void selectionSort(Rectangle[] arr){
        for (int i = 0; i < (arr.length - 1); i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j].compareTo(arr[minIndex]) < 0 ){
                    minIndex = j;
                }
            }
            if (i != minIndex){
                Rectangle temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static <T extends Comparable<T>> void selectionSort(T[] arr){
        for (int i = 0; i < (arr.length - 1); i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j].compareTo(arr[minIndex]) < 0 ){
                    minIndex = j;
                }
            }
            if (i != minIndex){
                T temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
