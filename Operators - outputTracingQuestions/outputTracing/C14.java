package outputTracing;

public class C14 {
    public static void main(String[] args) {
        int x = 15;
        int y = 8;
        int z = 12;
        int w = 5;
        int a = 20;
        int b = 7;
        int c = 10;
        int d = 4;

        boolean valid = ((x >= y) && (z < w)) || ((a != b) && (c == d));
        int bits = (x << 2) + (y >> 1) | (z & 0xFF);
        int value = ((x & 0xF) << 4) | ((y & 0xF0) >> 4);
        int mask = (~x & y) | (z << 3) | (w >> 2);

        System.out.println("boolean = " + valid);
        System.out.println("bits = " + bits);
        System.out.println("value = " + value);
        System.out.println("mask = " + mask);
    }
}

/*
OUTPUT

boolean = false
bits = 76
value = 240
mask = 97

*/

