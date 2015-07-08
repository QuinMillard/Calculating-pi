import java.util.*;
public class CalculatingPi {
	public static void main(String[] args){
		Scanner kbr = new Scanner(System.in);
		System.out.println("Welcome to Quin Millard's attempt to calculate pi. \nEnter the amount of points you would like to use to calculate pi: ");
		int n = kbr.nextInt();
		System.out.println("Enter the radius of the circle you would like to experiment with: ");
		double radius = kbr.nextInt();
		Random r = new Random();
		int circleArea = 0;
		for(int counter = 0; counter<n; counter++)
		{
			double x = r.nextDouble()*radius*2;
			double y = r.nextDouble()*radius*2;
			if (Math.sqrt(Math.pow(radius - x, 2) + Math.pow(radius - y, 2)) <= radius)
			{
				circleArea++;
			}
		}
		double pi = 1.0*circleArea/n * 4;
		System.out.println("Experimental pi is equal to " + pi);
		System.out.println("Error percentage: " + Math.abs(pi - 3.14159265258979323846264)/3.14159265258979323846264 * 100 + "%");
	}
}
