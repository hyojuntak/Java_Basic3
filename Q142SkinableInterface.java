//SkinableSoftware.java
package JC.Chapter14.Q142SkinnableInterface;

public class SkinableSoftware implements Skinnable{

    int skin;

    public SkinableSoftware() {
        this.skin = BLACK;
    }
    public SkinableSoftware(int skin){
        this.skin = skin;
    }

    @Override
    public void changeSkin(int skin) {
        this.skin = skin;
        // TODO Auto-generated method stub

    }

    public int getSkin(){return skin;}

    
    public String getSkinString(){

        switch (skin) {
            case 0: return "BLACK";
            case 1: return "RED";
            case 2: return "GREEN";
            case 3: return "BLUE";
            case 4: return "YELLOW";
                
                
        
            default:
                break;
        }
        return "";
    }
}


//Skinnable.java
package JC.Chapter14.Q142SkinnableInterface;

public interface Skinnable {
    int BLACK = 0;
    int RED = 1;
    int GREEN = 2;
    int BLUE = 3;
    int YELLOW = 4;
    void changeSkin(int skin);
    
}
//Main.java
package JC.Chapter14.Q142SkinnableInterface;

public class Main {
    public static void main(String[] args) {
        SkinableSoftware x = new SkinableSoftware();
        SkinableSoftware y = new SkinableSoftware(Skinnable.GREEN);

        x.changeSkin(Skinnable.YELLOW);

        System.out.println("x의 스킨은"+x.getSkinString()+"입니다.");
        System.out.println("y의 스킨은"+y.getSkinString()+"입니다.");

    }
}

