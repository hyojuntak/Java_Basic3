package JC.Chapter7;

import java.util.Scanner;

public class Q77putchar {
    
    public int putChar(int c) {
       int star = c;
       return star;
    } 
    
    public void putStart(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*"); 
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는?:");int c = sc.nextInt();

        Q77putchar st = new Q77putchar();
        int n = st.putChar(c);
        
        st.putStart(n);
        

        }
    }

