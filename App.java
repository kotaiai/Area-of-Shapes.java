import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Area of the Shapes");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("[1] Square");
        System.out.println("[2] Rectangle");
        System.out.println("[3] Triangle");
        System.out.println("[4] Circle");
        System.out.println(" ");
        System.out.print("Input your code here: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice){
            case 1: 
                Square square = new Square();
                System.out.print("Input the side of the square: ");
                square.setside(sc.nextDouble());
                System.out.println("The area of the square is " + square.getarea());
            break;
        }
    }
}
