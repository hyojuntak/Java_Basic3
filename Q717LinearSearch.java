package JC.Chapter7;

import java.util.Scanner;

public class Q718aryrmv {

    
    public void aryRmv(int[] a, int idx) {
        int trash = 0; 
        for (int i = idx+1; i < a.length; i++) {
            
            trash = a[i];
            a[i] = a[i-1];
            a[i-1] = trash; 

            
        }
        a[a.length-1] = a[a.length-2];
        
        for (int k = 0; k < a.length; k++) {
            System.out.printf("a[%d] = ", k);System.out.print(a[k]);System.out.println();
        }



    }




    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수 : ");int n = sc.nextInt();
        int [] a= new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]:",(i)); int e = sc.nextInt();
            a[i] = e;
        }

        System.out.print("삭제할 요소의 인덱스:");int idx = sc.nextInt();

        Q718aryrmv rmv = new Q718aryrmv();
        rmv.aryRmv(a, idx);


    }
}
