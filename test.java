import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c;
        boolean symmetric = true;

        System.out.print("Enter number of rows: ");
        r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        int[][] a = new int[r][c];

        // Condition for symmetric matrix
        if (r != c) {
            System.out.println("Matrix is NOT Symmetric");
            return;
        }

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Check symmetry
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if (a[i][j] != a[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric)
            System.out.println("Matrix is Symmetric");
        else
            System.out.println("Matrix is NOT Symmetric");

        sc.close();
    }
}
