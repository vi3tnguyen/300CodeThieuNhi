package Week_2;

import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        ArrayPractice arr = new ArrayPractice();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri dau vao...");
        String value = scanner.nextLine().replaceAll("\\s","");
        scanner.close();

        // convert String ---> Array type = Char
        char [] arrValue = value.toCharArray();
        // init array type  char name is arrCheck and arrCheck = arrValue
        char [] arrCheck = new char[arrValue.length] ;
        //Int array type int char name is count
        int [] count = new int[arrValue.length];

        int lastIndex = 0 ;

        if(Character.isAlphabetic(arrValue[0])){
            arrCheck[0] = arrValue[0];
            count[0] = 1;
            lastIndex++ ;
        }

        for(int i = 1 ; i < arrValue.length ; i++){

            boolean isCheck = false;
            if(Character.isAlphabetic(arrValue[i])){
                for(int j = 0 ; j < lastIndex ; j++){
                    if(arrCheck[j] == arrValue[i]){
                        //arrCheck[j] = arrValue[i];
                        count[j] += 1;
                        isCheck = true;
                        break;
                    }
                }
            }if(!isCheck){
                arrCheck[lastIndex] = arrValue[i];
                count[lastIndex] = 1;
                lastIndex++;
            }
        }

        for(int i = 0 ; i < lastIndex ; i++){
            System.out.println(arrCheck[i] + "--" + count[i]);
        }

    }

}
