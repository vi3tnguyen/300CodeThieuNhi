package Options1;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Convert {

    public static void Calculator (String value){


        String value1 = "";
        String value2 = "";



        if(value.indexOf("+") >= 0){
           value1 = value.substring(0,value.indexOf("+"));
           value2 = value.substring(value.indexOf("+"),value.length());

           double total = Double.parseDouble(value1) + Double.parseDouble(value2);
            System.out.println(total);


        }



//        if(value.equals("+") && value2.equals("+")){
//            String valueConvert = value.replaceAll("[+]"," +");
//
//        }

        if(NumberUtils.isParsable(value) && NumberUtils.isParsable(value)) {
            int sum = Integer.parseInt(value) + Integer.parseInt(value2);
            System.out.println("value of sum " + sum);
        }else{

            System.out.println("Đây là chuỗi  : "+ value + value);
        }
    }




    public static void main(String[] args) {

        System.out.println(" Input Value : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" String number 1 : ");
        String value = scanner.nextLine();
//        System.out.println("String number 2 :");
//        String value2 = scanner.nextLine();

        String [] valuee = value.split(",",4);


        for(String arr : valuee){
            System.out.println(arr);
        }
        //Calculator(value);

    }
}
