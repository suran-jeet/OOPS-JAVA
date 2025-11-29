import java.util.Scanner;

class Area {
    double l;
    double b;

    void setDim(double l, double b) {
        this.l = l;
        this.b = b;
    }

    double getArea() {
        return this.l * this.b;
    }
}

public class AreaDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        a.setDim(l, b);
        System.out.println("Area of Rectangle: " + a.getArea());
    }
} 