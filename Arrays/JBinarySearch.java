package Java_Interview_Question.Arrays;

public class JBinarySearch {
    public static void main(String[] args) {
        int arr[] = { 12,13,14,11,16,17};
        int low = 0;
        int high = arr.length -1; 
        int mid = (low + high) /2;
        int key = 17;
        int found = 0 ;
        for(int i = 0 ; i < arr.length ; i++) { 
            if (arr[mid] == key) {
                found ++;
                System.out.println("Key found at index " +mid); 
                break;
            } else if (arr[mid] > key) {
                high = mid - 1;
                mid =(low + high)/2;
            }
            else {
                low = mid +1;
                mid = (low +high) /2;
            }
        }
        if(found == 0) {
            System.out.println("Key is not present");
        }
    }
}
