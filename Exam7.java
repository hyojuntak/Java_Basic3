package JC.Exam.Exam7;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a:");int a = stdIn.nextInt();
        System.out.print("b:");int b = stdIn.nextInt();
       
        boolean result1 = true;
        boolean result2 = true;
        
        result1 = a%2==0 ? true : false;
        result2 = b%2==0 ? true : false;

        if(result1 && result2) {System.out.println("양쪽 모두 짝수입니다."); }
        else if(!result1 && !result2){System.out.println("양쪽 모두 홀수입니다."); }
        else{System.out.println("한쪽만 홀수입니다.");}
       
       
       
    
    
    }
}
