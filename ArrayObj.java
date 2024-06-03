import java.util.*;
class Student{
    int id;
    String name;
    Student (int id,String name ){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class ArrayObj{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] s=new Student[2];
        for(int i=0;i<s.length;i++){
            System.out.println("Enter id");
            int id1=sc.nextInt();
            System.out.println("enter first name");
            String name1=sc.next();
            s[i]=new Student(id1, name1);
        }
        for(int i=0;i<s.length;i++){
            s[i].display();
        }

        // System.out.println("enter first id");
        // int id1=sc.nextInt();
        // System.out.println("enter first name");
        // String name1=sc.next();
        // System.out.println("enter second id");
        // int id2=sc.nextInt();
        // System.out.println("enter second name");
        // String name2=sc.next();
        // Student s1=new Student(id1, name1);
        // Student s2=new Student(id2, name2);


        // Student s1= new Student(1,"Saumya");
        // Student s2=new Student(2, "Sharma");
        // s1.display();
        // s2.display();
        sc.close();
    }
}