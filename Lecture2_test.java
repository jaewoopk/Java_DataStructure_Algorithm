import java.util.*;

public class Lecture2_test {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,5,2,1};
        int max = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(arr.toString().indexOf(1));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                j++;
            }
        }
        int[] answer = new int[j];
        j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                answer[j++] = i;
        }
        System.out.println(answer.toString().length());
    }
}