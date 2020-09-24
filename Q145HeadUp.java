//HeadMountedDisplay.java
package JC.Chapter14.Q145HeadUp;

public class HeadMountedDisplay implements Wearable, Skinnable {

    private int skin;

	@Override
    public void changeSkin(int skin) {
        // TODO Auto-generated method stub
        this.setSkin(skin);
    }

    public int getSkin() {
        return skin;
    }

    public void setSkin(int skin) {
        this.skin = skin;
    }

    @Override
    public void putOn() {
        // TODO Auto-generated method stub
        System.out.println("디스플레이를 착용했습니다.");

    }

    @Override
    public void putOff() {
        // TODO Auto-generated method stub
        System.out.println("디스플레이를 벗었습니다.");

    }
    public void putSkin() {
        //상수화된 인터페이스 변수
        switch (skin) {
            case BLACK: System.out.println("BLACK DISPLAY");break;
            case RED: System.out.println("RED DISPLAY");break;
            case GREEN: System.out.println("GREEN DISPLAY");break;
            case BLUE: System.out.println("BLUE DISPLAY");break;
            case YELLOW: System.out.println("YELLOW DISPLAY");break;
        }
    }
}

//Skinnable.java
package JC.Chapter14.Q145HeadUp;

public interface Skinnable {
    int BLACK = 0;
    int RED = 1;
    int GREEN = 2;
    int BLUE = 3;
    int YELLOW = 4;
    void changeSkin(int skin);
    
}

//Wearable.java
package JC.Chapter14.Q145HeadUp;

 public interface Wearable {
    void putOn();
    void putOff();
}

//Main.java

package JC.Chapter14.Q145HeadUp;

public class Main {
    public static void main(String[] args) {
        
        HeadMountedDisplay hmd = new HeadMountedDisplay();
        hmd.putOn();
        hmd.putOff();
        hmd.changeSkin(Skinnable.BLACK);
        hmd.putSkin();

        
        Wearable w = hmd;
        w.putOn();
        w.putOff();

        Skinnable s = hmd;
        s.changeSkin(Skinnable.BLACK);
        hmd.putSkin();

        // hmd.putOn();
        // hmd.putOff();
        // hmd.changeSkin(Skinnable.BLACK);
        // hmd.putSkin();
    }
}
