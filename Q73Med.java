package JC.Chapter7;

import java.util.Scanner;

public class Q73center {
    
    public int med(int a, int b, int c) {
        int center=0;
        int j = 0;
        while(j<6){
            if ((b<a && a<c) || (c<a && a<b)){
                center = a;
                return center;
            }
            else if((a<b && b<c) || (c<b && b<a)){
                center = b;
                return center;
            }
            else if((a<c && c<b)||(b<c && c<a)){
                center = c;
                return center;

            }
        j++;
        }
        return center;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(("정수 a:"));int a = sc.nextInt();
        System.out.print(("정수 b:"));int b = sc.nextInt();
        System.out.print(("정수 c:"));int c = sc.nextInt();

        Q73center cen = new Q73center();
        int result = cen.med(a, b, c);
        System.out.print("중간값은 "+result+"입니다.");

    }
}
