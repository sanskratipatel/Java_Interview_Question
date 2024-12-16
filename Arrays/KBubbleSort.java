package Java_Interview_Question.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KBubbleSort {
    public static void main(String[] args) {
      int arr[] = {12,33,4,2,5,32,43,455,73};
      for(int i = 0 ; i <arr.length ; i++) {
          for(int j = i+1; j<arr.length ; j++) {
              if(arr[i] > arr[j]) {
                  int temp = arr[i] ;
                  arr[i] = arr[j] ;
                  arr[j] = temp;

              }
          }
      }
        System.out.println("Array After Sorting = "+ Arrays.toString(arr));
    }
}
