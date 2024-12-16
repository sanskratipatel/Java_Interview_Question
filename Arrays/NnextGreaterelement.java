package Java_Interview_Question.Arrays;

public class NnextGreaterelement {
    public static void main(String[] args) {
        int arr[] = {12,54,76,3,642 ,34};
        for(int i = 0 ;i <arr.length -1 ; i++) {
            if(arr[i] < arr[i+1]) {
                System.out.println(arr[i] + " is less than "+arr[i+1]);
            }
            else{
                System.out.println(arr[i] + " is greater than "+arr[i+1]);
            }
        }
    }
}
