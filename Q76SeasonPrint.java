package JC.Chapter7;

import java.util.Scanner;

public class Q76printseason {
    
    public void printSeason(int m){
      switch(m){
          case 3 : case 4: case 5 : System.out.print("봄"); break;
          case 6 : case 7: case 8 : System.out.print("여름"); break;
          case 9 : case 10: case 11 : System.out.print("가을"); break;
          case 12 : case 1: case 2 : System.out.print("겨울"); break;

      }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 월입니까(1~12):");int m = sc.nextInt();

        Q76printseason sea = new Q76printseason();
        sea.printSeason(m);
        
    }
}
