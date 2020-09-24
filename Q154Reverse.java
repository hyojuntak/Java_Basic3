package JC.Chapter15;

import java.util.Scanner;

public class Q154Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 : ");String a = sc.next();
        // // String reversedString = new StringBuilder(a).reverse().toString();
        // // System.out.println("반대로 읽으면"+reversedString+"입니다.");
        System.out.print("반대로 읽으면");

        for (int i = a.length()-1; i>=0 ; i--) {
            System.out.print(a.charAt(i));
        }
        System.out.print("입니다.");
        // StringBuffer strBuffer= new StringBuffer();
        // String str = sc.next();
        // strBuffer.append(str);
        // System.out.println(strBuffer.reverse());
    }



}
