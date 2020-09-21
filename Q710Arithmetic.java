package JC.Chapter7;

import java.util.Random;
import java.util.Scanner;

public class Q710four {

    public int answer(int x, int y, int z, int choice) {
        Scanner sc = new Scanner(System.in);
        
        int result = 0;
            
        for (int i = 0; i < 4; i++) {
            if (choice==1) {
                result = x+y+z; System.out.printf("%d + %d + %d = ",x,y,z);
                int g1 = sc.nextInt();
                if(result!=g1) {return 0;} 
                else {return 1;}
                 
            }
                   
           else if (choice==2) {
                result = x+y-z; System.out.printf("%d + %d -%d =",x,y,z);
                int g2 = sc.nextInt(); 
                if(result!=g2)  {return 0;}
                else {return 1;}
            
            }

            else if (choice==3) {
                result = x-y+z;System.out.printf("%d - %d +%d =",x,y,z);
                int g3 = sc.nextInt(); 
                if(result!=g3) { return 0;}
                else { return 1;}
            
            }

            else if (choice==4) {
                result = x-y-z;System.out.printf("%d - %d -%d =",x,y,z);
                int g4 = sc.nextInt(); 
                if(result!=g4) {return 0;}
                else {return 1;}
                
            
            }
        }
        return 1;
        }
        
       
    public static void main(String[] args) {
        
        Scanner se = new Scanner(System.in);
       
        System.out.println("암산 훈련 !!!");

        //난수발생

        
       
        //함수호출
        Q710four fo = new Q710four();

        while(true){

            Random rd = new Random();     
            int x = rd.nextInt(900)+100;
            int y = rd.nextInt(900)+100;
            int z = rd.nextInt(900)+100;
            int choice = 1+rd.nextInt(4);
            int result =0;
            int realresult = fo.answer(x, y, z,choice);
            if (realresult==0) System.out.println("틀렸습니다.!");
            
            if (realresult==1) {
                System.out.println("정답입니다.!");
                System.out.print("다시 한 번?<Yes...1/No...0>:");
                int ee = se.nextInt();
                if(ee==0)break;
            }     
        }
       
        
    }
}
