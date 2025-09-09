import java.util.Scanner;
public class InterChange{
	public static void main(String[] args){
	
	int a,b;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter fitst number: ");
	a = sc.nextInt();
	System.out.println("Enter Second Number:");
	b = sc.nextInt();

	System.out.println("Using + and -");

	System.out.println("Before interchange");
	System.out.println("a="+a);
	System.out.println("b="+b);

	a=a+b;
	b=a-b;
	a=a-b;

	System.out.println("After interchange: ");

	System.out.println("a="+a);
	System.out.println("b="+b);
	
	System.out.println("Using * and /");

	System.out.println("Before inter change:");
	System.out.println("a="+a);
	System.out.println("b="+b);

	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("After interchange:");

	System.out.println("a="+a);
	System.out.println("b="+b);
	}
}