package Java_Interview_Question.Arrays;

public class EArrayAllDuplicateValues {
    public static void main(String[] args) {
        int arr[] = {12,23,43,22,23,45,6,12,45,43};
        int found = 0;
        for (int i = 0 ; i<arr.length; i++) {
            for(int j = i+1; j<arr.length ; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println("Duplicate Element Found " + arr[j] + " that first time at "+ i + " second time at "+j);
                    found ++;
                }
            }
        }
        if(found == 0) {
            System.out.println("Duplicate Element Does Not Found");
        }
    }
}
