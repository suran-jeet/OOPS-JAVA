class Box{
    double w;
    double h;
    double d;

    Box(double width, double h, double d){
        this.w= width;
        this.h = h;
        this.d = d;
    }

    double volume(){
        return this.w* this.h * this.d;
    }
}

public class BoxDriver{
    public static void main(String[] args) {
        Box b1 = new Box(5.5,4.2,3.0);
        System.out.println("Volume of Box: " + b1.volume());
    }
}
