import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class GOLTester {
    /********************************************************************
     * GameOfLife tests
     * neighbors: 6 test cases
     * oneStep: 5 test cases
     * evolution: 5 test cases
     ********************************************************************
     ********************************************************************/

    /*
     * neighbors:
     * Test case 1:
     * neighbors(1,2) → 3
     */
    @Test
    public void testNeighbors1() {
        int[][] B = new int[5][5];
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
        int[][] B = new int[6][6];
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
     * neighbors(4,6) → 6
     */
    @Test
    public void testNeighbors4() {//edge case
        int[][] B = new int[18][11];
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
        GameOfLife gol = new GameOfLife(B);
        assertEquals(6,gol.neighbors(4,6));
    }

    /*
     * neighbors:
     * Test case 5:
     * neighbors(1,1) → 8
     */
    @Test
    public void testNeighbors5() {
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
     * Test case 6:
     * neighbors(0,3) → 3
     */
    @Test
    public void testNeighbors6() {
        int[][] B = new int[4][4];
        for(int i = 0; i < B.length; i++) {
            for(int j = 0; j < B.length; j++)
                B[i][j] = 1;
        }
        GameOfLife gol = new GameOfLife(B);
        assertEquals(3,gol.neighbors(0,3));
    }

    /*
    * oneStep:
    * Test case 1:
    * oneStep() →
     */
    @Test
    public void testOneStep1() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] B = {{1,0,1},{0,0,0},{1,0,1}};
        GameOfLife gol = new GameOfLife(A);
        gol.oneStep();
    }

    /*
     * oneStep:
     * Test case 2:
     * oneStep() →
     */
    @Test
    public void testOneStep2() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * oneStep:
     * Test case 3:
     * oneStep() →
     */
    @Test
    public void testOneStep3() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * oneStep:
     * Test case 4:
     * oneStep() →
     */
    @Test
    public void testOneStep4() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * oneStep:
     * Test case 5:
     * oneStep() →
     */
    @Test
    public void testOneStep5() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * evolution:
     * Test case 1:
     * evolution(1) →
     */
    @Test
    public void testEvolution1() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * evolution:
     * Test case 2:
     * evolution(1) →
     */
    @Test
    public void testEvolution2() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * evolution:
     * Test case 3:
     * evolution(1) →
     */
    @Test
    public void testEvolution3() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * evolution:
     * Test case 4:
     * evolution(1) →
     */
    @Test
    public void testEvolution4() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * evolution:
     * Test case 5:
     * evolution(1) →
     */
    @Test
    public void testEvolution5() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /********************************************************************
     * TorusGameOfLife tests
     * neighbors: 5 test cases
     * oneStep: 5 test cases
     * evolution: 5 test cases
     ********************************************************************
     ********************************************************************/

    /*
     * neighbors:
     * Test case 1:
     * neighbors(1,2) → 3
     */
    @Test
    public void testNeighborsT1() {
        int[][] B = new int[5][5];
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
    public void testNeighborsT2() {
        int[][] B = new int[6][6];
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
    public void testNeighborsT3() {
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
     * neighbors(4,6) → 6
     */
    @Test
    public void testNeighborsT4() {//edge case
        int[][] B = new int[18][11];
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
        GameOfLife gol = new GameOfLife(B);
        assertEquals(6,gol.neighbors(4,6));
    }

    /*
     * neighbors:
     * Test case 5:
     * neighbors(1,1) → 8
     */
    @Test
    public void testNeighborsT5() {
        int[][] B = new int[4][4];
        for(int i = 0; i < B.length; i++) {
            for(int j = 0; j < B.length; j++)
                B[i][j] = 1;
        }
        GameOfLife gol = new GameOfLife(B);
        assertEquals(8,gol.neighbors(1,1));
    }

    /*
     * oneStep:
     * Test case 1:
     * oneStep() →
     */
    @Test
    public void testOneStepT1() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        int[][] B = {{1,0,1},{0,0,0},{1,0,1}};
        GameOfLife gol = new GameOfLife(A);
        gol.oneStep();
    }

    /*
     * oneStep:
     * Test case 2:
     * oneStep() →
     */
    @Test
    public void testOneStepT2() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * oneStep:
     * Test case 3:
     * oneStep() →
     */
    @Test
    public void testOneStepT3() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * oneStep:
     * Test case 4:
     * oneStep() →
     */
    @Test
    public void testOneStepT4() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * oneStep:
     * Test case 5:
     * oneStep() →
     */
    @Test
    public void testOneStepT5() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * evolution:
     * Test case 1:
     * evolution(1) →
     */
    @Test
    public void testEvolutionT1() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * evolution:
     * Test case 2:
     * evolution(1) →
     */
    @Test
    public void testEvolutionT2() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * evolution:
     * Test case 3:
     * evolution(1) →
     */
    @Test
    public void testEvolutionT3() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * evolution:
     * Test case 4:
     * evolution(1) →
     */
    @Test
    public void testEvolutionT4() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }

    /*
     * evolution:
     * Test case 5:
     * evolution(1) →
     */
    @Test
    public void testEvolutionT5() {
        int[][] A = {{1,1,1},{1,1,1},{1,1,1}};
        GameOfLife gol = new GameOfLife(A);

    }


}//end class
