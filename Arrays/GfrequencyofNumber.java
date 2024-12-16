package Java_Interview_Question.Arrays;

public class GfrequencyofNumber {
    public static void main(String[] args) {
        int arr[] = {12,23,24,56,334,12,34,54,12,54,12} ;
        int freq = 12;
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == freq) {
               count ++;
            }
        }
        System.out.println("Number of times = "+ count);
    }
}
