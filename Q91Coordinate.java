package JC.Chapter9;

public class Coordinate {
    
    private double x=0.0;
    private double y=0.0;

    //생성자
    //public : 다른 패키지 내에 있어도 접근 가능
    //private : 다른 패키지 내에 잇으면 접근 불가능 

    
    public Coordinate(){}
    public Coordinate(double x, double y){set(x,y);}
    public Coordinate(Coordinate c) {
        this(c.x, c.y);
    }


    public double getx(){return x;}
    public double gety(){return y;}


    //좌표 설정 메소드 
    public void setx(double x){this.x = x;}
    public void sety(double y){this.y = y;}


    public void set(double x, double y){this.x = x; this.y = y;}
}
