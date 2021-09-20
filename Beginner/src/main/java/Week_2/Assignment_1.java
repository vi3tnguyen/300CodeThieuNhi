package Week_2;

import java.util.Scanner;

public class Assignment_1 {

    public void checkVowel(){

        boolean isVowel = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value need to check: ");
        char value = scanner.next().charAt(0);
        scanner.close();

        switch (value){
            case 'u':
            case 'e' :
            case 'o' :
            case 'a' :
            case 'i' :
            case 'U' :
            case 'E' :
            case 'O' :
            case 'A' :
            case 'I' : isVowel = true;

            default:
                System.out.println("Response value : " + isVowel);
        }

        if(isVowel){
            System.out.println(value + " - is Vowel");
        }else{
            if((value >= 'a' && value <= 'z') || (value >= 'A' && value <='Z'))
                System.out.println(value+" - is consonant");
            else
                System.out.println("Not belongs to Alphabet !");
        }



    }

    public static void main(String[] args) {
        Assignment_1 assign = new Assignment_1();
        assign.checkVowel();


    }

}
