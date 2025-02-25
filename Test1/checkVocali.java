//Celine Beck
//18.02.2025
//Es. 4
public class checkVocali {
	public static void main(String[] args)
	{
		String parolaUtente = args[0].toLowerCase();
		int[] check = new int[5]; 
		int checkDelCheck = 0;
		for(int i = 0; i<parolaUtente.length(); i++)
		{
			if(parolaUtente.charAt(i) == 'a')
			{
				check[0] = 1;
			}
			else if(parolaUtente.charAt(i) == 'e')
			{
				check[1] = 1;
			}
			else if(parolaUtente.charAt(i) == 'i')
			{
				check[2] = 1;
			}
			else if(parolaUtente.charAt(i) == 'o')
			{
				check[3] = 1;
			}
			else if(parolaUtente.charAt(i) == 'u')
			{
				check[4] = 1;
			}
		}
		for(int i = 0; i<check.length; i++)
		{
			if(check[i]==1)
			{
				checkDelCheck++;
			}
		}
		if(checkDelCheck==5)
		{
			System.out.println("true");	
		}
		else
		{
			System.out.println("false");	
		}
				
	}
}