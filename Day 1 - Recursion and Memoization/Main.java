public class Main {
    public static void main(String[] args) {

        System.out.println("Pascal Triangle Using Iteration : ");
        PascalTriangleWithIteration.printPascalTriangle(6);

        System.out.println("Pascal Triangle Using Recursion : ");
        PascalTriangleWithRecursion.printPascalTriangle(6);
 
        System.out.println("Pascal Triangle Using Memoization : ");
        PascalTriangleWithMemoization.printPascalTriangle(6);
    }
}
