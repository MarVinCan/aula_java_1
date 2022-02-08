import java.util.Locale;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
	
	System.out.println("Entre com um valor A com casas decimais:");
	A = sc.nextDouble();
	System.out.println("Entre com um valor B com casas decimais:");
	B = sc.nextDouble();
	System.out.println("Entre com um valor C com casas decimais:");
	C = sc.nextDouble();
	
	triangulo = (A * C)/ 2.0;
	circulo = 3.14159 * (Math.pow(C,2.0));
	trapezio = ((A + B) * C)/ 2.0;
	quadrado = Math.pow(B, 2.0);
	retangulo = A * B;
	
	System.out.printf("triangulo: %.3f %n", triangulo);
	System.out.printf("circulo: %.3f %n", circulo);
	System.out.printf("trapezio: %.3f %n", trapezio);
	System.out.printf("quadrado: %.3f %n", quadrado);
	System.out.printf("retangulo: %.3f %n", retangulo);
	
	sc.close();

	}

}
