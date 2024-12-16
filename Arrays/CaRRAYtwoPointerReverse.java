package Java_Interview_Question.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CaRRAYtwoPointerReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0 ;
        int ans[] = new int[size];
        for(int i = arr.length-1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        System.out.println("Reverse Array = "+ Arrays.toString(ans));
    }
}
