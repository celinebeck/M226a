//Celine Beck
//18.02.2025
//Es. 3
import java.util.Scanner;
public class GuessTheNumber {
	public static void main(String[] args)
	{
		int n = (int)(Math.random() * 30);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Indovina il numero che ho generato tra 1 e 30");
		int nUtente = 31;
		while(nUtente!=n)
		{
			nUtente = sc.nextInt();
			if(nUtente>n)
			{
				System.out.println("Piu piccolo");
			}
			if(nUtente<n)
			{
				System.out.println("Piu grande");
			}
		}
		if(nUtente==n)
		{
			System.out.println("Indovinato!");
		}
		
	}
}