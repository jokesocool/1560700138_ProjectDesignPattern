import java.util.Scanner;

public class Circle {
	
    public double getArea() {
    	Scanner in = new Scanner(System.in);
    	double radius = in.nextDouble();
		double result = Math.PI * radius * radius;
		System.out.println("The Circle Area = " + result);
		return result;
        
    }
}