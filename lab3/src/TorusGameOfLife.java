public class TorusGameOfLife extends GameOfLife {

    public TorusGameOfLife() {}

    public TorusGameOfLife(int size) {
        super(size);
    }

    public TorusGameOfLife(int[][] arr) {
        super(arr);
    }

    /* neighbors method:
     * Counts the number of living neighbors of the given cell.
     */
    @Override
    public int neighbors(int r, int c) {//fix this
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
        if(up > -1 && right < previous[0].length) {
            if(previous[up][right] == 1)    count++;
        }
        if(left > -1) {
            if(previous[r][left] == 1)      count++;
        }
        if(right < previous[0].length) {
            if(previous[r][right] == 1)     count++;
        }
        if(down < previous.length && left > -1) {
            if(previous[down][left] == 1)   count++;
        }
        if(down < previous.length) {
            if(previous[down][c] == 1)      count++;
        }
        if(down < previous.length && right < previous[0].length) {
            if(previous[down][right] == 1)  count++;
        }

        return count;
    }

}//end class
