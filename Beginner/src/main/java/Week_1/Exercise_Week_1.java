package Week_1;

public class Exercise_Week_1 {

    // Cộng 2 số trong Java
    // Check 2 số chẵn lẽ
    int a;
    int b;

    Exercise_Week_1(int a, int b){
        this.a = a;
        this.b = b;
    }

    int nhan(){
         int e = this.a * this.b;
        return e;
    }

    int Sum(){
        int c = this.a + this.b;
        return c;
    }


    void checkGiaTri(){
        if(this.a  %2 == 0){
            System.out.println("Giá trị chẳn " + this.a);
        }else{
            System.out.println("Giá trị lẻ " + this.a);
        }
    }
    // Check commit code with some field change


    public static void main(String[] args) {
        Exercise_Week_1 ex = new Exercise_Week_1(2,4);
        int d = ex.nhan();
        int g = ex.Sum();
        ex.checkGiaTri();
        System.out.println("Nhân " + d);
        System.out.println("Sum of value C: " + g);


    }


}
