package loopsinjavaexample.homework;

public class Array3x4 {
    public static void main(String[] args) {
        int[][] x;
        x = new int[3][4];

        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;
        x[0][3] = 4;
        x[1][0] = 5;
        x[1][1] = 6;
        x[1][2] = 7;
        x[1][3] = 8;
        x[2][0] = 9;
        x[2][1] = 10;
        x[2][2] = 11;
        x[2][3] = 12;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(x[i][j] + " ");
            }
                System.out.println();
            }
        }
    }



