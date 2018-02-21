package lectures.Lecture04_Sorting_IntegerArr;

import lectures.Lecture01.Rectangle;

public class FlaggedBubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;
            for (int j = 0; j < (arr.length - 1 - i); j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }


//    public static void bubbleSort(String[] arr){
//        for (int i = 0; i < arr.length - 1; i++){
//            boolean swapped = false;
//            for (int j = 0; j < (arr.length - 1 - i); j++){
//                if (arr[j].compareTo(arr[j + 1]) > 0){
//                    String temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if(!swapped){
//                break;
//            }
//        }
//
//    }
//
//    public static void bubbleSort(Rectangle[] arr){
//        for (int i = 0; i < arr.length - 1; i++){
//            boolean swapped = false;
//            for (int j = 0; j < (arr.length - 1 - i); j++){
//                if (arr[j].compareTo(arr[j + 1]) > 0){
//                    Rectangle temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if(!swapped){
//                break;
//            }
//        }
//
//    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr){//method level generic
        for (int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;
            for (int j = 0; j < (arr.length - 1 - i); j++){
                if (arr[j].compareTo(arr[j + 1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
