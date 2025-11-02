package outputTracing;

public class C16 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int c = 9;
        int d = 2;
        int x = 5;
        int y = 3;
        int z = 8;
        int w = 6;

        int result = (x > y) && (z < w) ? (a << 2) : (b >> 1);
        int valid = ((x & y) | (z ^ w)) & ((a << 2) ^ (b >> 1));
        int value = (x * y + z / w) | (a - b * c / d);
        int output = (x++ % y) == (a ^ b) ? (z * w) : (a / b) + (c % d);

        System.out.println("result = " + result);
        System.out.println("value = " + value);
        System.out.println("output = " + output);
        System.out.println("valid = " + valid);
    }
}

/*
OUTPUT

result = 2
value = -11
output = 2
valid = 14

 */

