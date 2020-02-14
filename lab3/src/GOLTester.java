import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/*
 * Paulie Jo Gonzalez
 * lab W3-4
 * MW 1:30 pm
 */
public class GOLTester {
    /********************************************************************
     *GameOfLife tests
     * neighbors:   5 test cases
     * oneStep:     5 test cases
     * evolution:   5 test cases
     ********************************************************************/
    // - - - - - - - - - - - - - - - - - - - - - neighbors- - - - - - - - - - - - - - - - - - - - - - -//
    /*
     * neighbors:
     * Test case 1:
     * neighbors(1,2) → 3
     */
    @Test
    public void testNeighbors1() {
        int[][] B = new int[5][5];//b1 from assignment
        for(int i = 1; i < 4; i++)
            B[2][i] = 1;
        GameOfLife gol = new GameOfLife(B);
        assertEquals(3,gol.neighbors(1,2));
    }

    /*
     * neighbors:
     * Test case 2:
     * neighbors(2,2) → 4
     */
    @Test
    public void testNeighbors2() {
        int[][] B = new int[6][6];//b2 from assignment
        for(int i = 2; i < 5; i++)
            B[2][i] = 1;
        for(int i = 1; i < 4; i++)
            B[3][i] = 1;
        GameOfLife gol = new GameOfLife(B);
        assertEquals(4,gol.neighbors(2,2));
    }

    /*
     * neighbors:
     * Test case 3:
     * neighbors(0,4) → 0
     */
    @Test
    public void testNeighbors3() {
        int[][] B = new int[6][6];
        for(int i = 1; i < 3; i++) {
            for(int j = 1; j < 3; j++)
                B[i][j] = 1;
        }
        for(int i = 3; i < 5; i++) {
            for(int j = 3; j < 5; j++)
                B[i][j] = 1;
        }
        GameOfLife gol = new GameOfLife(B);
        assertEquals(0,gol.neighbors(0,4));
    }

    /*
     * neighbors:
     * Test case 4:
     * neighbors(1,1) → 8
     */
    @Test
    public void testNeighbors4() {
        int[][] B = new int[4][4];
        for(int i = 0; i < B.length; i++) {
            for(int j = 0; j < B.length; j++)
                B[i][j] = 1;
        }
        GameOfLife gol = new GameOfLife(B);
        assertEquals(8,gol.neighbors(1,1));
    }

    /*
     * neighbors:
     * Test case 5:
     * neighbors(0,3) → 3
     */
    @Test
    public void testNeighbors5() {
        int[][] B = new int[4][4];
        for(int i = 0; i < B.length; i++) {
            for(int j = 0; j < B.length; j++)
                B[i][j] = 1;
        }
        GameOfLife gol = new GameOfLife(B);
        assertEquals(3,gol.neighbors(0,3));
    }

    // - - - - - - - - - - - - - - - - - - - - -oneStep - - - - - - - - - - - - - - - - - - - - - - -//
    /*
    * oneStep:
    * Test case 1:
    * oneStep() → exp
     */
    @Test
    public void testOneStep1() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] exp = {{1,0,1},{0,0,0},{1,0,1}};//expected outcome
        GameOfLife gol = new GameOfLife(A);
        gol.oneStep();
        assertArrayEquals(exp,gol.getBoard());
    }

    /*
     * oneStep:
     * Test case 2:
     * oneStep() → exp
     */
    @Test
    public void testOneStep2() {
        int[][] A = new int[5][5];//b1 from assignment
        int[][] exp = {{0,0,0,0,0},
                        {0,0,1,0,0},
                        {0,0,1,0,0},
                        {0,0,1,0,0},
                        {0,0,0,0,0}};//expected outcome
        for(int i = 1; i < 4; i++)
            A[2][i] = 1;
        GameOfLife gol = new GameOfLife(A);
        gol.oneStep();
        assertArrayEquals(exp,gol.getBoard());
    }

    /*
     * oneStep:
     * Test case 3:
     * oneStep() → exp
     */
    @Test
    public void testOneStep3() {
        int[][] B = new int[6][6];//b2 from assignment
        for(int i = 2; i < 5; i++)
            B[2][i] = 1;
        for(int i = 1; i < 4; i++)
            B[3][i] = 1;
        int[][] exp = {{0,0,0,0,0,0},
                        {0,0,0,1,0,0},
                        {0,1,0,0,1,0},
                        {0,1,0,0,1,0},
                        {0,0,1,0,0,0},
                        {0,0,0,0,0,0}};//expected outcome
        GameOfLife gol = new GameOfLife(B);
        gol.oneStep();
        assertArrayEquals(exp,gol.getBoard());
    }

    /*
     * oneStep:
     * Test case 4:
     * oneStep() →
     */
    @Test
    public void testOneStep4() {
        int[][] A = new int[5][5];
        for(int i = 0; i < 5; i++) {
            A[0][i] = 1;
            A[2][i] = 1;
        }
        int[][] exp = new int[5][5];//expected outcome
        for(int j = 1; j < 4; j++) {
            exp[0][j] = 1;
            exp[2][j] = 1;
            exp[3][j] = 1;
        }
        GameOfLife gol = new GameOfLife(A);
        gol.oneStep();
        assertArrayEquals(exp,gol.getBoard());
    }

    /*
     * oneStep:
     * Test case 5:
     * oneStep() →
     */
    @Test
    public void testOneStep5() {
        int[][] A = {{0,1,0,0},{0,0,1,0},{1,0,1,0},{0,1,0,0}};
        int[][] exp = {{0,0,0,0},{0,0,1,0},{0,0,1,0},{0,1,0,0}};
        GameOfLife gol = new GameOfLife(A);
        gol.oneStep();
        assertArrayEquals(exp,gol.getBoard());

    }

    // - - - - - - - - - - - - - - - - - - - -evolution - - - - - - - - - - - - - - - - - - - - - - - -//
    /*
     * evolution:
     * Test case 1:
     * evolution(1) → exp
     */
    @Test
    public void testEvolution1() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] exp = {{1,0,1},{0,0,0},{1,0,1}};//expected outcome
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(1);
        assertArrayEquals(exp,gol.getBoard());
    }

    /*
     * evolution:
     * Test case 2:
     * evolution(2) → exp
     */
    @Test
    public void testEvolution2() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] exp = {{0,0,0},{0,0,0},{0,0,0}};//expected outcome
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(2);
        assertArrayEquals(exp,gol.getBoard());
    }

    /*
     * evolution:
     * Test case 3:
     * evolution(1) → exp
     */
    @Test
    public void testEvolution3() {
        int[][] B = new int[6][6];//b2 from assignment
        for(int i = 2; i < 5; i++)
            B[2][i] = 1;
        for(int i = 1; i < 4; i++)
            B[3][i] = 1;
        int[][] exp = {{0,0,0,0,0,0},
                {0,0,0,1,0,0},
                {0,1,0,0,1,0},
                {0,1,0,0,1,0},
                {0,0,1,0,0,0},
                {0,0,0,0,0,0}};//expected outcome
        GameOfLife gol = new GameOfLife(B);
        gol.evolution(1);
        assertArrayEquals(exp,gol.getBoard());
    }

    /*
     * evolution:
     * Test case 4:
     * evolution(3) → exp
     */
    @Test
    public void testEvolution4() {
        int[][] A = {{0,0,1,0},{0,1,1,0},{1,0,1,1},{1,0,1,0}};
        int[][] exp = {{0,0,0,0},{0,1,1,1},{0,0,0,0},{0,0,1,1}};
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(3);
        assertArrayEquals(exp,gol.getBoard());
    }

    /*
     * evolution:
     * Test case 5:
     * evolution(7) → exp
     */
    @Test
    public void testEvolution5() {
        int[][] A = {{0,1,0,0},{0,0,1,0},{1,0,1,0},{0,1,0,0}};
        int[][] exp = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        GameOfLife gol = new GameOfLife(A);
        gol.evolution(7);
        assertArrayEquals(exp,gol.getBoard());

    }

    /********************************************************************
     * TorusGameOfLife tests
     * neighbors:   5 test cases
     * oneStep:     5 test cases
     * evolution:   5 test cases
     ********************************************************************/
    // - - - - - - - - - - - - - - - - - - - - - - -neighbors - - - - - - - - - - - - - - - - - - - - -//
    /*
     * TGOL neighbors:
     * Test case 1:
     * neighbors(0,0) → 5
     */
    @Test
    public void testNeighborsT1() {
        int[][] A = {{0,1,1,0},
                    {0,1,0,0},
                    {0,1,0,0},
                    {1,1,1,1}};
        TorusGameOfLife tgol = new TorusGameOfLife(A);
        assertEquals(5,tgol.neighbors(0,0));
    }

    /*
     * TGOL neighbors:
     * Test case 2:
     * neighbors(2,2) → 4
     */
    @Test
    public void testNeighborsT2() {
        int[][] B = new int[6][6];//b2 from assignment
        for(int i = 2; i < 5; i++)
            B[2][i] = 1;
        for(int i = 1; i < 4; i++)
            B[3][i] = 1;
        TorusGameOfLife tgol = new TorusGameOfLife(B);
        //tgol.printBoard();
        assertEquals(4,tgol.neighbors(2,2));
    }

    /*
     * TGOL neighbors:
     * Test case 3:
     * neighbors(0,2) → 7
     */
    @Test
    public void testNeighborsT3() {
        int[][] B = {{1,1,1,1,1},
                    {0,0,1,1,0},
                    {0,0,1,0,0},
                    {0,1,1,1,1},
                    {0,1,1,1,1}};
        TorusGameOfLife tgol = new TorusGameOfLife(B);
        assertEquals(7,tgol.neighbors(0,2));
    }

    /*
     * TGOL neighbors:
     * Test case 4:
     * neighbors(4,6) → 6
     */
    @Test
    public void testNeighborsT4() {
        int[][] B = new int[18][11];//b4 from assignment
        B[2][5] = 1;
        B[3][4] = 1; B[3][5] = 1; B[3][6] = 1;
        B[4][3] = 1; B[4][5] = 1; B[4][7] = 1;
        B[5][3] = 1; B[5][5] = 1; B[5][7] = 1;
        B[6][4] = 1; B[6][5] = 1; B[6][6] = 1;
        B[7][5] = 1;
        B[10][5] = 1;
        B[11][4] = 1; B[11][5] = 1; B[11][6] = 1;
        B[12][3] = 1; B[12][5] = 1; B[12][7] = 1;
        B[13][3] = 1; B[13][5] = 1; B[13][7] = 1;
        B[14][4] = 1; B[14][5] = 1; B[14][6] = 1;
        B[15][5] = 1;
        TorusGameOfLife tgol = new TorusGameOfLife(B);
        assertEquals(4,tgol.neighbors(3,5));
    }

    /*
     * TGOL neighbors:
     * Test case 5: this tests that the method accounts for all 8 neighbors for ANY cell
     * neighbors(3,3) → 8 (bottom right corner)
     */
    @Test
    public void testNeighborsT5() {
        int[][] B = new int[4][4];
        for(int i = 0; i < B.length; i++) {
            for(int j = 0; j < B.length; j++)
                B[i][j] = 1;
        }
        TorusGameOfLife tgol = new TorusGameOfLife(B);
        assertEquals(8,tgol.neighbors(3,3));
    }

    // - - - - - - - - - - - - - - - - - - - - - - oneStep- - - - - - - - - - - - - - - - - - - - - -//
    /*
     * TGOL oneStep:
     * Test case 1:
     * oneStep() → exp
     */
    @Test
    public void testOneStepT1() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] exp = {{0,0,0},{0,0,0},{0,0,0}};
        TorusGameOfLife tgol = new TorusGameOfLife(A);
        tgol.oneStep();
        assertArrayEquals(exp,tgol.getBoard());
    }

    /*
     * TGOL oneStep:
     * Test case 2:
     * oneStep() →
     */
    @Test
    public void testOneStepT2() {
        int[][] A = {{1,1,1,1,1},
                    {0,0,1,1,0},
                    {0,0,1,0,0},
                    {0,1,1,1,1},
                    {0,1,1,1,1}};
        int[][] exp = {{0,0,0,0,0},
                        {1,0,0,0,0},
                        {0,0,0,0,1},
                        {0,0,0,0,1},
                        {0,0,0,0,0}};
        TorusGameOfLife tgol = new TorusGameOfLife(A);
        tgol.oneStep();
        assertArrayEquals(exp,tgol.getBoard());
    }

    /*
     * TGOL oneStep:
     * Test case 3:
     * oneStep() → exp
     */
    @Test
    public void testOneStepT3() {
        int[][] A = {{1,0,0,1},
                    {1,0,0,1},
                    {0,0,0,0},
                    {1,1,1,0}};
        int[][] exp = {{0,0,0,0},
                    {1,0,0,1},
                    {0,0,1,0},
                    {1,1,1,0}};
        TorusGameOfLife tgol = new TorusGameOfLife(A);
        tgol.oneStep();
        assertArrayEquals(exp,tgol.getBoard());
    }

    /*
     * TGOL oneStep:
     * Test case 4:
     * oneStep() → exp
     */
    @Test
    public void testOneStepT4() {
        int[][] A = {{0,1},{1,1}};
        int[][] exp = {{0,0},{0,0}};
        TorusGameOfLife tgol = new TorusGameOfLife(A);
        tgol.oneStep();
        assertArrayEquals(exp,tgol.getBoard());
    }

    /*
     * TGOL oneStep:
     * Test case 5:
     * oneStep() → exp
     */
    @Test
    public void testOneStepT5() {
        int[][] A = {{0,1,0},{0,1,0},{1,0,0}};
        int[][] exp = {{1,1,1},{1,1,1},{1,1,1}};
        TorusGameOfLife tgol = new TorusGameOfLife(A);
        tgol.oneStep();
        assertArrayEquals(exp,tgol.getBoard());
    }

    // - - - - - - - - - - - - - - - - - - - - -evolution - - - - - - - - - - - - - - - - - - - - - - -//
    /*
     * TGOL evolution:
     * Test case 1:
     * evolution(0) → no change
     */
    @Test
    public void testEvolutionT1() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] exp = {{1,1,1},{1,1,1},{1,1,1}};
        TorusGameOfLife tgol = new TorusGameOfLife(A);
        tgol.evolution(0);
        assertArrayEquals(exp,tgol.getBoard());
    }

    /*
     * TGOL evolution:
     * Test case 2:
     * evolution(2) →
     */
    @Test
    public void testEvolutionT2() {
        int[][] A = {{1,1,1,1,1},
                {0,0,1,1,0},
                {0,0,1,0,0},
                {0,1,1,1,1},
                {0,1,1,1,1}};
        int[][] exp = {{0,0,0,0,0},
                    {0,0,0,0,0},
                    {1,0,0,0,1},
                    {0,0,0,0,0},
                    {0,0,0,0,0}};
        TorusGameOfLife tgol = new TorusGameOfLife(A);
        tgol.evolution(2);
        assertArrayEquals(exp,tgol.getBoard());
    }

    /*
     * TGOL evolution:
     * Test case 3:
     * evolution(3) →
     */
    @Test
    public void testEvolutionT3() {
        int[][] A = {{1,0,0,1},
                    {1,0,0,1},
                    {0,0,0,0},
                    {1,1,1,0}};
        int[][] exp = {{1,1,0,0},
                        {0,0,1,1},
                        {1,1,0,0},
                        {0,1,0,1}};
        TorusGameOfLife tgol = new TorusGameOfLife(A);
        tgol.evolution(3);
        assertArrayEquals(exp,tgol.getBoard());

    }

    /*
     * TGOL evolution:
     * Test case 4:
     * evolution(1) →
     */
    @Test
    public void testEvolutionT4() {
        int[][] A = {{1,0,1,0},{0,1,0,1},{1,0,1,0},{0,1,1,0}};
        int[][] exp = {{1,0,0,0},{0,0,0,0},{1,0,0,0},{1,0,1,0}};
        TorusGameOfLife tgol = new TorusGameOfLife(A);
        tgol.evolution(1);
        assertArrayEquals(exp,tgol.getBoard());
    }

    /*
     * TGOL evolution:
     * Test case 5:
     * evolution(2) →
     */
    @Test
    public void testEvolutionT5() {
        int[][] A = {{0,1,0},{0,1,0},{1,0,0}};
        int[][] exp = {{0,0,0},{0,0,0},{0,0,0}};
        TorusGameOfLife tgol = new TorusGameOfLife(A);
        tgol.evolution(2);
        assertArrayEquals(exp,tgol.getBoard());

    }
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -//
}//end class
