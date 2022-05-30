package Week_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment_23 {






    public static void main(String[] args) {
        Assignment_23 assignment_23 = new Assignment_23();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number element of array: ");
        int n = scanner.nextInt();
        int [] arrValue = new int[n];

        System.out.println("Input value of elements");
        for(int i = 0 ; i < arrValue.length ; i++){
            System.out.print("arrValue" + "[" + i + "]: ");
            arrValue[i] = scanner.nextInt();
        }
        System.out.println("---Array---> " + Arrays.toString(arrValue));

        //Swap element of array
        int [] arrSwap = new int[arrValue.length];
        int index = arrSwap.length;

        for(int i =0 ; i < arrValue.length ; i++ ){
            arrSwap[index - 1] = arrValue[i];
            index--;
        }

        System.out.println("---Swap Array--->" + Arrays.toString(arrSwap));
    }
}
