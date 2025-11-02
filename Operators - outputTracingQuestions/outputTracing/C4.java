package outputTracing;

public class C4 {
    public static void main(String[] args) {
        int d = 15 & 27;
        System.out.println("d = " + d);

        int e = 64 >> 3 << 2;
        System.out.println("e = " + e);

        boolean f = !(5 > 3 && 2 < 4) || (8 > 5 && 4 <= 6);
        System.out.println("f = " + f);

        int g = 100;
        g = g-- - --g + ++g;
        System.out.println("g = " + g);

        int h = 10 ^ 5 ^ 10;
        System.out.println("h = " + h);

    }
}
/*
OUTPUT

d = 11
e = 32
f = true
g = 101
h = 5

*/