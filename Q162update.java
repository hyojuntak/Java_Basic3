package JC.Chapter16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q162update {

    static int mul(int x, int y){
        return x*y;

    }
    static int div(int x, int y){
        return x/y;

    }

    static void muldiv(int x, int y){
        System.out.println("x*y = "+mul(x, y));
        System.out.println("x/y = "+div(x, y));

    }



    public static void main(String[] args) throws InputMismatchException{
        
            Scanner sc = new Scanner(System.in);

            
            
            try {
                System.out.print("x값 : ");int a = sc.nextInt();
                System.out.print("y값 : ");int b = sc.nextInt();
                muldiv(a, b);
        
            } catch (InputMismatchException e) {
                //TODO: handle exception
                System.out.println("입력 오류 발생."+e);
                e.printStackTrace();
            } catch(ArithmeticException e){
                System.out.println("산술 오류 발생"+e);
                e.printStackTrace();
            }finally{
                System.out.println("프로그램을 종료합니다.");
            }
    }
}
