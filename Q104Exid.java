package JC.Chapter10;

public class Exid {
    static int counter = 0;
    private static int step = 1;
    private int id;

    //생성자
    public Exid(){
        id = counter+=step;
        System.out.println("첫번쨰");

    }
    public int getid(){
        return id;
    }

    public static int getStep(){
        return step;
    }
    public static int setStep(int x){
        System.out.println("두번쨰");    
        step = (x>=1)?x:1;
        return step;
    }
    public static int getMaxid(){
        return counter;
    }
}
