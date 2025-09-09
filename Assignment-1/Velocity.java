import java.util.Scanner;
public class Velocity{
	
	public static void main(String[] arge){
	double u,a,t,v,s;

	Scanner sc = new Scanner(System.in);
	System.out.println("enter initial velocity: ");
	u = sc.nextDouble();
	
	
	System.out.println("enter acceleration: ");
	a = sc.nextDouble();

	System.out.println("enter time: ");
	t = sc.nextDouble();

	v = u + a*t;
	s = u + a*t*a*t;

	System.out.println("final velocity is: "+v);
	System.out.println("distance travelled: "+s);
	}
}
	
	
	