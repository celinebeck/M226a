//Celine Beck
//18.02.2025
//Es. 2
import java.util.Scanner;
public class Matrice {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Dammi un numero: ");
		int n = sc.nextInt();

		int[][] matrice = new int[n][n];
		for (int i = 0; i < matrice.length; i++) 
		{
			for (int j = 0; j < matrice[i].length; j++) 
			{
				int x = i+j;
				matrice[i][j] = x;
			}
		}
		for (int i = 0; i < matrice.length; i++) 
		{
			for (int j = 0; j < matrice[i].length; j++) 
			{
			System.out.print(matrice[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
}