import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        System.out.println("Enter cells: ");
        char[][] board = creatMatrix(text1);
        printBoard(creatMatrix(text1));
        while (true) {
            try {
                int x1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                System.out.println("Enter the coordinates: " + x1 + " " + x2);
                if (x1 > 3 || x2 > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (board[x1 - 1][x2 - 1] != '_') {
                    System.out.println("This cell is occupied! Choose another one!");
                }
                else {
                    board[x1 - 1][x2 - 1] = 'X';
                    printBoard(board);
                }
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();

            }
        }

    }

    public static char[][] creatMatrix(String text) {
        char[][] matrix = new char[3][3];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = text.charAt(k);
                k++;
            }
        }
        return matrix;
    }
    
    public static void printBoard(char[][] matirx) {
        System.out.println("---------");
        System.out.println("| " + matirx[0][0] + " " + matirx[0][1] + " " + matirx[0][2] + " |");
        System.out.println("| " + matirx[1][0] + " " + matirx[1][1] + " " + matirx[1][2] + " |");
        System.out.println("| " + matirx[2][0] + " " + matirx[2][1] + " " + matirx[2][2] + " |");
        System.out.println("---------");
    }



}
