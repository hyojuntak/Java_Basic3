package JC.Chapter9;

public class Human {
    private String name;            //접근제어자(동일 클래스 내의 메소드만 접근가능)
    private int weight;
    private int height;
    private Day birthday;

    public Human(String name, int height, int weight, Day birthday) {
	
    this.name = name;                       //다른 메소드에서 접근할때 간접접근방식으로 이 생성자를 이용함 
    this.height = height;                     //생성자의 이름 = 클래스의 이름                                               
    this.weight = weight;                       //반환형이 없다
    this.birthday = new Day(birthday);
    }

    public String getname(){return name;}
    public int getheight(){return height;}
    public int getweight(){return weight;}
    public Day getbirthday(){return new Day(birthday);}

    public void gainweight(int w) {
        weight += w;
    }
    
    public void reduceweight(int w) {
        weight -= w;
    }

    public String toString(){
        return "{"+name+":"+height+"cm"+weight+"kg"+birthday+"출생}";
    }
}
