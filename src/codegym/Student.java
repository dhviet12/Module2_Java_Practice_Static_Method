package codegym;

public class Student {
    private int number;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n){
        number = r;
        name = n;
    }
    static void change(){
        college ="CODEGYM";
    }
    void display(){
        System.out.println(number + " "+ name+ " "+ college);
    }
}
