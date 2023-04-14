package Lab1;
import java.util.Scanner;
import java.lang.Math;
public class EquationSolver {
    public static void LinearEquation(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the coefficient of x: ");
        double a = inp.nextDouble();
        System.out.print("Enter the const: ");
        double b = inp.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solutions.");
            }
        } else {
            double x = -b / a;
            System.out.println("The solution is x = " + x);
        }
    }

    public static void LinearSystemEquation(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter x and y for the first equation: ");
        double a1 = inp.nextDouble();
        double b1 = inp.nextDouble();
        double c1 = inp.nextDouble();
        System.out.print("Enter x and y for the second equation: ");
        double a2 = inp.nextDouble();
        double b2 = inp.nextDouble();
        double c2 = inp.nextDouble();
        double det = a1 * b2 - a2 * b1;
        if(det == 0){
            if(c1 == c2){
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;
            System.out.println("x = " + x + " and y = " + y);
        }
    }

    public static void Second_degreeEquation(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the coefficient of x^2: ");
        double a = inp.nextDouble();
        System.out.print("Enter the coefficient of x: ");
        double b = inp.nextDouble();
        System.out.print("Enter the const: ");
        double c = inp.nextDouble();
        double delta = b * b - 4*a*c;
        if(delta < 0){
            System.out.println("No real solution.");
        } else if(delta == 0){
            double x = -b / (2*a);
            System.out.println("The solution is x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("The Solutions are x1 = " + x1 + " and x2 = " + x2);
        }
    }

    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.println("Your choice? ");
        System.out.println("1. First-degree equation");
        System.out.println("2. System of linear equations");
        System.out.println("3. Second-degree equation");

        int choice = inp.nextInt();
        switch (choice){
            case 1: LinearEquation(); break;
            case 2: LinearSystemEquation(); break;
            case 3: Second_degreeEquation(); break;
            default: System.out.println("Invalid choice.");
        }
    }
}
