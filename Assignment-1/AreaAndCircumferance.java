import java.util.Scanner;
public class AreaAndCircumferance{
	public static void main(String[] args){
		double radius,area,circumferance;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Radius of circle:");
		radius=sc.nextDouble();

		area=Math.PI*radius*radius;
		System.out.println("Area of circle is:"+area);

		circumferance=2*Math.PI*radius;
		System.out.println("Circumferance of circle is: "+circumferance);
	}
}
	