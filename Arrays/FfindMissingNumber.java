package Java_Interview_Question.Arrays;

public class FfindMissingNumber {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,7,8,9};
        int num =10;
        int sum = 0 ;
        int totalsum = 0;
        for(int i = 0 ; i<arr.length; i++) {
            sum = arr[i] +sum ;
        }
        System.out.println("Total Sum Of Array = "+sum);
        for(int i =0 ; i<10 ; i++){
            totalsum = totalsum +i;

        }
        System.out.println("Expected sum = "+totalsum);
        int missnum = totalsum - sum;
        System.out.println("Missing number is = "+missnum);
    }
}
