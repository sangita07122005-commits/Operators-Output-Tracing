package outputTracing;

public class C9 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int c = 9;
        int d = 2;


        int output2 = (a ^ b) & (a++ * b--) + (++c / --d);
        boolean check2 = (((a + b) * (c - d)) >= ((a / b) * (c % d)));
        int result2 = (a > b) && (c < d) ? (a << 2) : (b >> 1);
        int valid2 = ((a & b) | (c ^ d)) + ((a << 2) >> (b >> 1));

        System.out.println("output2 = " + output2);
        System.out.println("check2 = " + check2);
        System.out.println("result2 = " + result2);
        System.out.println("valid2 = " + valid2);
    }

}
/*
OUTPUT

output2 = 2
check2 = true
result2 = 1
valid2 = 27

*/
