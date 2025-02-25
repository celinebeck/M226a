//Celine Beck
//18.02.2025
//Es. 1
public class Differenza {
	public static void main(String[] args)
	{
		
		int sommPari = 0;
		int sommDispari = 0;
		int risultato = 0;
		
		for (int i = 0; i<args.length; i++)
		{
			if(Integer.parseInt(args[i])%2==0)
			{
				sommPari = sommPari + Integer.parseInt(args[i]);
			}
			else
			{
				sommDispari = sommDispari + Integer.parseInt(args[i]);
			}
		}
		if(sommPari<sommDispari)
		{
			risultato = sommDispari - sommPari;
			System.out.println( sommDispari+" - "+ sommPari + " = " + risultato);
		}
		else
		{
			risultato = sommPari - sommDispari;
			System.out.println( sommPari+" - "+ sommDispari + " = " + risultato);
		}

	}
}