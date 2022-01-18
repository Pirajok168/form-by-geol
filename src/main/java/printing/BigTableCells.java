package printing;

public class BigTableCells implements SizeCells{

    int size;

    public BigTableCells(int size){
        this.size = size;
    }

    @Override
    public int getSizeCells() {
        return size;
    }
}
