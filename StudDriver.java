import java.util.Scanner;
class Student{
    String name;
    int roll;
    String branch;

    void details(String n, int r, String b){
        this.name=n;
        this.roll=r;
        this.branch=b;
    }

    void display(){
        System.out.println("Name="+name);
        System.out.println("Roll No="+roll);
        System.out.println("Branch="+branch);
    }
}

public class StudDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name,Roll No and Branch:");
        String n = sc.nextLine();
        int r = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        Student s = new Student();
        s.details(n,r,b);
        s.display();
        sc.close();
    }
}
