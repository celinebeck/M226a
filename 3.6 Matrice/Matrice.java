public class Matrice {
	public static void main(String[] args)
	{
		int n =  Integer.parseInt(args[0]);
		int m =  Integer.parseInt(args[1]);
		int[][] matrice = new int[n][n];
		for (int i = 0; i < matrice.length; i++) 
		{
			for (int j = 0; j < matrice[i].length; j++) 
			{
				int x = (int)(Math.random() * m);
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