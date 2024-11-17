/* Anna Del Negro
 * Dr. Steinberg
 * COP3503 Spring 2024
 * Programming Assignment 1
 */

import java.util.Random;

public class Game {
    int row, col;
    int[][] array = new int[8][8];

    /* array of choices. d:diagonal, r:right, b:down */
    char[] chararray = { 'd', 'r', 'b' };
    Random r;

    /* reference to a random class object */
    Game(Random r) {
        this.r = r;
    }

    /* player 2 move method */
    public char selectPlayerTwoMove() {
        int index = r.nextInt(chararray.length);
        char choice = chararray[index];
        return choice;
    }

    /* main play function */
    public int play() {
        /* setting variable to method return */
        char player2move = selectPlayerTwoMove();

        /* setting values used on grid for each player */
        int player_1 = 1;
        int player_2 = -1;

        /* setting [1,1] to player 1 (starting point) */
        row = 1;
        col = 1;
        array[row][col] = player_1;

        while (true) {

            /* in case we are in [7,7] */
            if (row == 7 && col == 7) {
                break;
            }
            /*
             * handling choice of player2move.
             * assuring no out-of-bound issues
             * for each switch case
             */
            switch (player2move) {
                case 'd':
                    if (row != 7 && col != 7) {
                        row++;
                        col++;
                    } else if (row == 7) {
                        col++;
                    } else if (col == 7) {
                        row++;
                    }
                    break;
                case 'r':
                    if (col != 7)
                        col++;
                    else
                        row++;
                    break;
                case 'b':
                    if (row != 7)
                        row++;
                    else
                        col++;
                    break;
            }
            /* setting cell where we moved to player_2's value */
            array[row][col] = player_2;

            /*
             * player 1 moves.
             * making sure player 1 stays at a
             * [odd,odd] index
             */
            if (row % 2 == 0 && col % 2 != 0) {
                row++;
                array[row][col] = player_1;
            } else if (row % 2 != 0 && col % 2 == 0) {
                col++;
                array[row][col] = player_1;
            } else if (row % 2 == 0 && col % 2 == 0) {
                row++;
                col++;
                array[row][col] = player_1;
            }

        }

        /*
         * testing players are moving properly.
         * for (int[] arr : array) {
         * for (int number : arr) {
         * System.out.print(number + " ");
         * }
         * System.out.println();
         * }
         */

        /* returning winner */
        return array[row][col];
    }
}
