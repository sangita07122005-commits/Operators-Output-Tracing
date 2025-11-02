package outputTracing;

public class C3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = c - --c + a++ % b++;
        a = --a * a++;
        b = -b + ++c * d++ % ++a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}

/*
OUTPUT

a = 2
b = -3
c = 3
d = 3
*/