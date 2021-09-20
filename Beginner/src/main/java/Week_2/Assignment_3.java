package Week_2;

import java.util.Scanner;

public class Assignment_3 {

    public void formula(double P, double R, double T){

        double sinterest = (P * R * T ) / 100;

        System.out.println("Số tiền lãi là : " + sinterest);

    }


    public static void main(String[] args) {
        Assignment_3 assignment_3 = new Assignment_3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Value ----------------");
        System.out.println("Số tiền gốc bỏ ra vào : ");
        double P = scanner.nextDouble();
        System.out.println("Lãi suất mỗi năm : ");
        double R = scanner.nextDouble();
        System.out.println("Thời gian ( Tính bằng năm ) : ");
        double T = scanner.nextDouble();
        System.out.println("-------------------------------");
        scanner.close();
        assignment_3.formula(P,R,T);
    }
}
