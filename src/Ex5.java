import java.util.Locale;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int p1, p2, q1, q2;
		double v1, v2, valorPagar;
		
		p1 = sc.nextInt();
		q1 = sc.nextInt();
		v1 = sc.nextDouble();
		p2 = sc.nextInt();
		q2 = sc.nextInt();
		v2 = sc.nextDouble();
		
		valorPagar = (q1 * v1) + (q2 * v2);
		
		System.out.println("VALOR A PAGAR = R$ " + valorPagar);
		
		sc.close();
		
	}

}
