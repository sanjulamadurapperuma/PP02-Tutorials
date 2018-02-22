package lectures.Lecture05;

public class Sort {

    public static void main(String[] args){
        int[] arr = {12, 15, 85, 128, 1};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length;i++ ){
            if (min > arr[i]) {
                arr[i] = min;
            }
        }
        return min;
    }
}
