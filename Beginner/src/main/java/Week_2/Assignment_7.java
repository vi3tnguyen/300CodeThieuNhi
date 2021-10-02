package Week_2;

import java.util.Locale;
import java.util.Scanner;

public class Assignment_7 {

    // chuyển chữ Hoa thành chữ thường
    // Chuyển đổi char --> String



    public static void main(String[] args) {

        Assignment_7 assignment_7 = new Assignment_7();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Value Type String :" );
        String value = scanner.nextLine();
        System.out.println("Input value type char: ");
        char character = scanner.next().charAt(0);
        scanner.close();


        System.out.println("Value Lower Case To Upper Case : " + value.toLowerCase());
        System.out.println("Switch char --> string :" + Character.toString(character));

    }



}
