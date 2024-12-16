package Java_Interview_Question.Arrays;

public class HMaximumDifferencebetweenarray {

    public static void main(String[] args) {
        int arr[] ={12,34,54,8,43,23,100};
        int min = arr[0];
        int max = arr[0];
        for(int i =0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i] ;
            }
            if(arr[i] < min) {
                min = arr[i] ;
            }
        }
        System.out.println("Maximum value is = "+ max);
        System.out.println("Minimum Value is = "+min);
        int diff = max - min;
        System.out.println("Maximum difference is = "+ diff);
    }
}
