package ese_pracs_a_sec;

class MatrixMultiplier extends Thread {
    private int[][] A, B, result;
    private int row, col;

    public MatrixMultiplier(int[][] A, int[][] B, int[][] result, int row, int col) {
        this.A = A;
        this.B = B;
        this.result = result;
        this.row = row;
        this.col = col;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < A[0].length; i++) {
            sum += A[row][i] * B[i][col];
        }
        result[row][col] = sum;
    }
}

public class q3{
    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] result = new int[2][2];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                new MatrixMultiplier(A, B, result, i, j).start();
            }
        }
    }
}
