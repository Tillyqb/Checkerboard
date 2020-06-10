package services;

import java.awt.*;

public class Checkerboard
{

    public static void main(String[] args)
    {
        String[][] board = new String[8][8];

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if ((i + j) % 2 == 0)
                    board[i][j] = "X";
                else
                    board[i][j] = "O";
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
