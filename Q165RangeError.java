package JC.Chapter16;

import java.util.Scanner;

/**
 * InnerQ165RangeError
 */
//값이 범위 밖에 있는(0~9가 아닌)것을 나타내는 예외
class RangeError extends RuntimeException {
    RangeError(int n) {super("범위 밖 값 : "+n);}
}
//메서드의 매개 변수가 범위 밖에 있는 것을 나타내는 예외
class ParameterRangeError extends RangeError {
    ParameterRangeError(int n) {super(n);}
}
//연산 결과가 범위 밖인 것을 나타내는 예외
class ResultRangeError extends RangeError {
    ResultRangeError(int n) {super(n);}
}

public class Q165RangeError {
    
    static boolean isValid(int n){
        return n>=0 && n<=9;

    }

    static int add(int a, int b) {
        if(!isValid(a)) throw new ParameterRangeError(a);
        if(!isValid(b)) throw new ParameterRangeError(a);
        
        int result = a+b;
        if(!isValid(result)) throw new ResultRangeError(result);
        return result;
    }
    
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 a : ");int a = sc.nextInt();
        System.out.print("정수 b : ");int b = sc.nextInt();      

        
        try {
            System.out.println("합은 "+add(a,b)+"입니다.");
            
        } catch (RangeError e) {
            System.out.print("범위 밖 예외가 발생했습니다. \n"+e.getMessage());
            //TODO: handle exception
        } 
    } 
}
