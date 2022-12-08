public class Matrix22 {
    static int[][] genMatrix(int dimR, int dimS, int val){
        int[][] matrix = new int[dimR][dimS];
        for(int i = 0; i < matrix.length; i++){
            if(i == 0 || i == matrix.length-1){
                for(int j = 0; j < matrix[i].length; j++){
                    matrix[i][j] = val;
                }
            } else {
                matrix[i][0] = val;
                matrix[i][matrix.length-1] = val;
            }
        }
        return matrix;
    }

    static int[][] mixMatrix(int[][] m1, int[][] m2){
        int x1 = m1.length;
        int x2 = m2.length;
        int y1 = m1[0].length;
        int y2 = m2[0].length;

        int newX = 0;
        int newY = 0;

        if(x1 < x2) newX = x2;
        else newX = x1;
        if(y1 < y2) newY = y2;
        else newY = y1;

        int[][] matrix = new int[newX][newY];

        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[j].length;j++){
                int candidate = 0;
                if(i < m1.length && j < m1[i].length){
                    candidate += m1[i][j];
                }
                if(i < m2.length && j < m2[i].length){
                    candidate += m2[i][j];
                }
                matrix[i][j] = candidate;
            }
        }
        return matrix;
    }

    static void exChangeCol(int[][] m1, int c1, int c2){
        int[] temp = m1[c1];
        m1[c1] = m1[c2];
        m1[c2] = temp;
    }

    static void fillRand(int[][] m){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                m[i][j] = (int)(100*Math.random());
            }
        }
    }
}
