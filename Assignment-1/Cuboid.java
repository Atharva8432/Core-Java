import java.util.Scanner;
public class Cuboid{
	public static void main(String[] arge){
	int l,b,h,SA,v;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Length: ");
	l = sc.nextInt();
	
	System.out.println("Enter a breadth");
	b = sc.nextInt();

	System.out.println("Enter a height");
	h = sc.nextInt();
	
	SA =2*(l*b+l*h+b*h);
	v = l*b*h;
	
	System.out.println("Surface Area:"+SA);
	System.out.println("volume is:"+v);
	}
}
