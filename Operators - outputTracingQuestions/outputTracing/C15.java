package outputTracing;

public class C15 {
    public static void main(String[] args) {
        int x = 15;
        int y = 8;
        int z = 12;
        int w = 5;
        int a = 20;
        int b = 7;
        int c = 10;
        int d = 4;

        int result = (x++ * (y << 2)) / (--z + (w >> 1));
        int value = ((x & y) << 2) + ((z | w) >> 1);
        int output = ((x ^ y) > (a >> 2)) ? (a++ * b--) : (++c / --d);
        boolean check = (((x + y) * (z - w)) >= ((a / b) * (c % d)));

        System.out.println("result = " + result);
        System.out.println("value = " + value);
        System.out.println("output = " + output);
        System.out.println("check = " + check);
    }
}

/*
OUTPUT

result = 36
value = 7
output = 140
check = true

* */

