import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("Entre com quatro valores: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = (A * B) - (C * D);
		
		System.out.println("A diferença entre os produtos é de = " + diferenca);

		sc.close();
		
	}

}
