// import java.util.Scanner;

public class CodingChallenges {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int max = array[0];
        int max2 = array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max2 = max;
                max = array[i];
            } else if (array[i] > max2) {
                max2 = array[i];
            }
        }
        System.out.println(max2);
    }

}