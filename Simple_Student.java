import java.util.Scanner;
class Student {
    
    String usn;
    String name;

     void accept(String studentUsn, String studentName) {
        this. usn = studentUsn;
        this.name = studentName;
    }

     void display() {
        System.out.println("USN: " + usn + ", Name: " + name);
    }
}


public class Simple_Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Student s1 = new Student();
        System.out.println("enter name:");
        s1.name =sc.nextLine();
        System.out.println("enter usn:");
        s1.usn =sc.nextLine();

        s1.accept(s1.usn,s1.name);

        Student s2 = new Student();
        s2.accept("456", "Bob");

        System.out.println("--- Student Details ---");
        s1.display();
        s2.display();
    }
}