import java.util.Scanner;
public class ArithmaticAndHarmonicMean{
	public static void main(String[] arge){
	Scanner sc = new Scanner(System.in);
	
	int a,b;
	double AM,HM;

	System.out.println("Enter a two number :");
	a = sc.nextInt();
	b = sc.nextInt();

	AM = (a+b)/2;
	HM = a*b/(a+b);

	System.out.println("arithmetic mean is :"+AM);
	System.out.println("Harmonic mean: "+HM);
	}
}
