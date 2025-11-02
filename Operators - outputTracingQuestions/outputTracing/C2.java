package outputTracing;

public class C2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int c = 4;
        int d = 3;
        int e = c - d % a + a++ / --d + ++b;
        c = c++ + --d + a-- % 5;
        b = e++ - c++ * a++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

    }
}

/*
OUTPUT

a = 11
b = -45
c = 7
d = 1
e = 16
*/