package Week_1.Week_11;

import java.util.Scanner;

public class LeapYear_New {

    int year;

    public void checkLeapYear(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year wants to check: ");
        this.year = scanner.nextInt();
        int option =  ( this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0 ) ? 1 : 0;

        switch (option){
            case 1:
                System.out.println(this.year + " - is Leap Year");
                break;
            default:
                System.out.println(this.year + " - is not Leap Year ");
        }


//        if(this.year % 400 == 0){
//            System.out.println(this.year + " - is LeapYear");
//        }else if(this.year % 4 == 0 && this.year % 100 != 0){
//            System.out.println(this.year + " - is LeapYear ");
//        }else{
//            System.out.println(this.year + " - is not LeapYear");
//        }

    }

    public static void main(String[] args) {
        LeapYear_New leapYear_new = new LeapYear_New();
        leapYear_new.checkLeapYear();
    }



}
