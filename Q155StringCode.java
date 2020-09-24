package JC.Chapter15;

import java.util.Scanner;

public class Q155StringCode {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 s :" );String s = sc.next();

        for (int i = 0; i< s.length(); i++) {
            System.out.printf("s[%d]=%c %X \n",i,s.charAt(i),(int)s.charAt(i));
        }
    }
}
