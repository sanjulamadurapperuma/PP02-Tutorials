package lectures.Lecture05;

public class Recursive {
    public static void main(String[] args){
        //p();
        long i = factorial(10);
        System.out.println(i);
        long j = summation(10);
        System.out.println(j);

        int[] arr = {25, 10, 14, 26, 28};
        arraySummation(arr, 1);
    }

    public static void p(){
        p();
    }//this code produces stackoverflow error

    public static long factorial(int n){
        if (n == 1){
            return 1;
        } else{
            return n * factorial(n - 1);
        }
    }

    public static long summation(int n){
        if (n == 1){
            return 1;
        } else{
            return n += summation(n - 1);
        }
    }

    public static int arraySummation(int[] arr, int n){
//        int summation = 0;

        if (n < 0){
            return 0;
        } else{
            return arr[n] + arraySummation(arr, n - 1);
        }
//        for (int i = 0; i < arr.length - 1; i++){
//            for (int j = 0; j < arr.length; j++){
//                int summation += arraySummation(summation - 1);
//                int sum = arr[i] + arr[j];
//                return sum;
//            }
//        }
    }
}
