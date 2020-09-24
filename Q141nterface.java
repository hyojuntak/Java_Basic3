//Headphone.java
package JC.Chapter14.Q141Interface;

public class Headphone implements Wearable {

    private int volume;

    public void setvolume(int volume) {
        this.setVolume(volume);
        System.out.println("볼륨을 " + volume + "로 변경했습니다.");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void putOn() {
        // TODO Auto-generated method stub
        System.out.println("헤드폰을 착용했습니다.");

    }

    @Override
    public void putOff() {
        // TODO Auto-generated method stub
        System.out.println("헤드폰을 벗었습니다.");


    }

    
}

//Wearable.java
package JC.Chapter14.Q141Interface;

 public interface Wearable {
    void putOn();
    void putOff();
}

//WearableComputer.java
package JC.Chapter14.Q141Interface;

public class WearableComputer implements Wearable{

    public void reset() {
        System.out.println("컴퓨터를 재시작했습니다.");
    }

    @Override
    public void putOn() {
        // TODO Auto-generated method stub
        System.out.println("컴퓨터를 실행했습니다.");


    }

    @Override
    public void putOff() {
        // TODO Auto-generated method stub
        System.out.println("컴퓨터를 껐습니다.");


    }

}

//Main.java

package JC.Chapter14.Q141Interface;

public class Main {
    public static void main(String[] args) {
        
        Wearable [] a = new Wearable[2];
        
        a[0] = new Headphone();
        a[1] = new WearableComputer();

        for (int i = 0; i < a.length; i++) {
            a[i].putOn();
        }
        for (int i = 0; i < a.length; i++) {
            a[i].putOff();
        }
    }
}
