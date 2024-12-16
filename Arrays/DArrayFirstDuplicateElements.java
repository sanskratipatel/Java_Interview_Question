package Java_Interview_Question.Arrays;

public class DArrayFirstDuplicateElements {
    public static void main(String[] args) {
        int arr[] = {12,23,43,65,2,56,23,32,6};
        int found = 0;
        for(int i = 0; i <arr.length; i++) {
            for(int j = i+1 ; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println("Duplicate Element Found " + arr[j] + " that first time at "+ i + " second time at "+j);
                    found++;
                    break;
                }
            }
        }
        if(found == 0) {
            System.out.println("Array Does Not consist any duplicate key");
        }
    }
}
