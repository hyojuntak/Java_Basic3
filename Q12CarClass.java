//Car.java


package JC.Chapter12.Q121CarClass;

public class Car {
    private String name;//이름
    private int heigh;//폭
    private int width;//높이
    private int length;//길이

    private double x;//현재 위치 x
    private double y;//현재 위치 y
    private double fuel;//현재 연료
    private String purchaseDay;//구입일(글자로 처리)


    //생성자
    public Car(String name, int width, int heigh, int length, double fuel, String purchaseDay) {
        this.name = name;
        this.width = width;
        this.heigh =heigh;
        this.length =length;
        this.fuel = fuel;
        this.purchaseDay = purchaseDay;
        x=y=0.0;

    }
    public double getX(){return x;}
    public double getY(){return y;}
    public double getFuel(){return fuel;}
    public String getPurchaseDay(){return purchaseDay;}
    public String getName(){return name;}

    //메소드
    public void putSpec(){

        System.out.println("이름 : "+name);
        System.out.println("전폭 : "+width+"mm");
        System.out.println("전고 : "+heigh+"mm");
        System.out.println("전장 : "+length+"mm");

    }

    //이동 x방향,y방향

    public boolean move(double dx, double dy) {
        
        double dist = Math.sqrt(dx*dx+dy*dy);
        
        if (dist>fuel) {
            return false;
        }else{
            fuel -= dist;
            x +=dx;
            y +=dy;
            return false;
        }
    }
}







//ExCar.java


package JC.Chapter12.Q121CarClass;

public class ExCar extends Car{
    //Car class : 부모, 상위, 기본, 슈퍼 
    //ExCar Class : 자식, 하위 ,파생 ,서브 
    private double totalMilage;
    public ExCar(String name, int width, int heigh, int length, double fuel, String purchaseDay) {
        super(name, width, heigh, length, fuel, purchaseDay);
        totalMilage = 0.0;
    }    
    public double getTotalMileage(){
        return totalMilage;
    }
    
    public void putSpec(){  //putspec putspac
        super.putSpec();
        System.out.printf("총 주행 거리 : %.2fkm\n",totalMilage);
    }

    public boolean move(double dx, double dy) {
        
        double dist = Math.sqrt(dx*dx+dy*dy);
        
        if (!super.move(dx, dy)) {
            return false;
        }else{
            totalMilage += dist;
            return true;
        }
    }
}







//Main.java


package JC.Chapter12.Q121CarClass;

public class Main {
    public static void main(String[] args) {

        //Q122
        // ExCar myCar = new ExCar("w221",185,1490,505,90.0,"2015,12,24");
        // System.err.printf("이   름 : %s\n",myCar.getName());
        // System.out.printf("현재위치 : (%.2f,%.2f)\n" ,myCar.getX(),myCar.getY());
        // System.out.printf("남은연료 : %.2f리터\n" ,myCar.getFuel());
        // System.out.printf("구 입 일 : %s\n" ,myCar.getPurchaseDay());


        //Q123
        // ExCar mycar = new ExCar("w221",185,1490,505,90.0,"2015,12,24");
        // mycar.putSpec();


        //Q124

        // Car car1 = new Car("w140",1885,1490,5220,95.0,"2018,10,13");
        // ExCar car2 = new ExCar("w221",1845,1490,5205,90.0,"2015,12,24");

        // Car x;//클래스형 변수
        // // x = car1;   //자기자신의 형 인스턴스를 참조할 수 있다.
        // // x = car2;   //하위 클래스형의 인스턴스도 참조할 수 있다.

        // ExCar y;    //클래스형 변수
        // //y = car1; //상위 클래스 형의 인스턴스는 참조할 수 없다. !
        // y = car2;   //자기자신의 형 인스턴스는 참조할 수 있다.

        // System.out.println("y구입일 :"+y.getPurchaseDay());
        // System.out.println("y의 총 주행거리 :"+y.getTotalMileage());

        
        //Q125
        // Car car1 = new ExCar("w221",1845,1490,5205,90.0,"2015,12,24");
        // car1.putSpec();
        
        //Q126
        Car car1 = new ExCar("w221",1845,1490,5205,90.0,"2015,12,24");
        car1.move(10, 10);
        //System.out.println("총 주행 거리 : "+car1.getTotalMileage());
        System.out.println("총 주행 거리 : "+((ExCar)car1).getTotalMileage());

    }
}

