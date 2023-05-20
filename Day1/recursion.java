import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows  ");
        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(calculatePascalValue(i, j) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int calculatePascalValue(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        } else {
            return calculatePascalValue(row - 1, col - 1) + calculatePascalValue(row - 1, col);
        }
    }
}
