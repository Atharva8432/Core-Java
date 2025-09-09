import java.util.Scanner;
public class EmployeeSalary{
	public static void main(String[] args){
	int id;
	float bs,da,hra,tax;
	double homesalary;
	Scanner sc = new Scanner(System.in);

	System.out.println("-----Enter Emploee Detail------");
	System.out.println("ID");
	id = sc.nextInt();
	System.out.println("Basic salary:");
	bs = sc.nextInt();

	hra=bs*10/100;
	da =bs*30/100;
	tax= bs*5/100;

	homesalary= bs+hra+da-tax;

	System.out.println("Employee ID:"+id);
	System.out.println("Basic salary:"+bs);
	System.out.println("House Rent Allowance:"+hra);
	System.out.println("dearness allowance:"+da);
	System.out.println("tax:"+tax);
	System.out.println("home salary:"+homesalary);
	}
}

