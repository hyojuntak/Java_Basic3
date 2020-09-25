package JC.Exam.Exam8;

import java.util.Random;
import java.util.Scanner;

public class Collect {
    public static void main(String[] args) {
        
        
        
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        int no = 100 + rand.nextInt(899);
        System.out.println("숫자 맞추기 게임 시작!");
        System.out.println("100부터 999사이의 숫자를 맞추세요.");

        int x;
        int count = 0;

        do {
            System.out.print("어떤 숫자일까?");
            x = stdIn.nextInt();
            count++;
            if(x>no) {System.out.println("더 작은 숫자입니다."); }
            else if(x<no) {System.out.println("더 큰 숫자입니다."); }
        } while (x!=no);
            
        System.out.println("정답입니다.");
        System.out.println(count+" 회에 맞추었습니다.");
    }
}
