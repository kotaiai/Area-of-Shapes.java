public class Triangle {
    private double height;
    private double base;
    private double area;

    public double getheight(){
        return height;
    }

    public double getbase(){
        return base;
    }

    public double getarea(){
        return (height*base)/2;
    }

    public void setheight(double newheight){
        this.height = newheight;
    }

    public void setbase(double newbase){
        this.base = newbase;
    }

    public void setarea(double newarea){
        this.area = newarea;
    }
}
