public class ComplexNumber {
    //cho phần thực và phần ảo của số phức
    double real, img;

    //constructor để khởi tạo số phức
    ComplexNumber(double r, double i){
        this.real = r;
        this.img = i;

    }

    public void sum(ComplexNumber c1)
    {
        //tạo một số phức tạm thời để giữ tổng của hai số
        //ComplexNumber temp = new ComplexNumber(0, 0);

        real = this.real + c1.real;//cộng các phần thực
        img = this.img + c1.img;//cộng các phần ảo

        //trả về số phức đầu ra
        //return real;
    }
    public static void main(String args[]) {
        ComplexNumber c1 = new ComplexNumber(5.2, 4.4);//nhập vào phần thực và phần ảo của số phức thứ nhất
        ComplexNumber c2 = new ComplexNumber(2.0, 7.3);//nhập vào phần thực và phần ảo của số phức thứ hai
         c1.sum(c1);
        System.out.println("Kết quả là: "+ c1.real+" + "+ c1.img +"i");//hiển thị kết qua ra màn hình
    }
}
