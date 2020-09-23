//Animal.java
package JC.Chapter13.Q132AnimalNew;

abstract class Animal {
    
    private String name;
    public Animal(String name) {this.name = name;}
    public abstract void bark();
    public String getName(){return name;}
    public abstract String toString();
    public void introduce(){
        System.out.print(toString()+"이다.");
        bark();
    }
}

//Cat.java
package JC.Chapter13.Q132AnimalNew;

public class Cat extends Animal{
    private int age;

    public Cat(String name, int age) {
        super(name);this.age = age;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void bark() {
        System.out.println("야옹");
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return age + "의" + getName();
    }
    
}

//Dog.java

package JC.Chapter13.Q132AnimalNew;

public class Dog extends Animal{
    private String type;

    public Dog(String name, String type) {
        super(name);this.type = type;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void bark() {
        System.out.println("멍멍");
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return type + "의" + getName();
    }
    
}


//Main.java

package JC.Chapter13.Q132AnimalNew;

public class Main {
    public static void main(String[] args) {
        Animal [] a = new Animal[2];
        a[0] = new Dog("뭉치","치와와");
        a[1] = new Cat("마이클",7);

        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] = "+a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"] = ");
            a[i].introduce();
        }
    }
}
