package outputTracing;

public class C11 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int c = 9;
        int d = 2;

        boolean value = (a * b + c / d) != 0 && (a - b * c / d) != 0;
        int output3 = (a % b > 4) ? (c * d) : (a / b) + (c % d);
        int result3 = (a << b) ^ (a < b ? c : d);
        boolean check3 = ((a++ * b--) > (c-- / ++d)) && (a << 2) != 0;

        System.out.println("value = " + value);
        System.out.println("output3 = " + output3);
        System.out.println("result3 = " + result3);
        System.out.println("check3 = " + check3);
    }
}
/*
OUTPUT

value = true
output3 = 2
result3 = 114
check3 = true

 */