package JC.Chapter8;

public class Car {
    private String name;
    private String number;
    private int heigh;
    private int width;
    private int length;

    private double x;
    private double y;
    private double tankage;
    private double fuel;
    private double sfc;

    Car(String name,String number, int heigh, int width, int length, double x, double y, double tankage, double fuel, double sfc){
        this.name = name;
        this.number = number;
        this.heigh = heigh;
        this.width = width;
        this.length = length;
        this.x = x;
        this.y = y;
        this.tankage =tankage;
        this.fuel = (fuel <=tankage) ? fuel : tankage;
        this.sfc = sfc;
        x = y = 0.0;

    }

    double getx(){return x;}
    double gety(){return y;}
    double getfuel(){return fuel;}

    void putSpec(){
        System.out.println("이름 : "+name);
        System.out.println("번호 : "+number);
        System.out.println("전폭 : "+width);
        System.out.println("전고 : "+heigh);
        System.out.println("전장 : "+length);
        System.out.println("탱크 : "+tankage);
        System.out.println("연비 : "+fuel);
        

    }
    //이동 x방향, y방향

    boolean move(double dx, double dy){
        double dist = Math.sqrt(dx*dx + dy*dy);
        double f = dist / sfc;
        

        if (f>fuel) 
            return false;
        else{
            fuel -= f;
            x += dx;
            y += dy;
            return true;
        }
    }


    //급유 
    void refuel(double df){
        if (df>0){
            fuel +=df;
            if(fuel>tankage)
                fuel = tankage;
            
        }
    }
}
