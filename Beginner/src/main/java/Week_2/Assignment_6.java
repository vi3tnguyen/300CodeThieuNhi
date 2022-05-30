package Week_2;

import java.util.Locale;
import java.util.Scanner;

public class Assignment_6 {

    public static void main(String[] args) {
        Assignment_6 assignment_6 = new Assignment_6();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value :" );
        String str = scanner.nextLine();
        scanner.close();

//        String firstString = str.substring(0,1).toUpperCase();
//        System.out.println("first string " + firstString);
//
//        String remainString = str.substring(1, str.length());
//        System.out.println("------" + remainString);
//
//        str = firstString + remainString;
//        System.out.println("Show UpperCase --->> " + str);

        char [] firstString = str.toCharArray();
        boolean foundSpace = true;


        for (int i = 0 ; i < firstString.length ; i ++){

            if(Character.isAlphabetic(firstString[i])){
                if(foundSpace){

                    firstString[i] = Character.toUpperCase(firstString[i]);
                    foundSpace = false;
                }
            }else{
                foundSpace = true;
            }
        }

        str = String.valueOf(firstString);
        System.out.println("String after convert : " + str);



    }
}
