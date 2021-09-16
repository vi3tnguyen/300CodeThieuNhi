public class Exercise_Week_1 {

    // Cộng 2 số trong Java
    // Check 2 số chẵn lẽ

    int a;
    int b;


    void checkValue(int a, int b){
        this.a = a;
        this.b = b;
        int c = a+b;

        int d = a * b;

        System.out.println("Sum of value C: " + c);

        if(a %2 == 0){
            System.out.println("Giá trị chẳn " + a);
        }else{
            System.out.println("Giá trị lẻ " + a);
        }


        System.out.println("Nhân 2 số trong java " + d);

        System.out.println("================");
        
    }


    // Check commit code with some field change


    public static void main(String[] args) {
        Exercise_Week_1 ex = new Exercise_Week_1();
        ex.checkValue(2,4);



    }


}
