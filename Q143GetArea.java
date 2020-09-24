//Parallels.java
package JC.Chapter14.Q143GetArea;

public class Parallels extends Shape implements Plane2D {
    private int width;
    private int height;

    public Parallels(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public int getArea() {
        // TODO Auto-generated method stub
        return width * height;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        
        return "Parallels(width:"+width+", height :"+height+")";
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= height; j++) 
                System.out.print(" ");
                for (int j2 = 0; j2 <=width; j2++) 
                    System.out.print("#");
                System.out.println();     
        }
    }
}

//Plane2D.java
package JC.Chapter14.Q143GetArea;

public interface Plane2D {
    int getArea();
    
}


//Rectangle.java
package JC.Chapter14.Q143GetArea;

public class Rectangle extends Shape implements Plane2D {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public String toString(){
        return "Rectangle(width"+width+".height:"+height+")";
    }
    
    @Override
    public void draw(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) 
                System.out.print("*");
                System.out.println();
            
        }
    }

    @Override
    public int getArea() {return width * height;}
    
}

//Shape.java
package JC.Chapter14.Q143GetArea;
/**
 * Shape 클래스는 도형의 개념을 나타내기 위한 추상클래스이다.
 * 추상 클래스이므로 이 클래스의 인스턴스는 생성할 수 없다. 
 * 구체적인 도형 클래스는 이 클래스로부터 파생된다.
 * 
 * @author 홍길동
 * @see Object 
 */
    public abstract class Shape {

    public abstract String toString();

    public abstract void draw();

    public void print(){
        System.out.println(toString());
    }
}


//Main.java
package JC.Chapter14.Q143GetArea;

public class Main {
    public static void main(String[] args) {

        Plane2D [] a = {new Rectangle(2, 5),new Parallels(2, 5)};

        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"]의 면적="+a[i].getArea());
        }
    }
}

