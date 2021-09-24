package Week_2;

import java.util.Scanner;

public class Assignment_8 {


    public static void main(String[] args) {

        Assignment_8 assignment_8 = new Assignment_8();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ky tu....");
        String str = scanner.nextLine();
        // xin chao cac ban
        String strValue = str.replaceAll("\\s", "");


        char[] value = strValue.toCharArray();

        char[] arrCharacter = new char[value.length];
        int[] count = new int[value.length];


        int lastIndex = 0;

        if (Character.isAlphabetic(value[0])) {
            arrCharacter[0] = value[0];
            count[0] = 1;
            lastIndex++;
        }


        for (int i = 1; i < value.length; i++) {

            if (Character.isAlphabetic(value[i])) {
                boolean isCheck = false;
                for (int j = 0; j < lastIndex; j++) {
                    if (arrCharacter[j] == value[i]) {
                        count[j] += 1;
                        isCheck = true;
                        break;
                    }
                }
                if (!isCheck) {
                    arrCharacter[lastIndex] = value[i];
                    count[lastIndex] = 1;
                    lastIndex++;
                }
            }


        }

        for (int i = 0; i < lastIndex; i++) {
            System.out.println(arrCharacter[i] + "-" + count[i]);

        }

    }
}
