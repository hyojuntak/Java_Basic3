package JC.Chapter16;

import java.util.Scanner;

public class Q161dimove  {
    public static void main(String[] args) throws ArithmeticException{
        
        try{
        Scanner sc = new Scanner(System.in);
        System.out.print("x값 : ");int a = sc.nextInt();
        System.out.print("y값 : ");int b = sc.nextInt();
        System.out.println("x * y = "+a*b);
        System.out.println("x / y = "+a/b);
        }
        catch (ArithmeticException e) {
            System.out.println("0값 출력");
            
            //TODO: handle exception
        }finally{
            
        }
        
        
        
        // while (true) {
        //     a/=b;
        //     break;
        // }
        // System.out.println("몫 : "+a);

        
    }

	public static void dimove(int a, int b) {
	}
}
