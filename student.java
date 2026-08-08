import java.util.*;
public class Student{
     String name,
     int age,
     Double gpa;

    public Student(String name, int age, Double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        Double gpa = sc.nextDouble();
        Student s = new Student(name, age, gpa);
        s.display();
    }