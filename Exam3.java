package JC.Exam.Exam3;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final double PI = 3.1416;
        Scanner stdin = new Scanner(System.in);
        System.out.print("반지름 : ");
        double r = stdin.nextDouble();
        System.out.println("원의 둘레는 "+2*PI*r+"입니다.");
        System.out.println("면적은 "+PI*(Math.pow(r, 2))+"입니다.");
         
    }
}
