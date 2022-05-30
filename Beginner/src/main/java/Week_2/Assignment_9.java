package Week_2;

import java.util.*;

public class Assignment_9 {

    public void timKiem(String str) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] chars = str.toCharArray();
        // 1bca
        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        Set<Character> keys = map.keySet();

        for (Character ch : keys) {
            if (map.get(ch) > 1) {
                System.out.println("Char " + ch + " " + map.get(ch));
            }
        }
    }

    public static void main(String a[]) {
        Assignment_9 assignment_9 = new Assignment_9();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ky tu....");
        String str = scanner.nextLine().replaceAll("\\s", "");
        assignment_9.timKiem(str);
    }


}
