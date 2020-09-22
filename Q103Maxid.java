package JC.Chapter10;

public class Maxid {
    
    private static int counter = 0;
    private int id;

    public Id(){

        id = ++counter;
    } 

    public int getId(){
        return id;
    }

    public static int getMaxId(){   //특정 인스턴스에 소속되지 않는다.
        return counter;
    }

    //인스턴스 메서드는 개별 인스턴스에 소속된다.
    //자원 소속된 인스턴스의 변수, 메서드 외 
    //모두가 공유하는 변수, 메서드 양쪽에 접근 할 수 있다.
    //클래스 매서드는 인스턴스에 속하지 않기 때문에 자신이 소속된 인스턴스의 변수, 
    //메서드를 가지지 않는다. 따라서 모두가 공유하는 변수, 메서드만 접근할 수 있다.
    //예를 들어, 클래스 메서드 getMaxId 안에서는 인스턴스 변수 Id접근 할 수 없다 .어떤 인스턴스의 
    //Id에 접근해야 할지를 결정할 수 없기 때문이다. 
    //예외 : 자신이 속한 클래스형의 인스턴스 참조를 매게 변수 r로 받아서 
    //id형식으로 인스턴스 변수에 접근 할 수 있다. 
}
