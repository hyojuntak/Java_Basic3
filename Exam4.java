package JC.Exam.Exam4;

import java.util.Random;

public class RandTen {
    public static void main(String[] args) {
        Random rand = new Random();
        int k = 2*rand.nextInt(449)+101;
        int k1 = k*10;
        int k2 = k - (k/100)*100  ;
        int k3 = k2 - (k2/10)*10 ;
        



        System.out.println("생성한 난수는"+k+"입니다.");
      
        System.out.println("10배한 값은"+k1+"입니다."); 
        
        
        System.out.println("마지막 자릿수는"+k3+"입니다."); 

    }
}
