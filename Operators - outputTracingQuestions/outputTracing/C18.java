package outputTracing;
public class C18 {
    public static void main(String[] args) {
        /*
        Question: What sequence of numbers will be printed?

        This program demonstrates triple nested loops with:
        - Outer loop i: 1 to 3
        - Middle loop j: starts from i to 3
        - Inner loop k: 1 to j

        The program prints i*j*k when (i+j+k) is divisible by 3,
        then breaks the innermost loop.
        */

        System.out.println("Generated sequence:");

        // Outer loop: i goes from 1 to 3
        for (int i = 1; i <= 3; i++) {
            // Middle loop: j goes from i to 3
            for (int j = i; j <= 3; j++) {
                // Inner loop: k goes from 1 to j
                for (int k = 1; k <= j; k++) {
                    // Check if sum is divisible by 3
                    if ((i + j + k) % 3 == 0) {
                        System.out.print(i * j * k + " ");
                        break;  // Exit inner loop after printing
                    }
                }
            }
        }

        /* Detailed execution trace:
           i=1, j=1, k=1: 1+1+1=3 ✓ -> prints 1*1*1 = 1
           i=1, j=2, k=1: 1+2+1=4 ✗
           i=1, j=2, k=2: 1+2+2=5 ✗
           i=1, j=3, k=1: 1+3+1=5 ✗
           i=1, j=3, k=2: 1+3+2=6 ✓ -> prints 1*3*2 = 6

           i=2, j=2, k=1: 2+2+1=5 ✗
           i=2, j=2, k=2: 2+2+2=6 ✓ -> prints 2*2*2 = 8
           i=2, j=3, k=1: 2+3+1=6 ✓ -> prints 2*3*1 = 6

           i=3, j=3, k=1: 3+3+1=7 ✗
           i=3, j=3, k=2: 3+3+2=8 ✗
           i=3, j=3, k=3: 3+3+3=9 ✓ -> prints 3*3*3 = 27

           Expected output: 3 8 9 18 27
        */
    }
}