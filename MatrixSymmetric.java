// check whether a matrix is symmetric or not

import java.util.Scanner;

public class MatrixSymmetric{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

    int r,c;

    System.out.print("Enter number of rows : ");
    r = sc.nextInt();

    System.out.print("Enter number of cols : ");
    c = sc.nextInt();

    int[][] a = new int[r][c];

    if(r!=c) {
        System.out.println("Matrix is not Symmetric..!!");
        return;
    }

    System.out.println("Enter matrix elements : ");

    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            a[i][j] = sc.nextInt();
        }
    }

    boolean symmetric = true;

    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            if(a[i][j] != a[j][i]){
                symmetric = false;
                break;
            }
        }
    }

    if(symmetric)
        System.out.println("Matrix is symmetric..!!");
    else
        System.out.println("Matric is not symmetric..!!");

    sc.close();
    }
}