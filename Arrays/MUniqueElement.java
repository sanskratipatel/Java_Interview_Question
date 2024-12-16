package Java_Interview_Question.Arrays;
import java.util.Scanner;
public class MUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the element = ");
        int n = sc.nextInt();
        int arr[] = new int [n] ;
        System.out.println("Enter "+ n + " element = " );
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i <arr.length; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                if(arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }

        }
        int ans =-1;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] >0) {
                ans = arr[i] ;

            }

        }
        System.out.println(ans);
    }
}
