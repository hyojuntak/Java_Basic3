//Animal.java


package JC.Chapter13.Q131Animal;

abstract class Animal {
    private String name;
    public Animal(String name){this.name = name;}
    public abstract void bark();
    public String getName(){return name;}

}

//Cat.java
package JC.Chapter13.Q131Animal;

public class Cat extends Animal {
    private int age;    //고양이의 나이

    //생성자
    public Cat(String name,int age) {
        super(name); this.age = age;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void bark() {
        // TODO Auto-generated method stub
        System.out.println("야옹");
    }
    
}


//Dog.java
package JC.Chapter13.Q131Animal;

public class Dog extends Animal {
    private String type;    //개의 종류

    //생성자
    public Dog(String name,String type) {
        super(name); this.type = type;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void bark() {
        // TODO Auto-generated method stub
        System.out.println("멍멍");
    }
    
    
}

//Main.java
package JC.Chapter13.Q131Animal;
import JC.Chapter13.Q131Animal.Animal;

public class Main {
    public static void main(String[] args) {
        //추상 클래스는 인스턴스를 생성할 수 없다.
        //Q131Animal x = new Q131Animal();

        Animal [] a = new Animal[2];

        a[0]= new Dog("뭉치","치와와");//클래스 Dog참조
        a[1] = new Cat("마이클",7);//클래스

        // for (Q131Animal s : a){
        //     System.out.println(s.getName()+" ");
        //     s.bark();
        //     System.out.println();
        // }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].getName()+" ");
            a[i].bark();
            System.out.println();
            
        }
    }
}
