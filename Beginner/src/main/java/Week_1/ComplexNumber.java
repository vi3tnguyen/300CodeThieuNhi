package Week_1;

public class ComplexNumber {
    //Cộng 2 số phức trong java là cộng cho phần thực và phần ảo của số phức
    // real là số thực - img là số ảo
    double real , img;
    double total1 , total2;

    ComplexNumber(double r, double l){
        real = r;
        img = l;
    }

    public void sum(ComplexNumber c2){

        //ComplexNumber ex = new ComplexNumber(0,0);
        //total = this.real + c2.real
        this.total1 = this.real + c2.real;
        this.total2 = this.img + c2.img;


    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5,10);

        c1.sum(c1);

        System.out.println("Ket Qua: " + c1.total1 + " + " + c1.total2 + "i");

    }


}
