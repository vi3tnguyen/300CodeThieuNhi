package Week_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment_2 {

    //formula : P (1 + R/n) (nt)

    public void calculate(double p ,double t, double r, double n) {

        double amount = p * Math.pow(1 + (r / n), n * t);
        double compounding = amount - p;
        DecimalFormat df = new DecimalFormat("#.##");


        System.out.println("Lãi kép sau " + t + " năm là : "+ df.format(compounding));
        System.out.println("Số tiền có được sau " + t + " năm là: "+ df.format(amount));
    }
    public static void main(String[] args) {
        Assignment_2 assignment_2 = new Assignment_2();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 4 - value ");
        System.out.println("Số tiền gốc P: ");
        double p = scanner.nextDouble();
        System.out.println("Số thời gian đầu tư n(năm): ");
        double t = scanner.nextDouble();
        System.out.println("Lãi suất hàng năm R: ");
        double r = scanner.nextDouble();
        System.out.println("Lãi năm = 12 tháng (n) : ");
        double n = scanner.nextDouble();
        scanner.close();
        assignment_2.calculate(p,t,r,n);
        System.out.println();

    }


}
