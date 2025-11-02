package outputTracing;

public class C12 {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = 1;
        int d = 6;
        a = (b += c) * (d -= a) / (b *= c);
        b = (c |= d) & (a ^= b) << (c >>= 2);
        c = (a *= b) + (c &= d) - (a |= b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}

/*
OUTPUT

a = 22
b = 2
c = -2
d = 2
*/