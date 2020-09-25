package JC.Exam.Exam5;

import java.util.Scanner;

public class HelloJE {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("성 : ");
        String last = stdIn.next();
        
        System.out.print("이름 : ");
        String first = stdIn.next();
        
        System.out.println("안녕하세요 "+last+first+"님");
        System.out.println("Hello "+first+last);



    }
}
