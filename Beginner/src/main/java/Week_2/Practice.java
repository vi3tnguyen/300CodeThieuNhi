package Week_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Practice practice = new Practice();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Some thing...");
        String str = scanner.nextLine();

//        Date date = new Date();
//        System.out.println(date.toString());

        char [] convertChar = str.toCharArray();

        //[bla bla bla]
        int count = 0;
        for(int i = 0 ; i < convertChar.length ; i ++){
            if(convertChar[i] == ' '){
                count++;
                for(int j = i ; j <  convertChar.length - 1 ; j++){
                    convertChar[j] = convertChar[j+1];
                }
            }
        }

        String convertString = String.valueOf(convertChar);
        System.out.println("---" + convertString.substring(0,convertString.length()-1));

//        String [] convertStr = str.split("\\s");
//        for(String splitStr : convertStr){
//            System.out.print(splitStr);
//        }
//
//        //String str1 = Arrays.toString(convertStr);
//
//        System.out.println(convertStr[0]);




    }

}
