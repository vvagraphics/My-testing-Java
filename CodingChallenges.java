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
        // int[] sortedArray = { 1, 2, 3, 4, 5 };
        // int[] array = { 1, 2, 3 };
        // int max = array[0];
        // int max2nd = array[0];
        // for (int i = 0; i < array.length; i++) {
        // if (max < array[i]) {
        // max2nd = max;
        // max = array[i];
        // } else if (max2nd < array[i]) {
        // max2nd = array[i];
        // }
        // }
        // System.out.println(max2nd);
        // prime
        // int num = 11;
        // boolean isPrime = true;
        // for (int i = 2; i <= Math.sqrt(num); i++) {
        // if (num % i == 0) {
        // isPrime = false;
        // break;
        // }
        // }
        // if (isPrime) {
        // System.out.println(num + " is a prime number.");
        // } else {
        // System.out.println(num + " is not a prime number.");
        // }

        // binary search
        // int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int target = 6;
        // int low = 0;
        // int high = input.length - 1;
        // int result = -1;
        // while (low <= high) {
        // int mid = low + (high - low) / 2;
        // if (input[mid] == target) {
        // result = mid;
        // break;
        // } else if (input[mid] < target) {
        // low = mid + 1;
        // } else {
        // high = mid - 1;
        // }
        // }
        // System.out.println(result);
        // FizzBuzz 15
        // for (int i = 1; i <= 15; i++) {
        // if (i % 3 == 0 && i % 5 == 0) {
        // System.out.println("fizzbuzz");
        // } else if (i % 3 == 0) {
        // System.out.println("fizz");
        // } else if (i % 5 == 0) {
        // System.out.println("buzz");
        // } else {
        // System.out.println(i);
        // }
        // }

    }

}