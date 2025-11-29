import java.util.Scanner;

class Stud {
    int regNo;
    String stdName;
    String branch;
    double CGPA;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Registration Number: ");
        regNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        stdName = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();
        System.out.print("Enter CGPA: ");
        CGPA = sc.nextDouble();
    }

    void putData() {
        System.out.println("Reg No: " + regNo);
        System.out.println("Name: " + stdName);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + CGPA);
        System.out.println("----------------------------");
    }
}

public class StudDetDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stud[] s = new Stud[50];

        System.out.print("Enter number of Students (up to 50): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1) + ":");
            s[i] = new Stud();
            s[i].getData();
        }

        double maxCGPA = s[0].CGPA;
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (s[i].CGPA > maxCGPA) {
                maxCGPA = s[i].CGPA;
                index = i;
            }
        }

        System.out.println("\n--- Student with Highest CGPA ---");
        s[index].putData();
    }
}
