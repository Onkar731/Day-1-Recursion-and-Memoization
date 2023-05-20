public class PascalTriangleWithIteration {
    public static void printPascalTriangle(int rows) {
        for(int i = 0; i < rows; i++) {
            boolean printPascalNumber = true;
            int r = 0;

            for(int j = 0; j < rows*2; j++) {
                if((j >= rows-i && j <= rows+i) && printPascalNumber) {
                    System.out.print(combination(i, r++) + " ");
                    printPascalNumber = false;
                } else {
                    System.out.print("  ");
                    printPascalNumber = true;
                }
            }

            System.out.println();
        }
    } 

    private static int combination(int N, int R) {
        return (factorial(N) / (factorial(N - R) * factorial(R)));
    }

    public static int factorial(int num) {
        int fact = 1;

        if(num != 0) {
            while(num >= 1) {
                fact *= num--;
            }
        }
         
        return fact; // returning factorial of num
    }
}