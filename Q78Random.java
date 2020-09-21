package JC.Chapter7;

import java.util.Random;
import java.util.Scanner;

/**
 * Q78random
 */
public class Q78random {


    public int random(int a, int b) {
        Random rd = new Random();
        int rdresult = a + rd.nextInt(b);
        return rdresult;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("난수를 생성합니다.");
        System.out.print("하한값:");int a = sc.nextInt();
        System.out.print("상한값:");int b = sc.nextInt();
        Q78random rd = new Q78random();
        int result = rd.random(a, b);
        System.out.printf("생성한 난수는 %d입니다.",result);
    }
}
