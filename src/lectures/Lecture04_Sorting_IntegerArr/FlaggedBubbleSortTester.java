package lectures.Lecture04_Sorting_IntegerArr;

public class FlaggedBubbleSortTester {
    public static void main(String[] args){
        int[] originalArr = {35, 15, 44, 7, 8, 12};

        System.out.println("Values in the original array");
        for (int item : originalArr){
            System.out.println(item);
        }

        FlaggedBubbleSort.bubbleSort(originalArr);

        System.out.println("Values in the sorted array");
        for (int item : originalArr){
            System.out.println(item);
        }



        String[] strArr = {"John", "Aaron", "Angelo", "Ashirwada", "Tharuka", "Jayasanka"};

        FlaggedBubbleSort.bubbleSort(originalArr);

        System.out.println("Values in the sorted array");
        for (int item : originalArr){
            System.out.println(item);
        }

//        FlaggedBubbleSort bubbleSort = new FlaggedBubbleSort();
//        String values = String.valueOf(bubbleSort.bubbleSort(arr));
//        System.out.println(values);

    }
}
