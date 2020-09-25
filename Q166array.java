package JC.Chapter16;

import java.util.Scanner;


public class Q166array {

    static void bug(int[] aaray) {
        try {
            System.out.println(aaray[5]);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            //TODO: handle exception
        }
    }
    static void reverse(int[] aaray) {
    try {
        for (int i = 0; i < aaray.length; i++) {
            swap(aaray, i, aaray.length-i);
        }
    } catch (NullPointerException e) {
        e.printStackTrace();
        System.exit(1);
        //TODO: handle exception
    }catch (ArrayIndexOutOfBoundsException e){
        throw new RuntimeException("reverse의 버그?",e);
    }
        
    }

    
    static void swap(int[] aaray, int idx1, int idx2) {
        int t = aaray[idx1]; //0
        aaray[idx1] = aaray[idx2];
        aaray[idx2] = t;
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수 : ");int a = sc.nextInt();
        int [] aaray = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("x["+i+"]:");int b = sc.nextInt();
            aaray[i]=b;
        }


        System.out.println();
        try {
            reverse(aaray);

            System.out.println("요소를 반대로 나열했습니다.");
            for (int i = 0; i < aaray.length; i++) {
                System.out.println("x["+i+"]="+aaray[i]);
            }    
        } catch (RuntimeException e) {
            //TODO: handle exception
            System.out.println("예외 :     "+e);
            System.out.println("예외의 원인 : "+e.getCause());
        }
    }
}
