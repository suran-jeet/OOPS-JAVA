import java.util.Scanner;

class Employee{
    int empid;
    String ename;
    String dept;
    int sal;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id no:");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee name:");
        ename = sc.nextLine();
        System.out.println("Enter Department name:");
        dept = sc.nextLine();
        System.out.println("Enter Salary:");
        sal = sc.nextInt();
    }

    void putData(){
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + ename);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + sal);
        System.out.println("-----------------------------");
    }
}
public class EmpDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no. of employee:");
        int n = sc.nextInt();
        Employee[] e = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1) + ":");
            e[i] = new Employee();
            e[i].getData();
        }

        System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < n; i++) {
            e[i].putData();
        }
    }
}
