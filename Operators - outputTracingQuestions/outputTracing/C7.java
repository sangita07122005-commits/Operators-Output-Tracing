package outputTracing;

public class C7 {
    public static void main(String[] args) {

        int u = 10;
        u = u++ * ++u - u-- / --u;
        System.out.println("u = " + u);


        boolean v = (16 >> 2 > 3) && (20 << 1 < 50);
        System.out.println("v = " + v);



        int x = (12 | 25) & (~8);
        System.out.println("x = " + x);


        int y = 2;
        y = ++y + y++ * --y - y--;
        System.out.println("y = " + y);
    }
}

/*
OUTPUT

u = 119
v = true
x = 21
y = 9

* */