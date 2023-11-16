// import java.util.Scanner;

import java.util.Arrays;

public class CodingChallenges {
    public static void main(String[] args) {
        // second largest
        // int[] array = { 1, 2, 3, 4, 5 };
        // int max = array[0];
        // int max2 = array[1];

        // for (int i = 0; i < array.length; i++) {
        // if (array[i] > max) {
        // max2 = max;
        // max = array[i];
        // } else if (array[i] > max2) {
        // max2 = array[i];
        // }
        // }
        // System.out.println(max2);
        ///////////////////////////////////////////////////////

        // REVERSE ARRAY
        // int[] input = { 1, 2, 3, 4, 5, 6 };
        // int[] reversedArray = new int[input.length];
        // for (int i = 0; i < input.length; i++) {
        // reversedArray[i] = input[input.length - 1 - i];
        // }
        // System.out.println(Arrays.toString(reversedArray));

        // int[] input = { 1, 2, 3, 4 };
        // int[] reverse = new int[input.length];

        // for (int i = 0; i < input.length; i++) {
        // reverse[i] = input[input.length - 1 - i];
        // }
        // System.out.println(Arrays.toString(reverse));
        // String[] input = { "Hello", "world", "!" };
        // String[] reversedString = new String[input.length];
        // for (int i = 0; i < reversedString.length; i++) {
        // reversedString[i] = input[input.length - 1 - i];
        // }
        // System.out.println(Arrays.toString(reversedString));
        // is sorted
        int[] sortedArray = { 1, 2, 3, 4, 5 };
        for (int i = 1; i < sortedArray.length; i++) {
            if (sortedArray[i - 1] > sortedArray[i]) {
                System.out.println("false");

            }
            System.out.println("true");
        }
    }

}