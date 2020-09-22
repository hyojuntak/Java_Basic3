package JC.Chapter10;

public class hung {

    public static void main(String[] args) {
            //byte(8비트정수)  
            System.out.println("정수형의 표현 범위");
            System.out.println("byte형 : " + Byte.MIN_VALUE + "~"+Byte.MAX_VALUE);  
                
            //short(16비트정수)  
            System.out.println("short형: " + Short.MIN_VALUE+"~" + Short.MAX_VALUE);  
                
            //char(16비트 부호없는정수)  
            System.out.println("char형 : " + (int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);  
                
            //int(32비트정수)  
            System.out.println("int 형 : " + Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);  
                
            //long(64비트정수)  
            System.out.println("long 형: " + Long.MIN_VALUE+"~"+ Long.MAX_VALUE);  
        
        
    }

}
