package Week_2;

import jdk.jshell.EvalException;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_8 {


    public static void main(String[] args) {

        Assignment_8 assignment_8 = new Assignment_8();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ky tu....");
        String str = scanner.nextLine();

        // Tach chuoi 1 mang kieu string
        // chay vong lap for cho mang , trong vong lap xet chuoi
        // them 1 mang luu so lan xuat hien cua chuoi con
        // neu chuoi con chua xuat hien , so lan xuat hien += 1


        String [] valueString = str.split("\\s");
        String [] cacheString = new String[valueString.length];
        int [] count = new int[valueString.length];
        int lastIndex = 0;


        for(int i = 0 ; i < valueString.length ; i++ ){
            boolean isCheck = false;
            for(int j = 0 ; j < lastIndex ; j++){
                if(cacheString[j].equals(valueString[i])){
                    count[j] += 1;
                    isCheck = true;
                    break;
                }
            }
            if(!isCheck){
                cacheString[lastIndex] = valueString[i];
                count[lastIndex] = 1;
                lastIndex++;
            }

        }

        int maxIndex = 0;
        for( int i = 0 ; i < count.length ; i++){
            if(count[i] > count[maxIndex]){
                maxIndex = i;
            }
        }
        System.out.println("giá trị lặp lại nhiều nhất " + count[maxIndex] + "-" + cacheString[maxIndex]);


        for(int i = 0 ; i < lastIndex ; i++){
            System.out.println("--->" + cacheString[i] + "--" + count[i]);
        }

    }

}
