package outputTracing;

public class C5 {
    public static void main(String[] args) {

        boolean j = !(true && false) ^ (false || true) && true;
        System.out.println("j = " + j);


        int k = 1;
        k = k++ + k++ + ++k;
        System.out.println("k = " + k);


        int l = (20 >> 2) + (15 << 1);
        System.out.println("l = " + l);


        boolean m = (5 >= 5) && (3 <= 4) || !(7 == 7);
        System.out.println("m = " + m);


        int n = 8;
        n = n-- >>> 1 + ++n >> 1;
        System.out.println("n = " + n);


        int o = (15 & 22) | (14 ^ 25);
        System.out.println("o = " + o);
    }
}

/*
OUTPUT

j = false
k = 7
l = 35
m = true
n = 0
o = 23

 */