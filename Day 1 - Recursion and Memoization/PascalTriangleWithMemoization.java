import java.util.HashMap;
import java.util.Map;

public class PascalTriangleWithMemoization {
    private static Map<Integer, Integer> cache = new HashMap<>();
    private static boolean flag = true;

    public static void printPascalTriangle(int rows) {
        if(flag) {
            // calculating factorial of all numbers only once by calling factorial() 
            // once and stored all factorial in cache
            factorial(rows);
            flag = false;
        }

        if(rows == 1) {
            System.out.println("1");
        } else {
            printPascalTriangle(rows-1);
            System.out.println(combination(rows-1, 1));
        }
    }

    private static String combination(int N, int R) {
        StringBuilder line = new StringBuilder("1 ");

        while(N != R) {
            line.append((cache.get(N) / (cache.get(N - R) * cache.get(R))) + " ");
            R++;
        }

        line.append("1");

        return line.toString();
    }
 
    private static void factorial(int num) {

        int fact = 1;

        for(int i = 1; i <= num; i++) {
            fact *= i;
            cache.put(i, fact);
        }
    }
}

