package Week_2;

import java.util.Scanner;

public class Assignment_4 {


    public int phanNguyen(int num1, int num2){
        int phanNg = num1 / num2;
        return phanNg;
    }

    public int phanDu(int num1, int num2){
        int phanDu = num1 % num2;
        return phanDu;
    }

    public static void main(String[] args) {

        Assignment_4 assignment_4 = new Assignment_4();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int num2 = scanner.nextInt();

        int phanNg1 = assignment_4.phanNguyen(num1,num2);
        System.out.println("Giá trị của phần nguyên là : " + phanNg1);
        int phanDu1 = assignment_4.phanDu(num1,num2);
        System.out.println("Giá trị của phần dư là : " + phanDu1);

    }

}
