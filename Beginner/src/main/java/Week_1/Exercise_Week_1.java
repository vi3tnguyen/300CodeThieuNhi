package Week_1;

import java.util.Scanner;

public class Exercise_Week_1 {

    // Cộng 2 số trong Java
    // Check 2 số chẵn lẽ

    public int a;
    public int b;
    public int e = 10;




    public Exercise_Week_1(int a, int b){
        this.a = a;
        this.b = b;
    }

    int nhan(){
        return this.a * this.b;

    }

    int Sum(){
        return this.a + this.b;

    }


    void checkGiaTri(int a){


        if(a  %2 == 0){
            System.out.println("Giá trị chẳn " + a);
        }else{
            System.out.println("Giá trị lẻ " + a);
        }
    }
    // Check commit code with some field change


    public static void main(String[] args) {
        Exercise_Week_1 ex = new Exercise_Week_1(2,4);
        int d = ex.nhan();
        int g = ex.Sum();
        Scanner scanner = new Scanner(System.in);
        int chanle = scanner.nextInt();

        ex.checkGiaTri(chanle);
        System.out.println("Nhân " + d);
        System.out.println("Sum of value C: " + g);


    }


}
