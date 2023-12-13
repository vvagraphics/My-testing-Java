// import java.util.Scanner;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Set;

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

        // Hardcoded Login
        // String Username = "user123";
        // String password = "pass123";
        // String enteredUsername = "user123";
        // String enteredPassword = "pass123";
        // if (enteredUsername.equals(Username) &&
        // enteredPassword.equals(enteredPassword)) {
        // System.out.println("Login Successful");
        // } else {
        // System.out.println("Login Failed");
        // }

        // Set All Elements to N
        // int[] arr = new int[5];
        // int n = 7;
        // Arrays.fill(arr, n);
        // System.out.println(Arrays.toString(arr));

        // Return Array Contents
        // int[] arr = { 1, 2, 3, 4, 5 };
        // System.out.println(Arrays.toString(arr));

        // Array Sum
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sum += arr[i];
        // }
        // System.out.println(sum);

        // Average
        // int[] arr = { 1, 2, 3, 4, 5 };
        // double average = Arrays.stream(arr).average().orElse(Double.NaN);
        // System.out.println(average);

        // Average v2
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sum += arr[i];
        // }
        // double average = (double) sum / arr.length;
        // System.out.println(average);

        // Get Max
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int max = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }
        // System.out.println(max);

        // int[] arr = { 1, 2, 3, 4, 5 };
        // int target = 4;
        // for (int i = 0; i < arr.length; i++) {
        // if (target == arr[i]) {
        // System.out.println("target at index " + i);
        // }
        // }

        // Arrays are equal
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int[] arr2 = { 1, 2, 3, 4, 5 };
        // boolean areEqual = Arrays.equals(arr, arr2);
        // if (areEqual) {
        // System.out.println("equal"+arr);
        // }else{
        // System.out.println("not qual");
        // }

        // binary search
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int target = 5;
        // int targetfound = Arrays.binarySearch(arr, target);
        // System.out.println(targetfound);

        // Max minus Min
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int max = Arrays.stream(arr).max().orElse(0);
        // int min = Arrays.stream(arr).min().orElse(max);
        // int result = max - min;
        // System.out.println(result);

        // isSorted
        // int[] arr = { 1, 2, 3, 4, 5 };
        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] > arr[i + 1]) {
        // System.out.println("false");
        // }
        // }

        // isSorted
        // int[] arr = { 1, 2, 3, 4, 5 };
        // boolean isSorted =
        // Arrays.stream(arr).boxed().sorted().mapToInt(Integer::intValue).toArray().equals(arr);
        // System.out.println(isSorted);

        // longest String
        // String[] strings = { "apple", "banana", "orange", "kiwi" };
        // String longest_string = "";
        // for (int i = 0; i < strings.length; i++) {
        // if (strings[i].length() > longest_string.length()) {
        // longest_string = strings[i];

        // }
        // }
        // System.out.println(longest_string);

        // Check Duplicates
        // int[] arr = { 1, 2, 3, 3, 4, 5 };
        // for(int i=0; i<arr.length; i++){
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[i]==arr[j]) {
        // System.out.println("true");
        // }
        // }
        // }

        // check for duplicates
        // int[] arr = { 1, 2, 3, 3, 4, 5 };
        // int[] duplicateCounts = checkDuplicatesAndCount(arr);

        // if (duplicateCounts.length == 0) {
        // System.out.println("The array does not contain duplicates.");
        // } else {
        // System.out.println("Duplicate values and their counts:");
        // for (int i = 0; i < duplicateCounts.length; i++) {
        // if (duplicateCounts[i] != 0) {
        // System.out.println("Number: " + i + ", Count: " + duplicateCounts[i]);
        // }
        // }
        // }
        // }

        // public static int[] checkDuplicatesAndCount(int[] arr) {
        // int[] duplicateCounts = new int[arr.length];

        // for (int i : arr) {
        // duplicateCounts[i]++;
        // }

        // return duplicateCounts;

        // pyramid
        // int height = 5;
        // for (int i = 1; i <= height; i++) {
        // for (int j = 1; j <= height - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i * 2 - 1; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // String str = "radar";
        // boolean isPalindrome = true;

        // for (int i = 0; i < str.length() / 2; i++) {
        // if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        // isPalindrome = false;
        // }
        // }
        // if (isPalindrome) {
        // System.out.println("true");
        // } else
        // System.out.println("false");

        // piglatin
        // String word = "hello";
        // String pigLatin = word.substring(1) + word.charAt(0) + "ay";
        // System.out.println(pigLatin);

        // SELECT age, COUNT(*) AS age_count FROM person GROUP BY age ORDER BY age ASC;

        // int[] numbers = { 10, 20, 30, 40, 50 };

        // for (int x : numbers) {
        // System.out.print(x);
        // System.out.print(",");
        // }
        // volatile Singleton instance;
        // if (instance == null) {
        // synchronized (Singleton.class) {
        // if (instance == null) {
        // instance = new Singleton();
        // }
        // }
        // }
        // return instance;

        // public static String generateMD5Hash(String data) {
        // try {
        // MessageDigest md = MessageDigest.getInstance("MD5");
        // byte[] bytes = md.digest(data.getBytes());
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < bytes.length; i++) {
        // sb.append(String.format("%02x", bytes[i]));
        // }
        // return sb.toString();
        // } catch (NoSuchAlgorithmException e) {
        // e.printStackTrace();
        // return null;
        // }
        // }
        // VPS HOSTINGER settup example
        // # Connect to the VPS using SSH
        // ssh username@vps_ip_address

        // # Change to the root user
        // sudo su

        // # Update the package repository
        // sudo apt update

        // # Upgrade all installed packages
        // sudo apt upgrade

        // # Install Java Development Kit (JDK)
        // sudo apt install openjdk-11-jre-headless

        // # Verify Java installation
        // java -version

        // # Install Node.js
        // curl -fsSL https://deb.nodesource.com/setup_16.x | bash -
        // sudo apt install -y nodejs

        // # Install Maven (build tool)
        // sudo apt install maven

        // # Install web server (Tomcat)
        // sudo apt install tomcat9

        // # Set up firewall to allow incoming traffic on ports 8080 (Spring Boot) and
        // 3000 (React/Angular)
        // sudo ufw allow 8080
        // sudo ufw allow 3000

        // # Start the Tomcat web server
        // sudo systemctl start tomcat

        // # Enable Tomcat to start automatically on boot
        // sudo systemctl enable tomcat

        // # Create a directory for your application
        // mkdir /opt/myapp

        // # Transfer your application files to the VPS
        // scp -r application_files username@vps_ip_address:/opt/myapp

        // # Change directory to the application directory
        // cd /opt/myapp

        // # Build the Spring Boot application
        // mvn clean package

        // # Deploy the Spring Boot application
        // java -jar target/myapp.jar

        // # Start the React or Angular application
        // npm start (for React) or ng serve (for Angular)
    }
    // Javascript
    // Challenge:

    // Fibonacci sequence:

    // JavaScript
    // function

    // fibonacci(n) {
    // if (n <= 1) return n;
    // return fibonacci(n - 1) + fibonacci(n - 2);
    // }

    // // Example usage
    // const result = fibonacci(10); // result will be 55

}