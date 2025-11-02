package outputTracing;

public class C1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 14;
        int c = a++ + ++b;
        a = --a - a-- - ++b + b++;
        b += ++a;
        c = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

/*
OUTPUT
a = 1
b = 18
c = -17
*/