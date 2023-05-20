public class PascalTriangleWithRecursion {
    public static void printPascalTriangle(int rows) {
        if(rows == 1) {
            System.out.println("1");
        } else {
            printPascalTriangle(rows-1);
            System.out.println(combination(rows-1, 0));
        }
    }

    private static String combination(int N, int R) {
        StringBuilder line = new StringBuilder("");

        while(N != R) {
            line.append((factorial(N) / (factorial(N-R) * factorial(R))) + " ");
            R++;
        }

        line.append("1");

        return line.toString();
    }
 
    private static int factorial(int num) {
        int fact = 1;

        if(num != 0) {
            while(num >= 1) {
                fact *= num--;
            }
        }
         
        return fact; // returning factorial of num
    }
}
