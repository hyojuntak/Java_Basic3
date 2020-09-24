package JC.Chapter15;

import java.util.Scanner;

public class Q1510charat {
    
    static void charAt(String[] s1) {
        
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length(); j++) {
                System.out.print(s1[i].charAt(j));
            }
            System.out.println();
        }         
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열의 개수 : ");int a = sc.nextInt();
        String[] s1 = new String[a];
        
        for (int i = 0; i < s1.length; i++) {
            System.out.print("s["+i+"]=");
            s1[i] = sc.next();
        }


        charAt(s1);
        
    }
}
