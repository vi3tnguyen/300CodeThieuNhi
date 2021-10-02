package Week_3;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_24 {


    public static void main(String[] args) {
        Assignment_24 assignment_24 = new Assignment_24();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number elements of array: ");
        int n = scanner.nextInt();
        int [] arrElements = new int[n];

        for(int i = 0 ; i < arrElements.length ; i++){
            System.out.println("Input value of elements");
            System.out.println("arrElements" + "[" + i + "]" + ":" );
            arrElements[i] = scanner.nextInt();
        }
        System.out.println("-->Array : " + Arrays.toString(arrElements));

        int temp = arrElements[0];

        for(int i = 0 ; i < arrElements.length ; i++){
            for(int j = i + 1 ; j < arrElements.length  ; j++){
                if(arrElements[i] > arrElements[j]){
                    temp = arrElements[j];
                    arrElements[j] = arrElements[i];
                    arrElements[i] = temp;
                }
            }
        }
        System.out.println("---> Arrangement : " + Arrays.toString(arrElements));

    }
}
