public class StampaVocali {
	public static void main(String[] args){
		String parolaUtente =  args[0];
		char[] arrayParola = new char[parolaUtente.length()];
		for (int i = 0; i< parolaUtente.length(); i++)
		{
			arrayParola[i] = parolaUtente.charAt(i);
		}
		for(int i = 0; i< arrayParola.length; i++)
		{
			if(arrayParola[i] == 'a' ||arrayParola[i] == 'e' ||arrayParola[i] == 'i' ||arrayParola[i] == 'o' ||arrayParola[i] == 'u')
			{
				System.out.print(arrayParola[i] + " ");
			}
		}
	}
}