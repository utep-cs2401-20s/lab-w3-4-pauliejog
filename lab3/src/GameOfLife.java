/*
* Paulie Jo Gonzalez
* lab W3-4
* MW 1:30 pm
 */

public class GameOfLife {

    int size;
    int[][] board;
    int[][] previous;

    public GameOfLife() {}

    public GameOfLife(int size) {
        this.size = size;
        this.board = new int[size][size];
        this.previous = new int[size][size];
    }

    public GameOfLife(int[][] arr) {
        this.size = arr.length;
        this.board = new int[size][size];
        this.previous = new int[size][size];
        for(int r = 0; r < size; r++) {
            for(int c = 0; c < size; c++) {
                previous[r][c] = arr[r][c];
            }
        }
    }

    /* Getter:
     * return the current board
     */
    public int[][] getBoard() {
        return board;
    }//end getBoard

    /* oneStep method:
     * Determines live neighbors for each cell.
     * Determines live/dead for new board.
     */
    public void oneStep() {
        for(int i = 0; i < previous.length; i++) {//copy previous to board
            for(int j = 0; j < previous[i].length; j++) {
                board[i][j] = previous[i][j];
            }
        }

        for(int r = 0; r < previous.length; r++) {//update board based on rules of the game
            for(int c = 0; c < previous[r].length; c++) {
                int cell = previous[r][c];//0 is dead, 1 is alive
                if(cell == 0 && neighbors(r,c) == 3)
                    board[r][c] = 1;
                if(cell == 1) {
                    if(neighbors(r,c) < 2) board[r][c] = 0;
                    if(neighbors(r,c) > 3) board[r][c] = 0;
                }
            }
        }

        for(int i = 0; i < board.length; i++) {//copy board to previous to start over?
            for(int j = 0; j < board[i].length; j++) {
                previous[i][j] = board[i][j];
            }
        }

    }//end oneStep

    /* neighbors method:
     * Counts the number of living neighbors of the given cell.
     */
    public int neighbors(int r, int c) {//counts live neighbors
        int count = 0;
        int up = r - 1;
        int down = r + 1;
        int left = c - 1;
        int right = c + 1;

        if(up > -1 && left > -1) {
            if(previous[up][left] == 1)     count++;
        }
        if(up > -1) {
            if(previous[up][c] == 1)        count++;
        }
        if(up > -1 && right < previous.length) {
            if(previous[up][right] == 1)    count++;
        }
        if(left > -1) {
            if(previous[r][left] == 1)      count++;
        }
        if(right < previous.length) {
            if(previous[r][right] == 1)     count++;
        }
        if(down < previous.length && left > -1) {
            if(previous[down][left] == 1)   count++;
        }
        if(down < previous.length) {
            if(previous[down][c] == 1)      count++;
        }
        if(down < previous.length && right < previous.length) {
            if(previous[down][right] == 1)  count++;
        }

        return count;

    }//end neighbors

    /* evolution method:
     * Calls on oneStep method n times
     */
    public void evolution(int n) {
        for(int i = 0; i < n; i++) {
            oneStep();
        }
    }//end evolution

    /*
     * printBoard method:
     * Prints current board
     */
    public void printBoard() {
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }//end printBoard

}//end class
