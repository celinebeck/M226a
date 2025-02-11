import java.util.Scanner;
import java.util.InputMismatchException;
public class NumberException {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.print("Inserire il primo numero: ");
			int num1 = sc.nextInt();
			System.out.print("Inserire il secondo numero: ");
			int num2 = sc.nextInt();
			int risultato;
			risultato = num1/num2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Numero non valido: lo 0 al denominatore non e ammesso");
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Il valore inserito deve essere intero");
		}
	}
}