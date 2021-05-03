package homework_17;

public class Display {
    int diagonal;
    String manufacturer;
    String matrixType;

    public Display(){
        this.diagonal = 20;
        this.manufacturer = "Acer";
        this.matrixType = "IPS";
    }
    public Display(int diagonal, String manufacturer, String matrixType){
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
        this.matrixType = matrixType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString(){
        return String.format("diagonal: %s; manufacturer: %s; matrixType: %s", this.diagonal, this.manufacturer, this.matrixType);
    }
}
