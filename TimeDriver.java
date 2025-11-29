import java.util.Scanner;

class Time {
    int h;
    int m;
    int s;

    Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    void displayTime() {
        System.out.printf(h+":"+m+":"+s+"\n");
    }

    Time addTime(Time t2) {
        int tts = this.s + t2.s;
        int ttm = this.m + t2.m + tts / 60;
        int tth = this.h + t2.h + ttm / 60;
        int sec = tts % 60;
        int min = ttm % 60;
        int hr = tth % 24;
        return new Time(hr, min, sec);
    }
}

public class TimeDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first time:");
        System.out.print("hours: ");
        int h1 = sc.nextInt();
        System.out.print("minutes: ");
        int m1 = sc.nextInt();
        System.out.print("seconds: ");
        int s1 = sc.nextInt();
        System.out.println("Enter second time:");
        System.out.print("hours: ");
        int h2 = sc.nextInt();
        System.out.print("minutes: ");
        int m2 = sc.nextInt();
        System.out.print("seconds: ");
        int s2 = sc.nextInt();
        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);
        System.out.print("First Time: ");
        t1.displayTime();
        System.out.print("Second Time: ");
        t2.displayTime();
        Time sum = t1.addTime(t2);
        System.out.print("Sum of Times: ");
        sum.displayTime();
    }
}
