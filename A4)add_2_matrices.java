import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int rows = 2;
        int columns = 3;
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] result = new int[rows][columns];
        for(int i =0; i<rows ; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element for matrix 1 at " + i + "" + j + " index");
                matrix1[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<rows ; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element for matrix 2 at " + i + "" + j + " index");
                matrix2[i][j] = sc.nextInt();
            }
        }
        for(int i =0; i<rows ; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("+");
        System.out.println();
        for(int i =0; i<rows ; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("=");
        for(int i = 0; i<rows ; i++){
            for(int j = 0; j<columns ; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i =0; i<rows ; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }




    }
}
