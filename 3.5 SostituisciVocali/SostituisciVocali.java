public class SostituisciVocali {
	public static void main(String[] args){
		String parolaUtente =  args[0];
		char trova = args[1].charAt(0);
		char sostituisci = args[2].charAt(0);
		String parolaMod = "";
		
		char[] arrayParola = new char[parolaUtente.length()];
		for (int i = 0; i< parolaUtente.length(); i++)
		{
			arrayParola[i] = parolaUtente.charAt(i);
		}
		for(int i = 0; i< arrayParola.length; i++)
		{
			char j = arrayParola[i];
			if(arrayParola[i] == trova )
			{
				j = sostituisci;
			}
			parolaMod = parolaMod + j;
		}
		System.out.println("La parola modificata è " + parolaMod);
	}
}