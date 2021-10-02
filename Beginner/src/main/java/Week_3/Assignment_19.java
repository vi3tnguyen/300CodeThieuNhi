package Week_3;

import java.util.Scanner;

public class Assignment_19 {

    public static void countCharacter(String str){

        char [] convertCharacter = str.toCharArray();
        char [] cacheCharacter = new char[convertCharacter.length];
        int  [] countCharacter = new int[convertCharacter.length];
        int lastIndex = 0 ;


        for(int i = 0 ; i < convertCharacter.length ; i++){
            boolean isCheck = false;
            for(int j = 0 ; j < lastIndex ; j++){
                if(cacheCharacter[j] == convertCharacter[i]){
                    isCheck = true;
                    countCharacter[j] += 1;
                    break;
                }
            }if(!isCheck){
                cacheCharacter[lastIndex] = convertCharacter[i];
                countCharacter[lastIndex] = 1;
                lastIndex++;
            }
        }

        for(int i = 0 ; i < lastIndex ; i++){
            System.out.println("Number character repeat " + cacheCharacter[i] + "-" + countCharacter[i] + "Lần");
        }


    }

    public static void main(String[] args) {
        Assignment_19 assignment_19 = new Assignment_19();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string : ");
        String str = scanner.nextLine().replaceAll("\\s","");
        scanner.close();
        countCharacter(str);
    }
}
