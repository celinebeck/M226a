public class ArrayNumeri {
	public static void main(String[] args){
		String parolaUtente =  args[0];
		char[] arrayParola = new char[parolaUtente.length()];
		int[] numeri = new int[6];
		for(int i = 0; i<=6; i++)
		{
			numeri[i] =Integer.parseInt(args[i]);
		}
		int conta = 0;
		for(int j = 0; j<numeri.length; j++)
		{
			if(numeri[j]== 0)
			{
				conta++;
			}
		}
		System.out.println("Lo zero è presente " + conta + " volte");
		
	}
}