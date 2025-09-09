import java.util.Scanner;
public class temperature{
	public static void main(String[] arge){
	double F,C,K;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter temp in ferenheit :");
	
	F = sc.nextDouble();
	C=(5.0/9)*(F-32);
	K=C+273.15;

	System.out.println("ferenhit temp is : "+F);
	System.out.println("Celcius temp is : "+C);
	System.out.println("Kelvin temp is : "+K);
	}
}