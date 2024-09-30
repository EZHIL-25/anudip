import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Entre the p");
		double principal=sc.nextDouble();
		System.out.println("entre the r");
		double rate =sc.nextDouble();
		System.out.println("entre the t");
		double time =sc.nextDouble();
		
		double simpleInterst=( principal *rate*time)/100;
		System.out.println(simpleInterst);
		
		
		


	}

}
