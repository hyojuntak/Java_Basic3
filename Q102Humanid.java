package JC.Chapter10;
import JC.Chapter9.Day;

public class Humanid {

    public static int counter = 0;  //마지막 몇번, 고정 (변하지 않는값)
    private String name;
    private int weight;
    private int height;
    private int id;

    public Human() {}

    public Human(String name,int weight,int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
        id = ++counter;

    }
    public Human(int id){
        this.id = id;
    }

    public String getname(){return name;}
    public int getweight(){return weight;}
    public int getheight(){return height;}
    //public int getid(){return id;}

    public int getid(){return id;}
    
    public void putData(){
        System.out.println("이름 : "+name);
        System.out.println("신장 : "+weight+"cm");
        System.out.println("체중 : "+height+"kg");

    }
 }
