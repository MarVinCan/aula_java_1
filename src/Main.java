import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
		
			int x, y, A;
			
			System.out.println("Entre com 2 numeros para serem somados");
			
			x = sc.nextInt();
			sc.nextLine();
			y = sc.nextInt();
			sc.nextLine();
			
			A = x + y;
			System.out.println("A soma de " + x + " e " + y + " é de = " + A);

		
			sc.close();
			
		
		
	}

	
	
	
	
}
