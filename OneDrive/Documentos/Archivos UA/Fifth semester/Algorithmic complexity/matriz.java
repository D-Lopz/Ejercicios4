public class matriz {
    public static void main(String[] args) {
        int n = 4;

        int[][] matriz = new int[n][n];


        llenarEspiral(matriz, n);

        imprimirMatriz(matriz);
    }

    public static void llenarEspiral(int[][] matriz, int n) {
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int num = 1;

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                matriz[top][i] = num++;
            }
            top++;


            for (int i = top; i <= bottom; i++) {
                matriz[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matriz[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matriz[i][left] = num++;
                }
                left++;
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}