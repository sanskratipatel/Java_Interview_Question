package Java_Interview_Question.Arrays;
import java.util.Scanner;
public class Aarraycount {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        System.out.println("Enter Elements");
        int arr[] = new int [size];
        for(int i = 0 ; i < size ; i ++) {
            arr[i] = sc.nextInt();
        }
        int count = 0 ;
    for (int i = 0 ; i <arr.length ;i++) {
        System.out.println(arr[i]);
         count ++;
    }
        System.out.println(count);
    }
}
