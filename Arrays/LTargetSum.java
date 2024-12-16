package Java_Interview_Question.Arrays;

public class LTargetSum {
    public static void main(String[] args) {
        int arr[] = {9,2,1,3,5,3,7,6,4} ;
        int target = 10;
        for(int i = 0 ; i <arr.length ; i++) {
            for(int j = i+1 ; j<arr.length; j++) {
                if((arr[i] + arr[j]) == target) {
                    System.out.println("For target sum these are two numbers = "+arr[i] + " "+arr[j] + " at index "+ i + " "+j );
                }
            }
        }
    }
}
