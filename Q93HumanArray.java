package JC.Chapter8;

import JC.Chapter9.Day;

public class Human {
    private String name;            //접근제어자(동일 클래스 내의 메소드만 접근가능)
    private int weight;
    private int height;

    public Human(String n, int h, int w, Day day) {
	
    name = n;                       //다른 메소드에서 접근할때 간접접근방식으로 이 생성자를 이용함 
    height = h;                     //생성자의 이름 = 클래스의 이름 
    weight = w;                     //반환형이 없다
    }

    public String getname(){return name;}
    public int getheight(){return height;}
    public int getweight(){return weight;}

    void gainweight(int w) {
        weight += w;
    }
    
    void reduceweight(int w) {
        weight -= w;
    }
    
}
