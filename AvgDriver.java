import java.util.Scanner;
class Average{
    double cal(double a, double b, double c){
        return (a+b+c)/3;
    }
    void res(double avg){
        System.out.println("Average of three number="+avg);
    }
}
public class AvgDriver{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integer nubmers :");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        Average av = new Average();
        double r = av.cal(a,b,c);
        av.res(r);
        sc.close();
    }
}