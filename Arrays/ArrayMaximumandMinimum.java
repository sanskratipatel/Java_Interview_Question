package Java_Interview_Question.Arrays;

public class ArrayMaximumandMinimum {
    public static void main(String[] args) {
        int arr[] = {12,43,34,56,3,75,43,54,67};
        int min = arr[0] ;
        int max = arr[0];
        for(int i = 0 ; i <arr.length; i++) {

                if(arr[i]  < min) {
                    min = arr[i] ;
                }
        }
        System.out.println("Minimum Element of Array is = "+min);
        for(int i = 0 ; i <arr.length; i++) {
            if(arr[i]  > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Element is = "+ max);
    }
}
