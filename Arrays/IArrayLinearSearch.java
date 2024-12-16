package Java_Interview_Question.Arrays;

public class IArrayLinearSearch {
    public static void main(String[] args) {
        int arr[] = {12,34,45,6,89,5,3,567,4};
        int key = 6;
        for(int i = 0 ; i< arr.length ; i++) {
           if(key == arr[i]) {
               System.out.println("Key found at = "+ i);
           }
        }
    }
}
