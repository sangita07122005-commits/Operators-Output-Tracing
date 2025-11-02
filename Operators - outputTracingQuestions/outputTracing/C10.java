package outputTracing;

public class C10 {
    public static void main(String[] args) {

        int a = 7;
        int b = 4;
        int c = 9;
        int d = 2;

        int output = ((a++ * --b) + (c-- / ++d)) % c;
        boolean check = ((a + b) > (c - d)) && (a * b <= c / d);
        int result = (a != 0 || b != 0) ? (a * b) : (c / d);
        boolean valid = ((a >= b) && (c < d)) || ((a != b) && (c == d));

        System.out.println("result = " + result);
        System.out.println("output = " + output);
        System.out.println("check = " + check);
        System.out.println("valid = " + valid);
    }
}

/*
* OUTPUT
result = 24
output = 0
check = false
valid = false

* */