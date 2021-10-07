public class Rectangle {
    private double lth;
    private double wdt;
    private double area;

    public double getlth(){
        return lth;
    }

    public double getwdt(){
        return wdt;
    }

    public double getarea(){
        return lth*wdt;
    }

    public void setlth(double newlth){
        this.lth = newlth;
    }

    public void setwdt(double newwdt){
        this.wdt = newwdt;
    }

    public void setarea(double newarea){
        this.area = newarea;
    }


}
