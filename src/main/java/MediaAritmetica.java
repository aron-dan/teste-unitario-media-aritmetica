import java.util.Scanner;

public class MediaAritmetica {
	
	Scanner sc = new Scanner(System.in);
	
	public double media() {
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double result = (n1 + n2)/2;
		return result;
	}

}
