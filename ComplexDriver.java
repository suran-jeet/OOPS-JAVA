import java.util.Scanner;

class Complex {
    double r;
    double i;

    void initialise() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r part: ");
        r = sc.nextDouble();
        System.out.print("Enter iinary part: ");
        i = sc.nextDouble();
    }

    void show() {
        System.out.println(r + " + " + i + "i");
    }

    Complex add(Complex c2) {
        Complex temp = new Complex();
        temp.r = this.r + c2.r;
        temp.i = this.i + c2.i;
        return temp;
    }
}

public class ComplexDriver {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();

        System.out.println("Enter first complex number:");
        c1.initialise();

        System.out.println("Enter second complex number:");
        c2.initialise();

        System.out.print("First Complex Number: ");
        c1.show();

        System.out.print("Second Complex Number: ");
        c2.show();

        Complex sum = c1.add(c2);

        System.out.print("Sum of Complex Numbers: ");
        sum.show();
    }
}
