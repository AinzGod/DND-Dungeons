public class Dungeon {
    private char[][] dungeonMatrix;

    public Dungeon(int rows, int cols) {
        dungeonMatrix = new char[rows][cols];
        // Inicializa la matriz con valores iniciales, por ejemplo, ' ' para espacios vacíos.
    }

    public void setCell(int row, int col, char value) {
        dungeonMatrix[row][col] = value;
    }

    public void printDungeon() {
        for (int i = 0; i < dungeonMatrix.length; i++) {
            for (int j = 0; j < dungeonMatrix[i].length; j++) {
                System.out.print(dungeonMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
