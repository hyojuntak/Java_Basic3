//Member.java

package JC.Exam.Exam9;

public class Member {
    private String name;
    private int no;
    private int age;

    public Member(String name, int no, int age) {
        this.name = name;
        this.age = age;
        this.no = no;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void print() {
        System.out.println("No."+no+":"+name+"("+age+"세)");
    }



}




//SpecialMember.java


package JC.Exam.Exam9;

public class SpecialMember extends Member{
   
    private String privilage;
    
    public SpecialMember(String name, int no, int age, String privilage) {
        super(name, no, age);
        this.privilage = privilage;
        // TODO Auto-generated constructor stub
    }
   
    @Override 
    public void print() {
        super.print();
        System.out.println("혜택:"+privilage);
    }

    
}




//Main.java

package JC.Exam.Exam9;

public class Main {
    public static void main(String[] args) {
        Member [] m = { 
            new Member("길동",101,27), 
            new SpecialMember("철수",102,31,"회비 무료"),
            new SpecialMember("영희",103,52,"회비 반값 할인"),
        };

        for (Member k:m) {
            k.print();
            System.out.println();

        }
    }
}


