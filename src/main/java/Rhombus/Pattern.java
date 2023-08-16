package Rhombus;

public class Pattern {
    private int size;
    private String[][] matrix;

    public Pattern(int size) {
        this.setSize(size);
        this.setMatrix(new String[getSize()][getSize()]);
    }

    public void setSize(int size) {
        if (size < 6 || size > 80) {
            throw new IllegalArgumentException("Input should be number between 6 and 80 inclusive!");
        } else if (size % 2 != 0) {
            throw new IllegalArgumentException("Input should be number even number!");
        }

        this.size = size;
    }

    public void setMatrix(String[][] matrix) {
        this.matrix = matrix;
    }

    public int getSize() {
        return size;
    }

    public String[][] getMatrix() {
        return matrix;
    }
}
