package outputTracing;

public class C6 {
    public static void main(String[] args) {

        boolean q = 5 > 3 == false != true;
        System.out.println("q = " + q);


        int r = (-64 >>> 3) + (32 >> 2);
        System.out.println("r = " + r);

/*
64
-64     11111111 11111111 11111111 11111111
        00011111 11111111 11111111 11111000

 */
        int s = 5;
        s = ++s + s++ + s-- + --s;
        System.out.println("s = " + s);


        int t = ~25 & 15;
        System.out.println("t = " + t);
    }
}
/*
OUTPUT

q = true
r = 536870912
s = 24
t = 6

 */