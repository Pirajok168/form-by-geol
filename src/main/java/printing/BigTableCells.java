package printing;

public class BigTableCells implements SizeCells{

    int size;
    int textSize = 8;
    int rowSize = 5;

    public BigTableCells(int size){
        this.size = size;
    }

    public BigTableCells(int size, int textSize, int rowSize){
        this.size = size;
        this.textSize = textSize;
        this.rowSize = rowSize;
    }

    @Override
    public int getSizeCells() {
        return size;
    }

    @Override
    public int getSizeTextCells() {
        return textSize;
    }

    @Override
    public int defaultSize() {
        return rowSize;
    }
}
