package JC.Chapter15;

import java.util.Arrays;
import java.util.Scanner;

public class Q152String {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

        char [] e = {'A','B','C','D','E','F','G','H','I','J'};

        String s1 = "ABC";
        String s2 = new String();
        String s3 = new String(e);
        String s4 = new String(e,5,3);
        String s5 = new String("XYZ");
        String s6 = new String("HAL");

        System.out.print("문자열 : ");String a = sc.next();

        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s3="+s3);
        System.out.println("s4="+s4);
        System.out.println("s5="+s5);
        System.out.println("s6="+s6);
       

        char i ='a';
        String g = "a";
        System.out.println(i);
        System.out.println(g);

    }
}
