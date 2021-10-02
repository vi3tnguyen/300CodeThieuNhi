package Week_3;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_22 {

    public int[] arrCompute(int[] arrMatching) {


        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrMatching.length; i++) {
            System.out.print("Giá trị thứ " + i + " là: ");
            arrMatching[i] = scanner.nextInt();
            sum = sum + arrMatching[i];
        }
        scanner.close();
        System.out.println("Sum of array is: " + sum);

        return arrMatching;
    }

    public static void main(String[] args) {
        Assignment_22 assignment_22 = new Assignment_22();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input số phần tử của mảng");
        int n = scanner.nextInt();
        int[] arrMatch = new int[n];

        int[] arrReturn = assignment_22.arrCompute(arrMatch);
        System.out.println(Arrays.toString(arrReturn));
    }
}
