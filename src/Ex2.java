import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r, A;
		double p = 3.14159;
		
		System.out.println("Insira o valor do raio do circulo: ");
		r = sc.nextDouble();
		sc.nextLine();
		A = p * Math.pow(r, 2.0);
		System.out.println("O valor da área do circulo é de = " + A);
	
		sc.close();
				
	
	}

}
