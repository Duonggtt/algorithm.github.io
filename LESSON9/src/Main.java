public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        System.out.println(isToeplitzMatrix(matrix));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 1;i < row;i++) {
            for(int j = 1;j<col;j++) {
                System.out.println("matrix[i][j] = " + matrix[i][j]);
                System.out.println("matrix[i-1][j-1] = " + matrix[i-1][j-1]);
                if(matrix[i-1][j-1] != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}