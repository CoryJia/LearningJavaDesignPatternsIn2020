package structuralpattern.ch13decorator;

import java.util.*;

/**
 * @author : Cory Jia on 11/29/19
 */
public class Test {
    public static void main(String[] args) {
        // put your code here
//        String input = "we found a treasure!";
//        encrypt(input);

        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        while (sc.hasNext()) {
            list.add(sc.nextLine());
            if (list.size() == 2) break;
        }

        encrypt(list.get(0), Integer.valueOf(list.get(1)));
//        encrypt("welcome to hyperskill", 5);
    }

    private static void encrypt(String input, int key) {
        char[] dic = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                int idx = ch - 'a';

                ch = dic[(idx + key) % 26];
            }
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }

}
