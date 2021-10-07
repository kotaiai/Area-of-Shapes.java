public class Square {
    private double side;
    private double area;

    public double getside() {
        return side;
    }

    public double getarea() {
        return side * side;
    }
    
    public void setside(double newside) {
        this.side = newside;
    }

    public void setarea(double newarea) {
        this.area = newarea;
      }
}
