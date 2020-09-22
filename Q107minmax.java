package JC.Chapter10;

import java.util.Scanner;

public class Q107Minmax {
    
    public static int max(int a, int b){
        return a>b ? a : b;
    }

    public static int min(int a, int b){
    
        return a<b ? a : b;
    }

    public static int maxx(int a, int b, int c){
        int max = a; 
        if(b>max) max = b;
        if(c>max) max = c;

        return max;
    }

    public static int minn(int a, int b, int c){

        int min = a;
        if(b<min) min =  a;
        if(c<min) min =  c;

        return min;
    }

    public static int minIndexArray(int[] a) {
        int min = a[0];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int maxIndexArray(int [] a){
        int max = a[0];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    public static int [] maxindex(int maxarray, int [] a){
        
        int [] acopy = new int [a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==maxarray){
                acopy[count] = i;
                count++;
            }
        }
        int [] areal = new int [count];
        for (int i = 0; i < count; i++) {
            areal[i] = acopy[i];
        }
        return areal;
        
    }

    public static int [] minindex(int minarray,int [] a){
        int [] bcopy = new int [a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==minarray){
                bcopy[count] = i;
                count++;
            }
        }
        int [] breal = new int [count];
        for (int i = 0; i < count; i++) {
            breal[i] = bcopy[i];
        }
        

        return breal;
        
    }
}



//main

package JC.Chapter10;


import java.util.Scanner;
//하나의 패키지 안에 동일 명의 패키지와 클래스가 존재해서는 안된다.
//패키지 명의 첫 글자는 소문자를 사용한다.(원칙)
//date패키지 안에서 date 패키지와 Date클래스를 넣는 것은 가능하다.

public class main {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
  
        System.out.printf("x,y의 최솟값은 %d입니다.\n",Q107Minmax.min(e, b));
        System.out.printf("x,y의 최대값은 %d입니다.\n",Q107Minmax.max(e, b));

        System.out.printf("x,y,z의 최솟값은 %d입니다.\n",Q107Minmax.minn(e,b,c));
        System.out.printf("x,y,z의 최댓값은 %d입니다.\n",Q107Minmax.maxx(e,b,c));

        System.out.printf("배열 a의 최솟값은 %d입니다.\n",Q107Minmax.minIndexArray(a));
        int minarray = Q107Minmax.minIndexArray(a);
         //최솟값
         System.out.println("인덱스는"+Arrays.toString(Q107Minmax.minindex(minarray, a))+"입니다.");     
        System.out.printf("배열 a의 최댓값은 %d입니다.\n",Q107Minmax.maxIndexArray(a));
        //최댓값
        int maxarray = Q107Minmax.maxIndexArray(a);
        System.out.print("인덱스는"+Arrays.toString(Q107Minmax.maxindex(maxarray, a))+"입니다.");

   }
}
