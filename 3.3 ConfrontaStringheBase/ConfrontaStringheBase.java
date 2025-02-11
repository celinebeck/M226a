public class ConfrontaStringheBase {
	public static void main(String[] args){
		String parola1 =  args[0];
		String parola2 =  args[1];
		char[] arrayParola1 = new char[parola1.length()];
		char[] arrayParola2 = new char[parola2.length()];
		
		if(parola1.length() != parola2.length())
		{
			System.out.println("Le due parole sono diverse");
		}
		else{
		for (int i = 0; i< parola1.length(); i++)
		{
			arrayParola1[i] = parola1.charAt(i);
		}
		
		for (int i2 = 0; i2< parola2.length(); i2++)
		{
			arrayParola2[i2] = parola2.charAt(i2);
		}
		
		int conta = 0;
		
		for(int j = 0; j< arrayParola1.length; j++)
		{
			if(arrayParola1[j] != arrayParola2[j])
			{
				conta++;
			}
		}
		if(conta == 0)
		{
			System.out.println("Le due parole sono uguali");
		}
		else
		{
			System.out.println("Le due parole sono diverse");
		}
		}
	}
}