package outputTracing;

public class C13 {
    public static void main(String[] args) {
        int x = 15;
        int y = 8;
        int z = 12;
        int w = 5;
        int a = 20;
        int b = 7;
        int c = 10;
        int d = 4;

        int result1 = (++x * y--) + (z++ / --w);
        int value = (x++ + --y) * (z-- - ++w);
        boolean check = ((x + y) > (z - w)) && (a * b <= c / d);
        int result2 = ((a > x) || (b >c)) ? (x * y) : (z / w);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("value = " + value);
        System.out.println("check = " + check);
    }
}

/*

OUTPUT

result1 = 131
result2 = 102
value = 176
check = false

 */

