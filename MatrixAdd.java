import java.util.Scanner;

class Matrix {
    int rows, cols;
    int[][] data;

    // Constructor
    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    // Method to read matrix elements
    void readMatrix(Scanner sc) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = sc.nextInt();
            }
        }
    }

    // Method to add two matrices
    Matrix add(Matrix m) {
        Matrix result = new Matrix(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + m.data[i][j];
            }
        }
        return result;
    }

    // Method to display matrix
    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter number of cols : ");
        int cols = sc.nextInt();

        Matrix A = new Matrix(rows, cols);
        Matrix B = new Matrix(rows, cols);

        System.out.println("Enter first matrix : ");
        A.readMatrix(sc);

        System.out.println("Enter second matrix : ");
        B.readMatrix(sc);

        Matrix C = A.add(B);

        System.out.println("\nSum of the two matrices : ");
        C.display();

        sc.close();
    }
}
