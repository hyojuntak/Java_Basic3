package JC.Chapter15;

/**
 * Q151Ascii
 */
public class Q151Ascii {

    public static void main(String[] args) {
        
        for (char i = 0x21; i <= 0x7e; i++) {
            System.out.printf("%c %04x\n",i,(int)i);
        }
    }
    
}

