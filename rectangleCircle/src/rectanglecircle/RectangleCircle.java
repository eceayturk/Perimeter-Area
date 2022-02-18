
package rectanglecircle;
  
import java.util.Scanner;
public class RectangleCircle {


    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("    MENU\n"+"------------");
        System.out.println("1-Rectangle\n"+"2-Square\n"+"3-Circle\n"+"4-Exit");
        System.out.println("Enter your choice: ");

        int choice = scan.nextInt();
        System.out.println("Which operation do you want to calculate\n" +"For Area (A), For Perimeter (P):");

        switch (choice){
            case 1:
                Rectangle();
                break;
            case 2:
                break;
            case 3:
                Circle();
                break;
            case 4:
        }
    }
    public static void Rectangle(){
        Scanner scan = new Scanner(System.in);
        String choice1 = scan.next();

        switch (choice1){
            case "A" : rectangleArea();
                break;

            case "P" : rectanglePerimeter();
                break;
        }
    }
    public static void Circle(){
        Scanner scan = new Scanner(System.in);
        String choice1 = scan.next();

        switch (choice1){
            case "A" : circleArea();
                break;

            case "P" : circlePerimeter();
                break;
        }
    }
    public static void rectangleArea(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two sides of rectangle: ");
        
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();

        double area = side1*side2;
        System.out.println("Area of rectangle is : "+area);
    }
    public static void circleArea(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = scan.nextDouble();

        double area = Math.PI*radius*radius;
        System.out.printf("Area of circle is : %.2f ",area);

    }
    public static void rectanglePerimeter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two sides of rectangle: ");
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();

        double perimeter = 2*(side1+side2);
        System.out.println("Perimeter of the rectangle is : "+perimeter);

    }
    public static void circlePerimeter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = scan.nextDouble();

        double perimeter = 2*Math.PI*radius;
        System.out.printf("Perimeter of the circle is : %.2f " ,perimeter);

    }
}

