package Week_1.Week_11;


import java.util.Scanner;

public class ArrayArrangement {


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập phần tử k = ");
        int k = scanner.nextInt();
        // sắp xếp dãy số theo thứ tự tăng dần
        sortASC(arr);
        System.out.print("Sắp xếp mảng tăng dần: ");
        show(arr);
        System.out.printf("\nChèn phần tử %d vào mảng.", k);
        arr = insert(arr, k);
        System.out.print("\nMảng sau khi chèn: ");
        show(arr);
    }

    /**
     * sắp xếp mảng số nguyên theo thứ tự tăng dần
     *
     * @param arr: mảng các số nguyên
     */
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length; i++) { // [ 1 , 3 , 2 , 5 ]
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {  //[4>2] [1][2]
                    temp = arr[j]; // temp = 2
                    arr[j] = arr[i]; // [4][]4]
                    arr[i] = temp;
                }
            }
        }
    }


    /**
     * chèn phần tử vào mảng số nguyên tăng dần
     * sau khi chèn mảng vẫn duy trì thứ tự tăng dần
     *
     * @param arr: mảng số nguyên tăng dần
     * @param k: phần tử chèn vào mảng arr
     */
    public static int [] insert(int [] arr, int k) {
        int arrIndex = arr.length - 1; //[1,5,8, 9] = index[0,1,2,3] ;  arr.length = 4 phần tử --> arrIndex = 3;,
        int tempIndex = arr.length;
        int [] tempArr = new int [tempIndex + 1];
        boolean inserted = false;

//        LastIndex = lenght - 1;
//        FirstIndex = 0;
//        for (int i=0; i<= arr.length ; i++)
//        for (int i = arr.length-1 ; i > 0 ; i--) // for (int i > 0 ; i = arr.length - 1 ; i--
//            arr[i]
//                //[1,5,8, 9] lenght=4 => a[0,1,2,3]
//        // a[0] = 1, a[1] = 5, a[2] = 8, a[3] =9
//        // arr[0] ==> arr[arr.length -1 ]
//       // k = 7
//        // [ x, x, x, x, 9] = tempArr
//        temp[0] = 1
//        temp[1] = 5
//        temp[2] = 7
//        temp[3] = 8
//        temp[4] = 9
         //i =1
        //arrIndex = 1 ;

        //tempIndex= 4;
        //tempindex = tempArr.length -1;

        //[0,2,3]
       //Index 0-1-2
       //K = 1
        //[0,0,0,0]
        //[0,0,0,3]
        //[0,0,2,3]
        //[0,1,2,3]
        //[0,1,2,3]


        for (int i = tempArr.length -1 ; i >= 0; i--) {
            if (arrIndex > -1 && arr[arrIndex] > k) {
                tempArr[i] = arr[arrIndex];//[0,1,2,3]
                arrIndex--;
            } else {
                if (!inserted) {
                    tempArr[i] = k;
                    inserted = true;
                } else {
                    tempArr[i] = arr[arrIndex];
                    arrIndex--;
                }
            }
        }
        return tempArr;
    }

    /**
     * in các phần tử của mảng ra màn hình
     *
     * @param arr: mảng các số nguyên
     */
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    }


