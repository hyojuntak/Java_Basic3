package JC.Chapter10;

import java.util.Scanner;

public class Q106circle {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("실수값 : ");double a = sc.nextDouble();
        System.out.print("절대값 : "+Math.abs(a));
        System.out.println();
        System.out.println("제곱근 : "+Math.sqrt(a));
        System.out.println("면적 : "+Math.PI*(Math.pow(a, 2)));


    }
}
