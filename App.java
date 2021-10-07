import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {

        int choice = 0;
        do{
            System.out.println("Area of the Shapes");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("[1] Square");
            System.out.println("[2] Rectangle");
            System.out.println("[3] Triangle");
            System.out.println("[4] Circle");
            System.out.println(" ");
            System.out.print("Input your choice here: ");
            Scanner sc = new Scanner(System.in);
            
            choice = sc.nextInt();
        
            switch(choice){
                case 1: 
                    Square square = new Square();
                    System.out.println("<S Q U A R E>");
                    System.out.println(" ");
                    System.out.print("Input the side of the square: ");
                    square.setside(sc.nextDouble());
                    System.out.println(" ");
                    System.out.println("The area of the square is " + square.getarea());
                    Thread.sleep(2000);
                break;

                case 2: 
                    Rectangle rec = new Rectangle();
                    System.out.println("<R E C T A N G L E>");
                    System.out.println(" ");
                    System.out.print("Input the length of the rectangle: ");
                    rec.setlth(sc.nextDouble());
                    System.out.println(" ");
                   System.out.print("Input the width of the rectangle: ");
                    rec.setwdt(sc.nextDouble());
                    System.out.println(" ");
                    System.out.println("The area of the rectangle is " + rec.getarea());
                    Thread.sleep(2000);
                break;

                case 3: 
                    Triangle tri = new Triangle();
                    System.out.println("<T R I A N G L E>");
                    System.out.println(" ");
                    System.out.print("Input the height of the triangle: ");
                    tri.setheight(sc.nextDouble());
                    System.out.println(" ");
                    System.out.print("Input the base of the triangle: ");
                    tri.setbase(sc.nextDouble());
                    System.out.println(" ");
                    System.out.println("The area of the triangle is " + tri.getarea());
                    Thread.sleep(2000);
                break;

                case 4: 
                    Circle cir = new Circle();
                    System.out.println("<C I R C L E>");
                    System.out.println(" ");
                    System.out.print("Input the radius of the circle: ");
                    cir.setradius(sc.nextDouble());
                    System.out.println(" ");
                    cir.setPI(3.141592653589793);
                    System.out.println("The area of the circle is " + cir.getarea());
                    Thread.sleep(2000);
                break;

                default:
                    System.out.println("<I N V A L I D   I N P U T>");
                    Thread.sleep(2000);
                break;
                 
            }
        }while(choice > 0 && choice <5);
    }
}
