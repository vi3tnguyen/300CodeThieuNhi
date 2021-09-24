package Week_2;

public class Assignment_5 {

    String value ;

    Assignment_5(String value){
        this.value = value.replaceAll(" ", "");
        System.out.println("After replace string : " + this.value);
    }

    public static void main(String[] args) {

        Assignment_5 assignment_5 = new Assignment_5("x i n c h a o c a c b a n");

    }
}
