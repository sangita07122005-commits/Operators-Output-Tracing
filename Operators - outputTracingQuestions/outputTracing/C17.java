package outputTracing;

public class C17 {
    public static void main(String[] args) {
        // 1. What will be the values of x and y after this code executes?
        int x = 0;
        int y = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    x += i;
                    continue;
                }
                if (i + j > 4) {
                    break;
                }
                y += j;
            }
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

/*
 Answer: x = 6, y = 4
 Trace: i=1,j=2: y=2
        i=1,j=3: y=5 (break)
        i=2,j=2: x=2
        i=3,j=3: x=5

 */