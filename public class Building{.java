import java.util.*;

public class Building {

    static void printLine(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            printLine(i);
        }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter floor height: ");
        int height = sc.nextInt();

        printTriangle(height);
    }
}